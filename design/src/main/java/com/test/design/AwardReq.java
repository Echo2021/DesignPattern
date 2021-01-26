package com.test.design;

import java.util.Map;

public class AwardReq {

	private String uId; //用户id
	
	private Integer awardType;//奖品类型
	
	private String awardNum;//奖品编号
	
	private String bizId;//业务id
	
	private Map<String,String> expMap;//扩展信息

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public Integer getAwardType() {
		return awardType;
	}

	public void setAwardType(Integer awardType) {
		this.awardType = awardType;
	}

	public String getAwardNum() {
		return awardNum;
	}

	public void setAwardNum(String awardNum) {
		this.awardNum = awardNum;
	}

	public String getBizId() {
		return bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Map<String, String> getExpMap() {
		return expMap;
	}

	public void setExpMap(Map<String, String> expMap) {
		this.expMap = expMap;
	}
	
	
}
