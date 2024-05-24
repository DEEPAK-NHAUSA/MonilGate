package com.nht.moniwebsvc.common;

import com.nht.moniwebsvc.util.GlobalSetting;

public class MoniGlobal {
	public static final String encrypt_key = "monimanager_nh!@";
	public static String security_file_saving_url = GlobalSetting.getPropertiesValue("security_file_saving_url");//"C://MoniMgr64Dev//WEBServer//MSSQL//apache-tomcat-7.0.41//webapps//ROOT//securityfiles//";
	public static String REPORT_FILE_SAVING_URL = GlobalSetting.getPropertiesValue("report_file_saving_url");
	public static String IS_USE_EJKEY = GlobalSetting.getPropertiesValue("is_use_ejkey");
	public static String EJ_FILE_PATH = GlobalSetting.getPropertiesValue("ej_file_path");
}
