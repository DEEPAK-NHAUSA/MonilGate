package com.nht.moniwebsvc.restful.controller;

import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.nht.moniwebsvc.restful.dto.*;
import com.nht.moniwebsvc.restful.service.EagleService;
import com.nht.moniwebsvc.util.AppendFile;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nht.moniwebsvc.restful.dao.EagleServiceMapper;
import com.nht.moniwebsvc.restful.dao.SecurityServiceMapper;
import com.nht.moniwebsvc.util.Global;

@RestController
@RequestMapping(value="/Service")
public class TicketTestController {


    private static Logger log =  LoggerFactory.getLogger(TicketTestController.class);

    @Autowired
    EagleServiceMapper eagleServiceMapper;

    @Autowired
    SecurityServiceMapper securityServiceMapper;

    @Resource(name = "eagleService")
    private EagleService eagleService;

    String result = "";

			

	@RequestMapping(value="/help2", method=RequestMethod.GET)
    public String checkVersion(){ 
		return "This RESTFul Service is for 'MoniManager Ticket WebService V01.00.01.R1'";
    }


    @RequestMapping(value="/UpdateTicket", method=RequestMethod.POST)
    public ResponseEntity<JSONObject> UpdateTicket(@RequestBody String jsonString, HttpServletRequest request) throws Exception {

        JSONParser parser = new JSONParser();
        JSONObject json = new JSONObject();
        HashMap<String, Object> hs = null;
        JSONObject returnJson = null;

        returnJson = new JSONObject();
        Map<String, Object> inputMap = new HashMap<String, Object>();
        Map<String, Object> inputMap2 = new HashMap<String, Object>();
        Map<String, Object> returnMap = null;

        log.debug("CALL_URL : InsertTicket start");
        boolean isSkip = false;
        recvTicketDTO recvTicketDto=null;
        MMrecvTicketDTO ticket = new MMrecvTicketDTO();

    try {
            // T_ATOMCONFIG.cfg_name_for_ticket_rest_use_yn is set as "Y" following Global file value
            /*String cfgValue = securityServiceMapper.getAtomConfig(Global.cfg_name_for_ticket_rest_use_yn);
            if (!Global.cfg_name_for_ticket_rest_use_yn_value.equals(cfgValue)){
                throw new RunSkipException();
            }*/

            System.out.println("[incoming header ]"+request.getHeader("authorization").toString());
            String authorization = request.getHeader("authorization");

            if (!Global.assist_receive_authorization.equals(authorization)) {
                returnJson.put("Result", "Failure");
                returnJson.put("Description","401 Unauthorized");
            }else if(jsonString==null) {

                returnJson.put("Result", "Failure");
                returnJson.put("Description", "701 No Data found from request body");

            }
            else {
                json = (JSONObject) parser.parse(jsonString);

                /*write log file for origin ticket information start*/
                String receiveFile = json.get("CustomerId").toString()+"_"+(String)json.get("TicketId");
                if(receiveFile == null || ("").equals(receiveFile)) receiveFile="noneticketid";
                AppendFile appendFile = new AppendFile();
                boolean writeflag = appendFile.ReceiveFile(receiveFile, jsonString);
                /*write log file for origin ticket information end*/

                if(json!=null && !json.toString().equals("")){
                    String tkt = "";
                    tkt = json.toString();
                    if(tkt.length()>4000){
                        tkt = tkt.substring(0,3999);
                    }
                    ticket.setTicketText(tkt);
                }

                String keyEntityChk="";
                if(json.get("CustomerId")!=null && !json.get("CustomerId").equals("") && !"3".equals(json.get("CustomerId").toString())){
//                    ticket.setCustomerId(Integer.parseInt(json.get("CustomerId").toString()));
                    ticket.setCustomerId(json.get("CustomerId").toString());
                }else{
//                    ticket.setCustomerId(3);
                    ticket.setCustomerId("3");
                }
                if(json.get("TicketId")!=null && !json.get("TicketId").equals("")){
                    ticket.setTicketId((String)json.get("TicketId"));
                }else{
                    keyEntityChk="701 Unknown Failure Reason : TicketId is not exist";
                }
                if(json.get("TermId")!=null && !json.get("TermId").equals("")){
                    ticket.setTermId((String)json.get("TermId"));
                }else{
                    keyEntityChk="701 Unknown Failure Reason : Terminal Id is not exist";
                }
                ticket.setStatusCode((String)json.get("StatusCode"));
                if(json.get("FaultCode")!=null && !json.get("FaultCode").equals("")){
                    ticket.setFaultCode((String)json.get("FaultCode"));
                }else{
                    keyEntityChk="701 Unknown Failure Reason : FaultCode is not exist";
                }
                if(json.get("FaultCodeDescription")!=null){
                    ticket.setFaultCodeDescription((String)json.get("FaultCodeDescription"));
                }else{
                    ticket.setFaultCodeDescription("");
                }
                if(json.get("Comments")!=null){
                    ticket.setComments((String)json.get("Comments"));
                }else{
                    ticket.setComments("");
                }
                if(json.get("TicketStatus")!=null){
                    ticket.setTicketStatus((String)json.get("TicketStatus"));
                }else{
                    ticket.setTicketStatus("");
                }
                if(json.get("FaultCodeComponent")!=null){
                    ticket.setFaultCodeComponent((String)json.get("FaultCodeComponent"));
                }else{
                    ticket.setFaultCodeComponent("");
                }
                if(json.get("NativeMessage")!=null){
                    ticket.setNativeMessage((String)json.get("NativeMessage"));
                }else{
                    ticket.setNativeMessage("");
                }

                if(!keyEntityChk.equals("")){
                    /*ticket contents is abnormal*/
                    returnJson.put("Result", "Failure");
                    returnJson.put("Description", keyEntityChk);

                }else{
                    /*ticket contents is okay*/
                    returnJson.put("Result", "Success");
                    returnJson.put("Description", "");
                }

            }



        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
            log.error("Exception:", e);

            returnJson.put("Result", "Failure");
            returnJson.put("Description", "701 Unknown Exception ");
        }finally{
            ticket.setChaseMsg(returnJson.toJSONString());
            /*save original ticket text from MoniManager 2023.01.10 lsc*/
            HashMap<String, String> insertRecvTicketoriginResult;
            insertRecvTicketoriginResult = eagleService.insertRecvTicketorigin(ticket);
            /*save original ticket text from MoniManager 2023.01.10 lsc*/

            /*save original ticket text from MoniManager 2023.01.10 lsc*/
            HashMap<String, String> insertinsertASM_GAS_RCPT;
            insertRecvTicketoriginResult = eagleService.insertASM_GAS_RCPT(ticket);
            /*save original ticket text from MoniManager 2023.01.10 lsc*/




            json = null;
            recvTicketDto = null;
        }

        return new ResponseEntity<>(returnJson, HttpStatus.OK);

    }


}