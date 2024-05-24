package com.nht.moniwebsvc.restful.dao;

import java.util.List;
import java.util.Map;

import com.nht.moniwebsvc.restful.dto.MMrecvTicketDTO;
import org.mybatis.spring.annotation.MapperScan;

import com.nht.moniwebsvc.restful.dto.WebServiceSendDTO;
import com.nht.moniwebsvc.restful.dto.sendTicketDTO;
import com.nht.moniwebsvc.restful.dto.recvTicketDTO;


@MapperScan("eagleServiceMapper")
public interface EagleServiceMapper {
	public Integer insertAllAtmInfo() throws Exception;
	public List<Map<String, Object>> getAtmLogInfo() throws Exception;
	public List<Map<String, Object>> getAtmHistoryInfo() throws Exception;

	public Integer insertAtmInfo(WebServiceSendDTO vo) throws Exception;
	public Integer updateAtmHistoryProcFlag(WebServiceSendDTO vo) throws Exception;
	public Integer getAtmLogCount(WebServiceSendDTO vo) throws Exception;
	public Integer updateAtmLogProcFlag(WebServiceSendDTO vo) throws Exception;

	public int insertAllModelInfo() throws Exception;
	public List getModelLogInfo() throws Exception;
	public int updateModelLogProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public List getModelHistoryInfo() throws Exception;
	public int insertModelInfo(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int updateModelHistoryProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int getModelLogCount(WebServiceSendDTO webServiceSendDTO) throws Exception;

	public int insertAllErrorCodeInfo() throws Exception;
	public List getErrorCodeLogInfo() throws Exception;
	public int getErrorCodeLogCount(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int updateErrorCodeLogProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public List getErrorCodeHistoryInfo() throws Exception;
	public int insertErrorCodeInfo(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int updateErrorCodeHistoryProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;

	public int insertAllBranchInfo() throws Exception;
	public List getBranchLogInfo() throws Exception;
	public int getBranchLogCount(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public List getBranchHistoryInfo() throws Exception;
	public int  insertBranchInfo(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int  updateBranchHistoryProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int  updateBranchLogProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;

	public int insertAllMoniErrorCodeInfo() throws Exception;
	public List getMoniErrorCodeLogInfo() throws Exception;
	public int getMoniErrorCodeLogCount(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int updateMoniErrorCodeLogProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public List getMoniErrorCodeHistoryInfo() throws Exception;
	public int  insertMoniErrorCodeInfo(WebServiceSendDTO webServiceSendDTO) throws Exception;
	public int  updateMoniErrorCodeHistoryProcFlag(WebServiceSendDTO webServiceSendDTO) throws Exception;

	public int getDelTerm() throws Exception;


	public List<Map<String, Object>> getNewTicketList() throws Exception;
	public int updateTicketIFStatus(sendTicketDTO sendTicketDto) throws Exception;
	public int setFlagtoTicket(sendTicketDTO sendTicketDto) throws Exception;
	public int updateT_Ticket_New(sendTicketDTO recvTicketDto) throws Exception;

	public int getTicketCount(recvTicketDTO recvTicketDto) throws Exception;
	public int getTicketCloseCount(recvTicketDTO recvTicketDto) throws Exception;
	public int insertRecvTicket(recvTicketDTO recvTicketDto) throws Exception;
	public int insertRecvTicket_his(recvTicketDTO recvTicketDto) throws Exception;
	public int updateRecvTicket(recvTicketDTO recvTicketDto) throws Exception;
	public int updateT_Ticket_New_Timestamp(recvTicketDTO recvTicketDto) throws Exception;
	public int T_Ticket_New_Close(recvTicketDTO recvTicketDto) throws Exception;

	public int insertRecvTicketlog(MMrecvTicketDTO mMrecvTicketDTO) throws Exception;
	public int insert_ASM_GAS_RCPT(MMrecvTicketDTO mMrecvTicketDTO) throws Exception;

}
