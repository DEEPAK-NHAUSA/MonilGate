package com.nht.moniwebsvc.restful.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebServiceSendDTO {

//atm 정보
@JsonProperty("R_SEQ")
private String R_SEQ="";
@JsonProperty("TERM_ID")
private String TERM_ID="";
@JsonProperty("TERM_NO")
private String TERM_NO="";
@JsonProperty("ASSET_SNO")
private String ASSET_SNO="";
@JsonProperty("BRANCH_CD")
private String BRANCH_CD="";
@JsonProperty("BRANCH_NAME")
private String BRANCH_NAME="";
@JsonProperty("AREA")
private String AREA="";
@JsonProperty("AREA_NAME")
private String AREA_NAME="";
@JsonProperty("CITY")
private String CITY="";
@JsonProperty("LOCATION")
private String LOCATION="";
@JsonProperty("SETTLE_DATE")
private String SETTLE_DATE="";
@JsonProperty("MODEL_CD")
private String MODEL_CD="";
@JsonProperty("MODEL_NAME")
private String MODEL_NAME ="";
@JsonProperty("UPTIME")
private String UPTIME="";
@JsonProperty("ATM_STATUS")
private String ATM_STATUS ="";
@JsonProperty("ATM_STATUS_NAME")
private String ATM_STATUS_NAME ="";
@JsonProperty("ATM_IP")
private String ATM_IP="";
@JsonProperty("LIVE_DATE")
private String LIVE_DATE="";
@JsonProperty("PROC_FLAG")
private String PROC_FLAG="";

//모델정보
@JsonProperty("ATM_CO_CD")
private String ATM_CO_CD="";
@JsonProperty("ATM_CO_NAME")
private String ATM_CO_NAME="";

//장애코드정보
@JsonProperty("ERR_MODULE")
private String ERR_MODULE="";
@JsonProperty("ATM_ERR_CD")
private String ATM_ERR_CD="";
@JsonProperty("ERR_CONTENTS")
private String ERR_CONTENTS="";
@JsonProperty("USEABLE")
private String USEABLE="";
@JsonProperty("AUTO_CALL_FLAG")
private String AUTO_CALL_FLAG="";

//BRANCH정보
@JsonProperty("STATUS")
private String STATUS="";
@JsonProperty("ADDRESS")
private String ADDRESS="";
@JsonProperty("ZIP_CD")
private String ZIP_CD="";
@JsonProperty("CELL_PHONE_NO")
private String CELL_PHONE_NO="";
@JsonProperty("PHONE_NO")
private String PHONE_NO="";
@JsonProperty("FAX_NO")
private String FAX_NO="";
@JsonProperty("LATITUDE")
private String LATITUDE="";
@JsonProperty("LONGITUDE")
private String LONGITUDE="";

//MONIERRORCODE정보
@JsonProperty("CMPL_CD")
private String CMPL_CD="";
@JsonProperty("CMPL_TXT")
private String CMPL_TXT="";
@JsonProperty("ALERT_TYPE")
private String ALERT_TYPE="";

//스레드테스트
@JsonProperty("THREAD_NAME")
private String THREAD_NAME="";
@JsonProperty("START_TIME")
private String START_TIME="";
@JsonProperty("END_TIME")
private String END_TIME="";
@JsonProperty("GAB")
private String GAB="";
public String getR_SEQ() {
	return R_SEQ;
}
public void setR_SEQ(String r_SEQ) {
	R_SEQ = r_SEQ;
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
public String getASSET_SNO() {
	return ASSET_SNO;
}
public void setASSET_SNO(String aSSET_SNO) {
	ASSET_SNO = aSSET_SNO;
}
public String getBRANCH_CD() {
	return BRANCH_CD;
}
public void setBRANCH_CD(String bRANCH_CD) {
	BRANCH_CD = bRANCH_CD;
}
public String getBRANCH_NAME() {
	return BRANCH_NAME;
}
public void setBRANCH_NAME(String bRANCH_NAME) {
	BRANCH_NAME = bRANCH_NAME;
}
public String getAREA() {
	return AREA;
}
public void setAREA(String aREA) {
	AREA = aREA;
}
public String getAREA_NAME() {
	return AREA_NAME;
}
public void setAREA_NAME(String aREA_NAME) {
	AREA_NAME = aREA_NAME;
}
public String getCITY() {
	return CITY;
}
public void setCITY(String cITY) {
	CITY = cITY;
}
public String getLOCATION() {
	return LOCATION;
}
public void setLOCATION(String lOCATION) {
	LOCATION = lOCATION;
}
public String getSETTLE_DATE() {
	return SETTLE_DATE;
}
public void setSETTLE_DATE(String sETTLE_DATE) {
	SETTLE_DATE = sETTLE_DATE;
}
public String getMODEL_CD() {
	return MODEL_CD;
}
public void setMODEL_CD(String mODEL_CD) {
	MODEL_CD = mODEL_CD;
}
public String getMODEL_NAME() {
	return MODEL_NAME;
}
public void setMODEL_NAME(String mODEL_NAME) {
	MODEL_NAME = mODEL_NAME;
}
public String getUPTIME() {
	return UPTIME;
}
public void setUPTIME(String uPTIME) {
	UPTIME = uPTIME;
}
public String getATM_STATUS() {
	return ATM_STATUS;
}
public void setATM_STATUS(String aTM_STATUS) {
	ATM_STATUS = aTM_STATUS;
}
public String getATM_STATUS_NAME() {
	return ATM_STATUS_NAME;
}
public void setATM_STATUS_NAME(String aTM_STATUS_NAME) {
	ATM_STATUS_NAME = aTM_STATUS_NAME;
}
public String getATM_IP() {
	return ATM_IP;
}
public void setATM_IP(String aTM_IP) {
	ATM_IP = aTM_IP;
}
public String getLIVE_DATE() {
	return LIVE_DATE;
}
public void setLIVE_DATE(String lIVE_DATE) {
	LIVE_DATE = lIVE_DATE;
}
public String getPROC_FLAG() {
	return PROC_FLAG;
}
public void setPROC_FLAG(String pROC_FLAG) {
	PROC_FLAG = pROC_FLAG;
}
public String getATM_CO_CD() {
	return ATM_CO_CD;
}
public void setATM_CO_CD(String aTM_CO_CD) {
	ATM_CO_CD = aTM_CO_CD;
}
public String getATM_CO_NAME() {
	return ATM_CO_NAME;
}
public void setATM_CO_NAME(String aTM_CO_NAME) {
	ATM_CO_NAME = aTM_CO_NAME;
}
public String getERR_MODULE() {
	return ERR_MODULE;
}
public void setERR_MODULE(String eRR_MODULE) {
	ERR_MODULE = eRR_MODULE;
}
public String getATM_ERR_CD() {
	return ATM_ERR_CD;
}
public void setATM_ERR_CD(String aTM_ERR_CD) {
	ATM_ERR_CD = aTM_ERR_CD;
}
public String getERR_CONTENTS() {
	return ERR_CONTENTS;
}
public void setERR_CONTENTS(String eRR_CONTENTS) {
	ERR_CONTENTS = eRR_CONTENTS;
}
public String getUSEABLE() {
	return USEABLE;
}
public void setUSEABLE(String uSEABLE) {
	USEABLE = uSEABLE;
}
public String getAUTO_CALL_FLAG() {
	return AUTO_CALL_FLAG;
}
public void setAUTO_CALL_FLAG(String aUTO_CALL_FLAG) {
	AUTO_CALL_FLAG = aUTO_CALL_FLAG;
}
public String getSTATUS() {
	return STATUS;
}
public void setSTATUS(String sTATUS) {
	STATUS = sTATUS;
}
public String getADDRESS() {
	return ADDRESS;
}
public void setADDRESS(String aDDRESS) {
	ADDRESS = aDDRESS;
}
public String getZIP_CD() {
	return ZIP_CD;
}
public void setZIP_CD(String zIP_CD) {
	ZIP_CD = zIP_CD;
}
public String getCELL_PHONE_NO() {
	return CELL_PHONE_NO;
}
public void setCELL_PHONE_NO(String cELL_PHONE_NO) {
	CELL_PHONE_NO = cELL_PHONE_NO;
}
public String getPHONE_NO() {
	return PHONE_NO;
}
public void setPHONE_NO(String pHONE_NO) {
	PHONE_NO = pHONE_NO;
}
public String getFAX_NO() {
	return FAX_NO;
}
public void setFAX_NO(String fAX_NO) {
	FAX_NO = fAX_NO;
}
public String getLATITUDE() {
	return LATITUDE;
}
public void setLATITUDE(String lATITUDE) {
	LATITUDE = lATITUDE;
}
public String getLONGITUDE() {
	return LONGITUDE;
}
public void setLONGITUDE(String lONGITUDE) {
	LONGITUDE = lONGITUDE;
}
public String getCMPL_CD() {
	return CMPL_CD;
}
public void setCMPL_CD(String cMPL_CD) {
	CMPL_CD = cMPL_CD;
}
public String getCMPL_TXT() {
	return CMPL_TXT;
}
public void setCMPL_TXT(String cMPL_TXT) {
	CMPL_TXT = cMPL_TXT;
}
public String getALERT_TYPE() {
	return ALERT_TYPE;
}
public void setALERT_TYPE(String aLERT_TYPE) {
	ALERT_TYPE = aLERT_TYPE;
}
public String getTHREAD_NAME() {
	return THREAD_NAME;
}
public void setTHREAD_NAME(String tHREAD_NAME) {
	THREAD_NAME = tHREAD_NAME;
}
public String getSTART_TIME() {
	return START_TIME;
}
public void setSTART_TIME(String sTART_TIME) {
	START_TIME = sTART_TIME;
}
public String getEND_TIME() {
	return END_TIME;
}
public void setEND_TIME(String eND_TIME) {
	END_TIME = eND_TIME;
}
public String getGAB() {
	return GAB;
}
public void setGAB(String gAB) {
	GAB = gAB;
}



}














