package com.nht.moniwebsvc.restful.dto;

public class InputResult {
	private Boolean ResponseCode;
	private String ResponseMessage;
	public Boolean getResponseCode() {
		return ResponseCode;
	}
	public void setResponseCode(Boolean responseCode) {
		ResponseCode = responseCode;
	}
	public String getResponseMessage() {
		return ResponseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		ResponseMessage = responseMessage;
	}
	@Override
	public String toString() {
		return "InputResult [ResponseCode=" + ResponseCode + ", ResponseMessage=" + ResponseMessage + "]";
	}
	
}
