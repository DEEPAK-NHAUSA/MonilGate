package com.nht.moniwebsvc.restful.service;

import com.nht.moniwebsvc.restful.dto.MMrecvTicketDTO;
import com.nht.moniwebsvc.restful.dto.recvTicketDTO;

import java.util.HashMap;

public interface EagleService {

    public HashMap<String, String> updateTicket(recvTicketDTO recvTicketDTO) throws Exception;
    public HashMap<String, String> insertRecvTicketHistory(recvTicketDTO recvTicketDTO) throws Exception;

    public HashMap<String, String> insertRecvTicketorigin(MMrecvTicketDTO MMrecvTicketDTO) throws Exception;
    public HashMap<String, String> insertASM_GAS_RCPT(MMrecvTicketDTO MMrecvTicketDTO) throws Exception;

}
