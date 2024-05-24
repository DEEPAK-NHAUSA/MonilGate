package com.nht.moniwebsvc.util;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppendFile {
	public boolean AppendData(String fileName, String data){
		
		boolean executeflag = true;
		String path = Global.log_location;
		String file = "";
		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String today = format.format(now);
		
		if (Global.send_file_name.equals(fileName)) {
		} else { // Receipe File (add yyyyMMdd folder)
			path = path + today + "/";
		}
		file = path + fileName + "." + today;
		
		try {
			
			File fd = new File(path);
	        if(!fd.exists()) {    //check directory, if not exist then create folder automatically
	            fd.mkdirs();
           }
			
			File f = new File(file);
			
			//if file doesnt exists, then create file
			if(!f.exists()){
				f.createNewFile();
			}

			// create log text
			SimpleDateFormat logFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String logDate = "[ " + logFormat.format(now)+ " ]";
			
			//true = append file
			FileWriter fileWritter = new FileWriter(file,true);
	        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
	        bufferWritter.newLine();
	        bufferWritter.write(logDate);
	        bufferWritter.newLine();
	        bufferWritter.write(data);
			bufferWritter.close();
			fileWritter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			executeflag = false;
		}
		return executeflag;
	}

	public boolean ReceiveFile(String fileName, String data){

		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HHmmssSSS");
		String file = fileName + "_" + format.format(now);

		return AppendData(file, data);
	}

	public boolean ReceiveFileCust(Integer custId, String fileName, String data){

		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HHmmssSSS");
		String file = Integer.toString(custId)+"_"+fileName + "_" + format.format(now);

		return AppendData(file, data);
	}
	
	public boolean SendFile(String fileName, String data){
		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HHmmssSSS");
		String file = fileName + "_" + format.format(now);		
		
		return AppendData(file, data);
	}
}