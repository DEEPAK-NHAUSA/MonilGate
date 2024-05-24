package com.nht.moniwebsvc.restful.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class sendTicketDTO {
	
	@JsonProperty("IF_NO")
	private String IF_NO="";
	@JsonProperty("TN_NO")
	private String TN_NO="";
	@JsonProperty("TERM_ID")
	private String TERM_ID="";
	@JsonProperty("TERM_NO")
	private String TERM_NO="";
	@JsonProperty("NODE_CD")
	private String NODE_CD="";
	@JsonProperty("TICKET_STATUS")
	private String TICKET_STATUS="";
	@JsonProperty("CMPL_CD")
	private String CMPL_CD="";
	@JsonProperty("CMPL_DESCRIPTION")
	private String CMPL_DESCRIPTION="";
	@JsonProperty("ERROR_CD")
	private String ERROR_CD="";
	@JsonProperty("EVENT_DATE")
	private String EVENT_DATE="";
	@JsonProperty("EVENT_TIME")
	private String EVENT_TIME="";
	@JsonProperty("TICKET_COMMENT")
	private String TICKET_COMMENT="";
	@JsonProperty("IF_SEND_DATE")
	private String IF_SEND_DATE="";
	@JsonProperty("IF_SEND_DATE_TEXT")
	private String IF_SEND_DATE_TEXT="";
	@JsonProperty("IF_SEND_TME_TEXT")
	private String IF_SEND_TME_TEXT="";
	@JsonProperty("IF_SEND_FLAG")
	private String IF_SEND_FLAG="";
	@JsonProperty("IF_SEND_RESULT")
	private String IF_SEND_RESULT="";
	@JsonProperty("IF_RES_DATE")
	private String IF_RES_DATE="";
	@JsonProperty("IF_RES_DATE_TEXT")
	private String IF_RES_DATE_TEXT="";
	@JsonProperty("IF_RES_TME_TEXT")
	private String IF_RES_TME_TEXT="";
	@JsonProperty("IF_RES_RESULT")
	private String IF_RES_RESULT="";
	@JsonProperty("CANCEL_DATE")
	private String CANCEL_DATE="";
	@JsonProperty("CANCEL_DATE_TEXT")
	private String CANCEL_DATE_TEXT="";
	@JsonProperty("CANCEL_TME_TEXT")
	private String CANCEL_TME_TEXT="";
	@JsonProperty("REG_DATE")
	private String REG_DATE="";
	@JsonProperty("REG_DATE_TEXT")
	private String REG_DATE_TEXT="";
	@JsonProperty("REG_TME_TEXT")
	private String REG_TME_TEXT="";
	public String getIF_NO() {
		return IF_NO;
	}
	public void setIF_NO(String iF_NO) {
		IF_NO = iF_NO;
	}
	public String getTN_NO() {
		return TN_NO;
	}
	public void setTN_NO(String tN_NO) {
		TN_NO = tN_NO;
	}
	public String getTERM_ID() {
		return TERM_ID;
	}
	public void setTERM_ID(String tERM_ID) {
		TERM_ID = tERM_ID;
	}
	public String getTERM_NO() {
		return TERM_NO;
	}
	public void setTERM_NO(String tERM_NO) {
		TERM_NO = tERM_NO;
	}
	public String getNODE_CD() {
		return NODE_CD;
	}
	public void setNODE_CD(String nODE_CD) {
		NODE_CD = nODE_CD;
	}
	public String getTICKET_STATUS() {
		return TICKET_STATUS;
	}
	public void setTICKET_STATUS(String tICKET_STATUS) {
		TICKET_STATUS = tICKET_STATUS;
	}
	public String getCMPL_CD() {
		return CMPL_CD;
	}
	public void setCMPL_CD(String cMPL_CD) {
		CMPL_CD = cMPL_CD;
	}
	public String getCMPL_DESCRIPTION() {
		return CMPL_DESCRIPTION;
	}
	public void setCMPL_DESCRIPTION(String cMPL_DESCRIPTION) {
		CMPL_DESCRIPTION = cMPL_DESCRIPTION;
	}
	public String getERROR_CD() {
		return ERROR_CD;
	}
	public void setERROR_CD(String eRROR_CD) {
		ERROR_CD = eRROR_CD;
	}
	public String getEVENT_DATE() {
		return EVENT_DATE;
	}
	public void setEVENT_DATE(String eVENT_DATE) {
		EVENT_DATE = eVENT_DATE;
	}
	public String getEVENT_TIME() {
		return EVENT_TIME;
	}
	public void setEVENT_TIME(String eVENT_TIME) {
		EVENT_TIME = eVENT_TIME;
	}
	public String getTICKET_COMMENT() {
		return TICKET_COMMENT;
	}
	public void setTICKET_COMMENT(String tICKET_COMMENT) {
		TICKET_COMMENT = tICKET_COMMENT;
	}
	public String getIF_SEND_DATE() {
		return IF_SEND_DATE;
	}
	public void setIF_SEND_DATE(String iF_SEND_DATE) {
		IF_SEND_DATE = iF_SEND_DATE;
	}
	public String getIF_SEND_DATE_TEXT() {
		return IF_SEND_DATE_TEXT;
	}
	public void setIF_SEND_DATE_TEXT(String iF_SEND_DATE_TEXT) {
		IF_SEND_DATE_TEXT = iF_SEND_DATE_TEXT;
	}
	public String getIF_SEND_TME_TEXT() {
		return IF_SEND_TME_TEXT;
	}
	public void setIF_SEND_TME_TEXT(String iF_SEND_TME_TEXT) {
		IF_SEND_TME_TEXT = iF_SEND_TME_TEXT;
	}
	public String getIF_SEND_FLAG() {
		return IF_SEND_FLAG;
	}
	public void setIF_SEND_FLAG(String iF_SEND_FLAG) {
		IF_SEND_FLAG = iF_SEND_FLAG;
	}
	public String getIF_SEND_RESULT() {
		return IF_SEND_RESULT;
	}
	public void setIF_SEND_RESULT(String iF_SEND_RESULT) {
		IF_SEND_RESULT = iF_SEND_RESULT;
	}
	public String getIF_RES_DATE() {
		return IF_RES_DATE;
	}
	public void setIF_RES_DATE(String iF_RES_DATE) {
		IF_RES_DATE = iF_RES_DATE;
	}
	public String getIF_RES_DATE_TEXT() {
		return IF_RES_DATE_TEXT;
	}
	public void setIF_RES_DATE_TEXT(String iF_RES_DATE_TEXT) {
		IF_RES_DATE_TEXT = iF_RES_DATE_TEXT;
	}
	public String getIF_RES_TME_TEXT() {
		return IF_RES_TME_TEXT;
	}
	public void setIF_RES_TME_TEXT(String iF_RES_TME_TEXT) {
		IF_RES_TME_TEXT = iF_RES_TME_TEXT;
	}
	public String getIF_RES_RESULT() {
		return IF_RES_RESULT;
	}
	public void setIF_RES_RESULT(String iF_RES_RESULT) {
		IF_RES_RESULT = iF_RES_RESULT;
	}
	public String getCANCEL_DATE() {
		return CANCEL_DATE;
	}
	public void setCANCEL_DATE(String cANCEL_DATE) {
		CANCEL_DATE = cANCEL_DATE;
	}
	public String getCANCEL_DATE_TEXT() {
		return CANCEL_DATE_TEXT;
	}
	public void setCANCEL_DATE_TEXT(String cANCEL_DATE_TEXT) {
		CANCEL_DATE_TEXT = cANCEL_DATE_TEXT;
	}
	public String getCANCEL_TME_TEXT() {
		return CANCEL_TME_TEXT;
	}
	public void setCANCEL_TME_TEXT(String cANCEL_TME_TEXT) {
		CANCEL_TME_TEXT = cANCEL_TME_TEXT;
	}
	public String getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(String rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	public String getREG_DATE_TEXT() {
		return REG_DATE_TEXT;
	}
	public void setREG_DATE_TEXT(String rEG_DATE_TEXT) {
		REG_DATE_TEXT = rEG_DATE_TEXT;
	}
	public String getREG_TME_TEXT() {
		return REG_TME_TEXT;
	}
	public void setREG_TME_TEXT(String rEG_TME_TEXT) {
		REG_TME_TEXT = rEG_TME_TEXT;
	}
	@Override
	public String toString() {
		return "sendTicketDTO [IF_NO=" + IF_NO + ", TN_NO=" + TN_NO + ", TERM_ID=" + TERM_ID + ", TERM_NO=" + TERM_NO
				+ ", NODE_CD=" + NODE_CD + ", TICKET_STATUS=" + TICKET_STATUS + ", CMPL_CD=" + CMPL_CD
				+ ", CMPL_DESCRIPTION=" + CMPL_DESCRIPTION + ", ERROR_CD=" + ERROR_CD + ", EVENT_DATE=" + EVENT_DATE
				+ ", EVENT_TIME=" + EVENT_TIME + ", TICKET_COMMENT=" + TICKET_COMMENT + ", IF_SEND_DATE=" + IF_SEND_DATE
				+ ", IF_SEND_DATE_TEXT=" + IF_SEND_DATE_TEXT + ", IF_SEND_TME_TEXT=" + IF_SEND_TME_TEXT
				+ ", IF_SEND_FLAG=" + IF_SEND_FLAG + ", IF_SEND_RESULT=" + IF_SEND_RESULT + ", IF_RES_DATE="
				+ IF_RES_DATE + ", IF_RES_DATE_TEXT=" + IF_RES_DATE_TEXT + ", IF_RES_TME_TEXT=" + IF_RES_TME_TEXT
				+ ", IF_RES_RESULT=" + IF_RES_RESULT + ", CANCEL_DATE=" + CANCEL_DATE + ", CANCEL_DATE_TEXT="
				+ CANCEL_DATE_TEXT + ", CANCEL_TME_TEXT=" + CANCEL_TME_TEXT + ", REG_DATE=" + REG_DATE
				+ ", REG_DATE_TEXT=" + REG_DATE_TEXT + ", REG_TME_TEXT=" + REG_TME_TEXT + "]";
	}
	
		
}
