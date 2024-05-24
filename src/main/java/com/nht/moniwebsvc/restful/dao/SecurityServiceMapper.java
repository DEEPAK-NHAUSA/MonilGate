package com.nht.moniwebsvc.restful.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

@MapperScan("securityServiceMapper")
public interface SecurityServiceMapper {
	public String getAtomConfig(String cfgName) throws Exception;
	public List<Map<String, Object>> searchSecurityInterface(Map<String, Object> model) throws Exception;	
	public int updateSecurityInterface1(Map<String, Object> model) throws Exception;
	public int updateSecurityInterface2(Map<String, Object> model) throws Exception;	
	public int updateSecurityInterface3(Map<String, Object> model) throws Exception;
	public int updateSecurityInterface4(Map<String, Object> model) throws Exception;
	public Map<String, Object> searchSecurityInterface2(Map<String, Object> model) throws Exception;
	public List<Map<String, Object>> searchSecurityInterface3(Map<String, Object> model) throws Exception;
	public List<Map<String, Object>> searchSecurityInterface4(Map<String, Object> model) throws Exception;
	
	public List<Map<String, Object>> searchSystemAccount(Map<String, Object> model) throws Exception;
	public List<Map<String, Object>> searchSystemEvtLog(Map<String, Object> model) throws Exception;
	public List<Map<String, Object>> searchSystemEvtLogSet(Map<String, Object> model) throws Exception;
	public List<Map<String, Object>> searchSystemProtection(Map<String, Object> model) throws Exception;
	public Map<String, Object> getMngNo(Map<String, Object> model) throws Exception;	
	//public int mergeIntoSystemAccount(Map<String, Object> model) throws Exception;
	public int getSystemAccountCnt(Map<String, Object> model) throws Exception;
	public int insertSystemAccountNew(Map<String, Object> model) throws Exception;
	public int updateSystemAccountNew(Map<String, Object> model) throws Exception;
	
	public int insertSystemEvtlogHistory(Map<String, Object> model) throws Exception;
	public Map<String, Object> getTermId(Map<String, Object> model) throws Exception;
	public Map<String, Object> getMasterPassword(Map<String, Object> model) throws Exception;
	
	public int deleteSystemAccount(Map<String, Object> model) throws Exception;
	public int deleteSystemProtection(Map<String, Object> model) throws Exception;
	
	public int deleteSystemEvtlog(Map<String, Object> model) throws Exception;
	public int deleteSystemEvtlogSet(Map<String, Object> model) throws Exception;
	
	public int deleteSystemProtectionFiles(Map<String, Object> model) throws Exception;	
	public int deleteMasterPasswordHistory(Map<String, Object> model) throws Exception;
	
	
	public int updateSystemProtection(Map<String, Object> model) throws Exception;
	public int updateSystemProtection2(Map<String, Object> model) throws Exception;
	public int updateSystemAccount(Map<String, Object> model) throws Exception;
	public int updateSystemAccount2(Map<String, Object> model) throws Exception;
	
	public int updateMasterPasswordHistory(Map<String, Object> model) throws Exception;
	
	
	public int updateSystemEvtlog(Map<String, Object> model) throws Exception;
	public int updateSystemEvtlogSet(Map<String, Object> model) throws Exception;
	
	public List<Map<String, Object>> searchSystemProtectionFiles(Map<String, Object> model) throws Exception;
	public int updateSystemStatus(Map<String, Object> model) throws Exception;
	
	public int deleteSystemAccountEdit(Map<String, Object> model) throws Exception;
	public int deleteSystemAccountNoMerge(Map<String, Object> model) throws Exception;
}
