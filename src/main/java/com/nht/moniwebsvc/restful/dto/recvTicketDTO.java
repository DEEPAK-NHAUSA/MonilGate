package com.nht.moniwebsvc.restful.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class recvTicketDTO {
	
	@JsonProperty("IF_NO")
	private String IF_NO="";
	@JsonProperty("RECV_DATE")
	private String RECV_DATE="";
	@JsonProperty("RECV_DATE_TEXT")
	private String RECV_DATE_TEXT="";
	@JsonProperty("RECV_TIME_TEXT")
	private String RECV_TIME_TEXT="";
	@JsonProperty("TN_NO")
	private String TN_NO="";
	@JsonProperty("VENDER_TICKETID")
	private String VENDER_TICKETID="";
	@JsonProperty("TERM_ID")
	private String TERM_ID="";
	@JsonProperty("VENDER_CD")
	private String VENDER_CD="";
	@JsonProperty("VENDOER_PHONE_NO")
	private String VENDOER_PHONE_NO="";
	@JsonProperty("RESPONSE_DATE")
	private String RESPONSE_DATE="";
	@JsonProperty("DEPARTURE_DATE")
	private String DEPARTURE_DATE="";
	@JsonProperty("ARRIVAL_DATE")
	private String ARRIVAL_DATE="";
	@JsonProperty("COMPLETE_DATE")
	private String COMPLETE_DATE="";
	@JsonProperty("ACTION")
	private String ACTION="";
	public String getIF_NO() {
		return IF_NO;
	}
	public void setIF_NO(String iF_NO) {
		IF_NO = iF_NO;
	}
	public String getRECV_DATE() {
		return RECV_DATE;
	}
	public void setRECV_DATE(String rECV_DATE) {
		RECV_DATE = rECV_DATE;
	}
	public String getRECV_DATE_TEXT() {
		return RECV_DATE_TEXT;
	}
	public void setRECV_DATE_TEXT(String rECV_DATE_TEXT) {
		RECV_DATE_TEXT = rECV_DATE_TEXT;
	}
	public String getRECV_TIME_TEXT() {
		return RECV_TIME_TEXT;
	}
	public void setRECV_TIME_TEXT(String rECV_TIME_TEXT) {
		RECV_TIME_TEXT = rECV_TIME_TEXT;
	}
	public String getTN_NO() {
		return TN_NO;
	}
	public void setTN_NO(String tN_NO) {
		TN_NO = tN_NO;
	}
	public String getVENDER_TICKETID() {
		return VENDER_TICKETID;
	}
	public void setVENDER_TICKETID(String vENDER_TICKETID) {
		VENDER_TICKETID = vENDER_TICKETID;
	}
	public String getTERM_ID() {
		return TERM_ID;
	}
	public void setTERM_ID(String tERM_ID) {
		TERM_ID = tERM_ID;
	}
	public String getVENDER_CD() {
		return VENDER_CD;
	}
	public void setVENDER_CD(String vENDER_CD) {
		VENDER_CD = vENDER_CD;
	}
	public String getVENDOER_PHONE_NO() {
		return VENDOER_PHONE_NO;
	}
	public void setVENDOER_PHONE_NO(String vENDOER_PHONE_NO) {
		VENDOER_PHONE_NO = vENDOER_PHONE_NO;
	}
	public String getRESPONSE_DATE() {
		return RESPONSE_DATE;
	}
	public void setRESPONSE_DATE(String rESPONSE_DATE) {
		RESPONSE_DATE = rESPONSE_DATE;
	}
	public String getDEPARTURE_DATE() {
		return DEPARTURE_DATE;
	}
	public void setDEPARTURE_DATE(String dEPARTURE_DATE) {
		DEPARTURE_DATE = dEPARTURE_DATE;
	}
	public String getARRIVAL_DATE() {
		return ARRIVAL_DATE;
	}
	public void setARRIVAL_DATE(String aRRIVAL_DATE) {
		ARRIVAL_DATE = aRRIVAL_DATE;
	}
	public String getCOMPLETE_DATE() {
		return COMPLETE_DATE;
	}
	public void setCOMPLETE_DATE(String cOMPLETE_DATE) {
		COMPLETE_DATE = cOMPLETE_DATE;
	}
	public String getACTION() {
		return ACTION;
	}
	public void setACTION(String aCTION) {
		ACTION = aCTION;
	}
	@Override
	public String toString() {
		return "recvTicketDTO [IF_NO=" + IF_NO + ", RECV_DATE=" + RECV_DATE + ", RECV_DATE_TEXT=" + RECV_DATE_TEXT
				+ ", RECV_TIME_TEXT=" + RECV_TIME_TEXT + ", TN_NO=" + TN_NO + ", VENDER_TICKETID=" + VENDER_TICKETID
				+ ", TERM_ID=" + TERM_ID + ", VENDER_CD=" + VENDER_CD + ", VENDOER_PHONE_NO=" + VENDOER_PHONE_NO
				+ ", RESPONSE_DATE=" + RESPONSE_DATE + ", DEPARTURE_DATE=" + DEPARTURE_DATE + ", ARRIVAL_DATE="
				+ ARRIVAL_DATE + ", COMPLETE_DATE=" + COMPLETE_DATE + ", ACTION=" + ACTION + "]";
	}
	
	
		
}
