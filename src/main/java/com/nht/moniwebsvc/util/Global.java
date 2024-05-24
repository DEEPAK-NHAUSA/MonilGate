package com.nht.moniwebsvc.util;

public final class Global {
		
		public static String log_location = GlobalSetting.getPropertiesValue("log_location"); //"c:/eagle/mm_interface_log/";	
		public static String server_log_location = GlobalSetting.getPropertiesValue("server_log_location"); //"c:/eagle/mm_server_log/";
		public static String report_file_saving_url = GlobalSetting.getPropertiesValue("report_file_saving_url"); 
		public static String report_schedule_run = GlobalSetting.getPropertiesValue("report_schedule_run"); 
		public static String receive_flie_name = "eagle_receive_log";	
		public static String send_file_name = "eagle_send_log";	
		
		public static String atm_send_file_name = "atm_send_log";	
		public static String atm_receive_file_name = "atm_receive_log";
		public static String model_send_file_name = "model_send_log";	
		public static String model_receive_file_name = "model__receive_log";
		public static String errorcode_send_file_name = "errorcode_send_log";	
		public static String errorcode_receive_file_name = "errorcode__receive_log";
		public static String branch_send_file_name = "branch_send_log";	
		public static String branch_receive_file_name = "branch__receive_log";
		public static String moni_errorcode_send_file_name = "moni_errorcode_send_log";	
		public static String moni_errorcode_receive_file_name = "moni_errorcode__receive_log";
		
		//public static String chase_receive_authorization = "[Security FCTI:SlBNQ0NoYXNlIA==]";
		public static String chase_send_authorization = "Security JPMCVendor:dH1dyfG";		
		
		//public static String chase_send_url = "http://localhost:8080/wsQA/ticketService/incoming/jsonTest"; // 로컬 테스트
		//public static String chase_send_url = "https://biseagleext.chase.com/WebApi-Eagle-QA/api/ApiVersion1VendorHistory"; // 개발
		//public static String chase_send_url = "https://biseagleext.chase.com/WebApi-Eagle/api/ApiVersion1VendorHistory";  // 운영
		
		public static String atm_send_url =  GlobalSetting.getPropertiesValue("moni_assist_ws") + "/wsFCTI/ticketService/incoming/getAtmMaster";
		public static String model_send_url =  GlobalSetting.getPropertiesValue("moni_assist_ws") + "/wsFCTI/ticketService/incoming/getAtmModel";
		public static String errorcode_send_url = GlobalSetting.getPropertiesValue("moni	_assist_ws") + "/wsFCTI/ticketService/incoming/getMoniFaultCode";
		public static String branch_send_url = GlobalSetting.getPropertiesValue("moni_assist_ws") + "/wsFCTI/ticketService/incoming/getMoniBranch"; 
		public static String moni_errorcode_send_url = GlobalSetting.getPropertiesValue("moni_assist_ws") + "/wsFCTI/ticketService/incoming/getMoniCode";
		
		
		/*
		 * start ticket configuration 2019.11.21
		 * lsc
		 * 
		 * adjust history
		 * 
		 */
		
		public static String assist_send_url =  GlobalSetting.getPropertiesValue("moni_assist_ws");
		public static String assist_send_file_name = "assist_send_log";
		public static String assist_receive_file_name = "assist_receive_log";

		public static String assist_send_authorization = GlobalSetting.getPropertiesValue("send_authorization_key");
//	2023.01.10 임시백업 아래가 테스트 키임, 테스트 후 삭제 예정	public static String assist_receive_authorization = GlobalSetting.getPropertiesValue("receive_authorization_key");
		public static String assist_receive_authorization = "[Security MoniManager:TW9uaW1hbmFnZXJUaWNrZXQ=]";


		/*
		 * end ticket configuration 
		 */
		
		
		//public static String thread_test_send_url =  "http://150.73.19.6:7070/Moni/Service/threadTest";
		
		//public static String connect_error = "eagle system connect error";
		/** MONI Assist 실행여부 확인하는 T_ATOMCONFIG의 CFG_NAME=SEC_WS_SVC_ASSIST*/
		public static String cfg_name_assist   = "SEC_WS_SVC_ASSIST";
		public static String cfg_name_for_ticket_rest_use_yn = "REST_TICKET_IF";
		public static String cfg_name_for_ticket_rest_use_yn_value = "Y";
		/** MONI Manager 실행여부 확인하는 T_ATOMCONFIG의 CFG_NAME=SEC_WS_SVC_MANAGER*/
		public static String cfg_name_manager  = "SEC_WS_SVC_MANAGER";
		/** T_ATOMCONFIG의 CFG_VALUE값이 실행판단 값(1)*/
		public static String cfg_value_run = "1";
		/** USER NOT Active(create할 때 acive를 값을 보고 생성한다.*/
		public static String USER_NOT_ACTIVE = "0";
		
		/** HTTP status 200 return*/
		public static Integer http_status_success = 200;
		/** HTTP status 404 return*/
		public static Integer http_status_skip = 404;
}
