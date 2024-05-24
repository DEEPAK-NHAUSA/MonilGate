package com.nht.moniwebsvc.restful.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MMrecvTicketDTO {

	@JsonProperty("CustomerId")
//	private int CustomerId = 0;
	private String CustomerId = "";
	@JsonProperty("TicketId")
	private String TicketId ="";
	@JsonProperty("TermId")
	private String TermId ="";
	@JsonProperty("StartDateTime")
//		private Date StartDateTime =new Date();
	private String StartDateTime = "";
	@JsonProperty("StatusCode")
	private String StatusCode ="";
	@JsonProperty("FaultCode")
	private String FaultCode = "";
	@JsonProperty("FaultCodeDescription")
	private String FaultCodeDescription = "";
	@JsonProperty("Comments")
	private String Comments = "";
	@JsonProperty("TicketStatus")
	private String TicketStatus ="";
	@JsonProperty("FaultCodeComponent")
	private String FaultCodeComponent = "";
	@JsonProperty("NativeMessage")
	private String NativeMessage = " ";
	@JsonProperty("ProcFlag")
	private String ProcFlag = "N";
	@JsonProperty("ErrCode")
	private String ErrCode = "";
	@JsonProperty("TicketText")
	private String TicketText = "";
	@JsonProperty("ChaseMsg")
	private String ChaseMsg = "";

	public String getChaseMsg() {
		return ChaseMsg;
	}

	public void setChaseMsg(String chaseMsg) {
		ChaseMsg = chaseMsg;
	}

	public String getTicketText() {
		return TicketText;
	}

	public void setTicketText(String ticketText) {
		TicketText = ticketText;
	}
//
//	public int getCustomerId() {
//		return CustomerId;
//	}
	public String getCustomerId() {
		return CustomerId;
	}

	public String getTicketId() {
		return TicketId;
	}

	public String getTermId() {
		return TermId;
	}

	public String getStartDateTime() {
		return StartDateTime;
	}

	public String getStatusCode() {
		return StatusCode;
	}

	public String getFaultCode() {
		return FaultCode;
	}

	public String getFaultCodeDescription() {
		return FaultCodeDescription;
	}

	public String getComments() {
		return Comments;
	}

	public String getTicketStatus() {
		return TicketStatus;
	}

	public String getFaultCodeComponent() {
		return FaultCodeComponent;
	}

	public String getNativeMessage() {
		return NativeMessage;
	}

	public String getProcFlag() {
		return ProcFlag;
	}

	public String getErrCode() {
		return ErrCode;
	}

//	public void setCustomerId(int customerId) {
//		CustomerId = customerId;
//	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public void setTicketId(String ticketId) {
		TicketId = ticketId;
	}

	public void setTermId(String termId) {
		TermId = termId;
	}

	public void setStartDateTime(String startDateTime) {
		StartDateTime = startDateTime;
	}

	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}

	public void setFaultCode(String faultCode) {
		FaultCode = faultCode;
	}

	public void setFaultCodeDescription(String faultCodeDescription) {
		FaultCodeDescription = faultCodeDescription;
	}

	public void setComments(String comments) {
		Comments = comments;
	}

	public void setTicketStatus(String ticketStatus) {
		TicketStatus = ticketStatus;
	}

	public void setFaultCodeComponent(String faultCodeComponent) {
		FaultCodeComponent = faultCodeComponent;
	}

	public void setNativeMessage(String nativeMessage) {
		NativeMessage = nativeMessage;
	}

	public void setProcFlag(String procFlag) {
		ProcFlag = procFlag;
	}

	public void setErrCode(String errCode) {
		ErrCode = errCode;
	}

	@Override
	public String toString() {
		return "MMrecvTicketDTO{" +
				"CustomerId=" + CustomerId +
				", TicketId='" + TicketId + '\'' +
				", TermId='" + TermId + '\'' +
				", StartDateTime='" + StartDateTime + '\'' +
				", StatusCode='" + StatusCode + '\'' +
				", FaultCode='" + FaultCode + '\'' +
				", FaultCodeDescription='" + FaultCodeDescription + '\'' +
				", Comments='" + Comments + '\'' +
				", TicketStatus='" + TicketStatus + '\'' +
				", FaultCodeComponent='" + FaultCodeComponent + '\'' +
				", NativeMessage='" + NativeMessage + '\'' +
				", ProcFlag='" + ProcFlag + '\'' +
				", ErrCode='" + ErrCode + '\'' +
				", TicketText='" + TicketText + '\'' +
				'}';
	}
}
