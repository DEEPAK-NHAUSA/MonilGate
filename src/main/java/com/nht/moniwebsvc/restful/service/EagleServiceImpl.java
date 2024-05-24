package com.nht.moniwebsvc.restful.service;


import com.nht.moniwebsvc.restful.dao.EagleServiceMapper;
import com.nht.moniwebsvc.restful.dao.SecurityServiceMapper;
import com.nht.moniwebsvc.restful.dto.MMrecvTicketDTO;
import com.nht.moniwebsvc.restful.dto.recvTicketDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @Package : com.nht.moniwebsvc.restful.service
 * @FileName : EagleServiceImpl
 * @Version : 1.0
 * @Date : 2020/09/25
 * @Author : Taehyun.Kim
 * @Description :
 * ========================================================================
 * Date              ||  Name              ||  Descripton
 * 2020/09/25        ||  Taehyun.Kim       ||  신규 생성
 * ========================================================================
 *
 * RestRul API 를 처리하는 Service
 */

@Service("eagleService")
public class EagleServiceImpl implements EagleService{

    private static final Logger logger = LoggerFactory.getLogger(EagleServiceImpl.class);


    @Autowired
    EagleServiceMapper eagleServiceMapper;

    @Override
    public HashMap<String, String> insertRecvTicketHistory(recvTicketDTO recvTicketDTO) throws Exception {
        HashMap<String, String> result = new HashMap<>();
        try{
            eagleServiceMapper.insertRecvTicket_his(recvTicketDTO);
            result.put("Result", "Success");
        }
        catch(Exception e){
            logger.error(e.getMessage(), e);
            result.put("Result", "Fail");
        }

        return result;
    }

    @Override
    public HashMap<String, String> insertRecvTicketorigin(MMrecvTicketDTO MMrecvTicketDTO) throws Exception {
        HashMap<String, String> result = new HashMap<>();
        try{
            eagleServiceMapper.insertRecvTicketlog(MMrecvTicketDTO);
            result.put("Result", "Success");
        }
        catch(Exception e){
            logger.error(e.getMessage(), e);
            result.put("Result", "Fail");
        }

        return result;
    }

    @Override
    public HashMap<String, String> insertASM_GAS_RCPT(MMrecvTicketDTO MMrecvTicketDTO) throws Exception {
        HashMap<String, String> result = new HashMap<>();
        try{
            eagleServiceMapper.insert_ASM_GAS_RCPT(MMrecvTicketDTO);
            result.put("Result", "Success");
        }
        catch(Exception e){
            logger.error(e.getMessage(), e);
            result.put("Result", "Fail");
        }

        return result;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Throwable.class})
    public HashMap<String, String> updateTicket(recvTicketDTO recvTicketDTO) throws Exception {
        HashMap<String, String> result = new HashMap<>();


        try {

            /// 1. check ticket status close or not
            Integer ticketClose_count = eagleServiceMapper.getTicketCloseCount(recvTicketDTO);
            /// 2. check exist data if exist then go to update
            Integer ticket_count = eagleServiceMapper.getTicketCount(recvTicketDTO);


            if (ticketClose_count > 0) {
                /// 1. if ticket is already closed then don't update t_ticket_new.status and timestamps

                if (ticket_count > 0) { /// ticket exist : update

                    eagleServiceMapper.updateRecvTicket(recvTicketDTO);
                } else {  /// ticket not exist : insert

                    eagleServiceMapper.insertRecvTicket(recvTicketDTO);
                }

            } else { /// 2. ticket is not closed then update t_ticket_new timestamp
                if (ticket_count > 0) { /// ticket exist : update

                    eagleServiceMapper.updateRecvTicket(recvTicketDTO);
                } else {  /// ticket not exist : insert

                    eagleServiceMapper.insertRecvTicket(recvTicketDTO);
                }

                if ("".equals(recvTicketDTO.getCOMPLETE_DATE())) { /// 1. check work is completed
                    eagleServiceMapper.updateT_Ticket_New_Timestamp(recvTicketDTO);
                } else {
                    eagleServiceMapper.T_Ticket_New_Close(recvTicketDTO);
                }

            }

            result.put("result", "Success");
        }
        catch (Exception e){
            logger.error(e.getMessage(), e);
            result.put("result", "Fail");
            throw e;
        }
        return result;
    }
}
