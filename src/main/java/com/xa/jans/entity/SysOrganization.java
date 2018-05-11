package com.xa.jans.entity;

import java.sql.Timestamp;

import com.xa.jans.utils.JsonUtil;

/**
 * @desc 组织机构表
 * @author zyl
 * @Timestamp 
 */
public class SysOrganization implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 编号
	private Integer ID;
	// 用户组名
	private String NAME;
	// 用户组父ID
	private Integer PID;
	// 地址
	private String ADDRESS;
	// 公司座机
	private String TELPHONE;
	// 创建时间
	private Integer createBy;
	// 
	private Timestamp createTime;
    
	/** 设置 编号,对应字段 SYS_ORGANIZATION.ID */
	public void setID(Integer ID){
		this.ID = ID;
	}
	/** 获取 编号,对应字段 SYS_ORGANIZATION.ID */
	public Integer getID(){
		return this.ID;
	}
	/** 设置 用户组名,对应字段 SYS_ORGANIZATION.NAME */
	public void setNAME(String NAME){
		this.NAME = NAME;
	}
	/** 获取 用户组名,对应字段 SYS_ORGANIZATION.NAME */
	public String getNAME(){
		return this.NAME;
	}
	/** 设置 用户组父ID,对应字段 SYS_ORGANIZATION.PID */
	public void setPID(Integer PID){
		this.PID = PID;
	}
	/** 获取 用户组父ID,对应字段 SYS_ORGANIZATION.PID */
	public Integer getPID(){
		return this.PID;
	}
	/** 设置 地址,对应字段 SYS_ORGANIZATION.ADDRESS */
	public void setADDRESS(String ADDRESS){
		this.ADDRESS = ADDRESS;
	}
	/** 获取 地址,对应字段 SYS_ORGANIZATION.ADDRESS */
	public String getADDRESS(){
		return this.ADDRESS;
	}
	/** 设置 公司座机,对应字段 SYS_ORGANIZATION.TELPHONE */
	public void setTELPHONE(String TELPHONE){
		this.TELPHONE = TELPHONE;
	}
	/** 获取 公司座机,对应字段 SYS_ORGANIZATION.TELPHONE */
	public String getTELPHONE(){
		return this.TELPHONE;
	}
	/** 设置 创建时间,对应字段 SYS_ORGANIZATION.CREATE_BY */
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	/** 获取 创建时间,对应字段 SYS_ORGANIZATION.CREATE_BY */
	public Integer getCreateBy(){
		return this.createBy;
	}
	public void setCreateTime(Timestamp createTime){
		this.createTime = createTime;
	}
	public Timestamp getCreateTime(){
		return this.createTime;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
