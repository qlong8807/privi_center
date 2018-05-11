package com.xa.jans.entity;

import java.sql.Timestamp;

import com.xa.jans.utils.JsonUtil;

/**
 * @desc 字典表。通过标签名、名称、编码，确定唯一。
 * @author zyl
 * @date 
 */
public class SysDict implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 编号
	private Integer ID;
	// 标签名
	private String TAGNAME;
	// CODE
	private String CODE;
	// NAME
	private String NAME;
	// 备注
	private String REMARK;
	// 是否删除,0未删除，1删除
	private String ISDEL;
	// 创建用户ID
	private Integer createBy;
	// 创建时间
	private Timestamp createTime;
    
	/** 设置 编号,对应字段 SYS_DICT.ID */
	public void setID(Integer ID){
		this.ID = ID;
	}
	/** 获取 编号,对应字段 SYS_DICT.ID */
	public Integer getID(){
		return this.ID;
	}
	/** 设置 标签名,对应字段 SYS_DICT.TAGNAME */
	public void setTAGNAME(String TAGNAME){
		this.TAGNAME = TAGNAME;
	}
	/** 获取 标签名,对应字段 SYS_DICT.TAGNAME */
	public String getTAGNAME(){
		return this.TAGNAME;
	}
	/** 设置 CODE,对应字段 SYS_DICT.CODE */
	public void setCODE(String CODE){
		this.CODE = CODE;
	}
	/** 获取 CODE,对应字段 SYS_DICT.CODE */
	public String getCODE(){
		return this.CODE;
	}
	/** 设置 NAME,对应字段 SYS_DICT.NAME */
	public void setNAME(String NAME){
		this.NAME = NAME;
	}
	/** 获取 NAME,对应字段 SYS_DICT.NAME */
	public String getNAME(){
		return this.NAME;
	}
	/** 设置 备注,对应字段 SYS_DICT.REMARK */
	public void setREMARK(String REMARK){
		this.REMARK = REMARK;
	}
	/** 获取 备注,对应字段 SYS_DICT.REMARK */
	public String getREMARK(){
		return this.REMARK;
	}
	/** 设置 是否删除,0未删除，1删除,对应字段 SYS_DICT.ISDEL */
	public void setISDEL(String ISDEL){
		this.ISDEL = ISDEL;
	}
	/** 获取 是否删除,0未删除，1删除,对应字段 SYS_DICT.ISDEL */
	public String getISDEL(){
		return this.ISDEL;
	}
	/** 设置 创建用户ID,对应字段 SYS_DICT.CREATE_BY */
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	/** 获取 创建用户ID,对应字段 SYS_DICT.CREATE_BY */
	public Integer getCreateBy(){
		return this.createBy;
	}
	/** 设置 创建时间,对应字段 SYS_DICT.CREATE_TIME */
	public void setCreateTime(Timestamp createTime){
		this.createTime = createTime;
	}
	/** 获取 创建时间,对应字段 SYS_DICT.CREATE_TIME */
	public Timestamp getCreateTime(){
		return this.createTime;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
