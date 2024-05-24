package com.nht.moniwebsvc.common;


/** 
* @FileName : RunSkipException.java 
* @Project : MMWebSvc 
* @Date : 2016. 11. 17. 
* @작성자 : user 
* @변경이력 : 
* @프로그램 설명 : T_ATOMCONFIG CFG_NAME값에 따라 웹 내부처리를 SKIP처리하기 위한 Exception 
*/
public class RunSkipException extends Exception{
	
	/**  */
	private static final long serialVersionUID = -6475141060443818289L;

	private String message;
	
	public RunSkipException(){
	}
	public RunSkipException(Exception e){
		this.message = e.getMessage();
	}
	/**
	 * @param method 
	 * @param message
	 */
	public RunSkipException(String message){
		this.message = message;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#toString()
	 */
	public String getMessage(){
		return message.toString(); 
	}
	
}
