package com.xa.jans.entity;

import java.sql.Timestamp;
import com.xa.jans.utils.JsonUtil;

/**
 * @desc 用户-组织机构关系表
 * @author zyl
 * @date 
 */
public class SysUserOrg implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 用户ID
	private Integer USERID;
	// 用户组ID
	private Integer ORGID;
    
	/** 设置 用户ID,对应字段 SYS_USER_ORG.USERID */
	public void setUSERID(Integer USERID){
		this.USERID = USERID;
	}
	/** 获取 用户ID,对应字段 SYS_USER_ORG.USERID */
	public Integer getUSERID(){
		return this.USERID;
	}
	/** 设置 用户组ID,对应字段 SYS_USER_ORG.ORGID */
	public void setORGID(Integer ORGID){
		this.ORGID = ORGID;
	}
	/** 获取 用户组ID,对应字段 SYS_USER_ORG.ORGID */
	public Integer getORGID(){
		return this.ORGID;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
