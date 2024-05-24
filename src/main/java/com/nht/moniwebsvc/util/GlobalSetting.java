package com.nht.moniwebsvc.util;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GlobalSetting {
	
	private static Logger log = LoggerFactory.getLogger(GlobalSetting.class);
	
	public static String getPropertiesValue(String key){
		Properties properties = null;
		String value = "";
		try {
			properties = new Properties();
			properties.load(GlobalSetting.class.getResourceAsStream("/config/props/Service.properties"));
			value = properties.getProperty(key);
			log.debug("props value : " + value);
		} catch (Exception e) {
			log.error("failed get props value : " + e.getMessage());
		}
		return value;
	}
}
