package com.nht.moniwebsvc.common;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.util.Date;

public class ExcelUtils {
	
	

	public enum ExcelVersion {
		XLS("xls"),
		XLSX("xlsx");
		
		private String ext;
		
		ExcelVersion(String ext) {
			this.ext = ext;
		}
		
		public String getExt() {
			return ext;
		}
	}
	
	public static Workbook createWorbook(ExcelVersion version) {
		if (version == ExcelVersion.XLS) {
			return new HSSFWorkbook();
		} else {
			return new SXSSFWorkbook(1000);
		}
	}
	
	public static Row getRow(Sheet sheet, int rownum) {
		Row row = sheet.getRow(rownum);
		if (row == null) {
			row = sheet.createRow(rownum);
		}
		
		return row;
	}
	
	public static Cell getCell(Row row, int colnum) {
		Cell cell = row.getCell(colnum);
		if (cell == null) {
			cell = row.createCell(colnum);
		}
		
		return cell;
	}
	
	public static Cell getCell(Sheet sheet, int rownum, int colnum) {
		Row row = ExcelUtils.getRow(sheet, rownum);
		
		return ExcelUtils.getCell(row, colnum);
	}
	
	public static CellStyle headerStyle(Workbook workbook) {
		Font font = workbook.createFont();
		font.setBold(true);
		font.setFontHeightInPoints((short) 14);
		
		CellStyle style = workbook.createCellStyle();
		style.setFont(font);
		style.setAlignment(HorizontalAlignment.CENTER);
		style.setVerticalAlignment(VerticalAlignment.CENTER);
		
		return style;
	}
	
	public static void setCellValue(Cell cell, Double value) {
		if (value != null) {
			cell.setCellValue(value);
		}
	}
	
	public static void setCellValue(Cell cell, String value) {
		if (value != null) {
			cell.setCellValue(value);
		}
	}
	
	public static void setCellValue(Cell cell, Integer value) {
		if (value != null) {
			cell.setCellValue(value);
		}
	}
	
	public static void setCell(Sheet sheet, int startRow, int endRow, int startCol, int endCol, Object cellValue, CellStyle cellStyle) {
		
		Cell cell = ExcelUtils.getCell(sheet, startRow, startCol);

		// Cell Value 설정
		if (cellValue == null) {
			// 아무것도 하지 않음.
		} else if (cellValue instanceof Double) {
			cell.setCellValue((Double) cellValue);
		} else if (cellValue instanceof Float) {
			cell.setCellValue((Float) cellValue);
		} else if (cellValue instanceof Long) {
			cell.setCellValue((Long) cellValue);
		} else if (cellValue instanceof Integer) {
			cell.setCellValue((Integer) cellValue);
		} else if (cellValue instanceof String) {
			cell.setCellValue((String) cellValue);
		} else if (cellValue instanceof Date) {
			cell.setCellValue((Date) cellValue);
		} 
		
		// Cell Style 설정
		if (cellStyle != null) {
			cell.setCellStyle(cellStyle);
		}
		
		// Cell Merging 설정
		if (endRow != startRow || endCol != startCol) {
			sheet.addMergedRegion(new CellRangeAddress(startRow, endRow, startCol, endCol));
			
			for (int rowIdx = startRow; rowIdx <= endRow; rowIdx++) {
				for (int colIdx = startCol; colIdx <= endCol; colIdx++) {
					cell = ExcelUtils.getCell(sheet, rowIdx, colIdx);
					cell.setCellStyle(cellStyle);
				}
			}
		}
		
	}
	
	public static void setCell(Sheet sheet, int row, int col, Object cellValue, CellStyle cellStyle) {
		setCell(sheet, row, row, col, col, cellValue, cellStyle);
	}
	
	public static void setCell(Sheet sheet, int row, CellRange colRange, Object cellValue, CellStyle cellStyle) {
		setCell(sheet, row, row, colRange.from, colRange.to, cellValue, cellStyle);
	}
	
	public static void setCell(Sheet sheet, CellRange rowRange, int col, Object cellValue, CellStyle cellStyle) {
		setCell(sheet, rowRange.from, rowRange.to, col, col, cellValue, cellStyle);
	}
	
	public static void setCell(Sheet sheet, CellRange rowRange, CellRange colRange, Object cellValue, CellStyle cellStyle) {
		setCell(sheet, rowRange.from, rowRange.to, colRange.from, colRange.to, cellValue, cellStyle);
	}
}
