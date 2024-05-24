package com.nht.moniwebsvc.util;


import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class DeleteLogFile {

	private Log logger = LogFactory.getLog(getClass());
	
	public void deleteServerLogFile(int delTerm){
		
		String logPath = "c:/eagle/mm_server_log/";
		
		File path = new File(logPath); 
		Calendar cal = Calendar.getInstance();
		String[] fileList = path.list();
		List<String> delList = new Vector<String>();

		for(String tempfile : fileList ){

			String[] splitArray = tempfile.split("log");
			if(splitArray.length == 2){
				String[] yymmdd = splitArray[1].split("-");
				if(yymmdd.length == 3){
					int nowDay = ((cal.get(Calendar.YEAR)*12*30) + ((cal.get(Calendar.MONTH)+1)*30) + cal.get(Calendar.DATE));
					int checkDay = ((Integer.parseInt(yymmdd[0].substring(1))*12*30) + (Integer.parseInt(yymmdd[1])*30) + Integer.parseInt(yymmdd[2]));

					/* deleteTerm 일 차이가 나면 delList에 저장 그 외는 에러*/
					if((nowDay - checkDay) > (delTerm - 1)){
						delList.add(tempfile);
						logger.debug("===================> delete log file " + tempfile);
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(String list : delList){
			File delFile = new File(logPath+File.separatorChar+list);
			delFile.delete();
			sb.append(list+"\n");
		} //End Of for
	}
	
	public void deleteWebServiceServerLogFile(int delTerm){
		
		String logPath = Global.server_log_location;
		try {
			File path = new File(logPath); 
			Calendar cal = Calendar.getInstance();
			String[] fileList = path.list();
			List<String> delList = new Vector<String>();
	
			for(String tempfile : fileList ){
	
				String[] splitArray = tempfile.split("log");
				if(splitArray.length == 2){
					String[] yymmdd = splitArray[1].split("-");
					if(yymmdd.length == 3){
						int nowDay = ((cal.get(Calendar.YEAR)*12*30) + ((cal.get(Calendar.MONTH)+1)*30) + cal.get(Calendar.DATE));
						int checkDay = ((Integer.parseInt(yymmdd[0].substring(1))*12*30) + (Integer.parseInt(yymmdd[1])*30) + Integer.parseInt(yymmdd[2]));
						/* deleteTerm 일 차이가 나면 delList에 저장 그 외는 에러*/
						if((nowDay - checkDay) > (delTerm - 1)){
							delList.add(tempfile);
							logger.debug("===================> delete server log file " + tempfile);
						}
					}
				}
			}
	
			StringBuilder sb = new StringBuilder();
			for(String list : delList){
				File delFile = new File(logPath+File.separatorChar+list);
				delFile.delete();
				sb.append(list+"\n");
			} //End Of for
		} catch (Exception e) {
			logger.error("deleteWebServiceServerLogFile error",e);
		}
	}
	
	public void deleteWebServiceInterfaceLogFile(int delTerm){
		
		String logPath = Global.log_location;
		try {
			File path = new File(logPath); 
			Calendar cal = Calendar.getInstance();
			String[] fileList = path.list();
			List<String> delList = new Vector<String>();
	
			for(String tempfile : fileList ){
	
				String[] splitArray = tempfile.split("log");
				if(splitArray.length == 2){
					String[] yymmdd = splitArray[1].split("-");
					if(yymmdd.length == 3){
						int nowDay = ((cal.get(Calendar.YEAR)*12*30) + ((cal.get(Calendar.MONTH)+1)*30) + cal.get(Calendar.DATE));
						int checkDay = ((Integer.parseInt(yymmdd[0].substring(1))*12*30) + (Integer.parseInt(yymmdd[1])*30) + Integer.parseInt(yymmdd[2]));
						/* deleteTerm 일 차이가 나면 delList에 저장 그 외는 에러*/
						if((nowDay - checkDay) > (delTerm - 1)){
							delList.add(tempfile);
							logger.debug("===================> delete interface log file " + tempfile);
						}
					}
				}
			}
	
			StringBuilder sb = new StringBuilder();
			for(String list : delList){
				File delFile = new File(logPath+File.separatorChar+list);
				delFile.delete();
				sb.append(list+"\n");
			} //End Of for
		} catch (Exception e) {
			logger.error("deleteWebServiceServerLogFile error",e);
		}
	}
	
}