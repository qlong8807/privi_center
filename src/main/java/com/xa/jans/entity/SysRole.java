package com.xa.jans.entity;

import java.sql.Timestamp;

import com.xa.jans.utils.JsonUtil;

/**
 * @desc 角色表
 * @author zyl
 * @Timestamp 
 */
public class SysRole implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 编号
	private Integer ID;
	// 角色名
	private String roleName;
	// 描述
	private String DESCRIPTION;
	// 是否删除,0正常，1删除
	private Integer ISDEL;
	// 创建用户编号
	private String createBy;
	// 创建时间
	private Timestamp createTime;
    
	/** 设置 编号,对应字段 SYS_ROLE.ID */
	public void setID(Integer ID){
		this.ID = ID;
	}
	/** 获取 编号,对应字段 SYS_ROLE.ID */
	public Integer getID(){
		return this.ID;
	}
	/** 设置 角色名,对应字段 SYS_ROLE.ROLE_NAME */
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	/** 获取 角色名,对应字段 SYS_ROLE.ROLE_NAME */
	public String getRoleName(){
		return this.roleName;
	}
	/** 设置 描述,对应字段 SYS_ROLE.DESCRIPTION */
	public void setDESCRIPTION(String DESCRIPTION){
		this.DESCRIPTION = DESCRIPTION;
	}
	/** 获取 描述,对应字段 SYS_ROLE.DESCRIPTION */
	public String getDESCRIPTION(){
		return this.DESCRIPTION;
	}
	/** 设置 是否删除,0正常，1删除,对应字段 SYS_ROLE.ISDEL */
	public void setISDEL(Integer ISDEL){
		this.ISDEL = ISDEL;
	}
	/** 获取 是否删除,0正常，1删除,对应字段 SYS_ROLE.ISDEL */
	public Integer getISDEL(){
		return this.ISDEL;
	}
	/** 设置 创建用户编号,对应字段 SYS_ROLE.CREATE_BY */
	public void setCreateBy(String createBy){
		this.createBy = createBy;
	}
	/** 获取 创建用户编号,对应字段 SYS_ROLE.CREATE_BY */
	public String getCreateBy(){
		return this.createBy;
	}
	/** 设置 创建时间,对应字段 SYS_ROLE.CREATE_TIME */
	public void setCreateTime(Timestamp createTime){
		this.createTime = createTime;
	}
	/** 获取 创建时间,对应字段 SYS_ROLE.CREATE_TIME */
	public Timestamp getCreateTime(){
		return this.createTime;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
