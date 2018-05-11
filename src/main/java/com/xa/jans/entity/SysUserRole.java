package com.xa.jans.entity;

import java.sql.Timestamp;
import com.xa.jans.utils.JsonUtil;

/**
 * @desc 用户-角色关系表
 * @author zyl
 * @date 
 */
public class SysUserRole implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 用户ID
	private Integer USERID;
	// 角色组ID
	private Integer ROLEID;
    
	/** 设置 用户ID,对应字段 SYS_USER_ROLE.USERID */
	public void setUSERID(Integer USERID){
		this.USERID = USERID;
	}
	/** 获取 用户ID,对应字段 SYS_USER_ROLE.USERID */
	public Integer getUSERID(){
		return this.USERID;
	}
	/** 设置 角色组ID,对应字段 SYS_USER_ROLE.ROLEID */
	public void setROLEID(Integer ROLEID){
		this.ROLEID = ROLEID;
	}
	/** 获取 角色组ID,对应字段 SYS_USER_ROLE.ROLEID */
	public Integer getROLEID(){
		return this.ROLEID;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
