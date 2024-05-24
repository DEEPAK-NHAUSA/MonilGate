package com.nht.moniwebsvc.common;

public class CellRange {
	
	public final int from;
	public final int to;
	
	public CellRange(int from, int to) {
		this.from = from;
		this.to = to;
	}
	
	public static CellRange create(int from, int to) {
		return new CellRange(from, to);
	}
	
	public static CellRange create(int position) {
		return new CellRange(position, position);
	}
}
