package com.xa.jans.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.xa.jans.utils.JsonUtil;

/**
 * @desc 资源表、菜单表
 * @author zyl
 * @Timestamp 
 */
public class SysResources implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 编号
	private Integer ID;
	// 名称
	private String NAME;
	// 顺序编号
	private BigDecimal sortId;
	// 请求地址
	private String URL;
	// 提示信息
	private String TIP;
	// 父ID
	private Integer PID;
	// 系统编码
	private String SYSCODE;
	// 图标
	private String ICON;
	// 0是菜单，1是功能（增删改查）
	private String TYPE;
	// 是否使用，0正常，1不可用
	private String ISUSE;
	// 备注
	private String REMARK;
	// 创建用户编号
	private Integer createBy;
	// 创建时间
	private Timestamp createTime;
    
	/** 设置 编号,对应字段 SYS_RESOURCES.ID */
	public void setID(Integer ID){
		this.ID = ID;
	}
	/** 获取 编号,对应字段 SYS_RESOURCES.ID */
	public Integer getID(){
		return this.ID;
	}
	/** 设置 名称,对应字段 SYS_RESOURCES.NAME */
	public void setNAME(String NAME){
		this.NAME = NAME;
	}
	/** 获取 名称,对应字段 SYS_RESOURCES.NAME */
	public String getNAME(){
		return this.NAME;
	}
	/** 设置 顺序编号,对应字段 SYS_RESOURCES.SORT_ID */
	public void setSortId(BigDecimal sortId){
		this.sortId = sortId;
	}
	/** 获取 顺序编号,对应字段 SYS_RESOURCES.SORT_ID */
	public BigDecimal getSortId(){
		return this.sortId;
	}
	/** 设置 请求地址,对应字段 SYS_RESOURCES.URL */
	public void setURL(String URL){
		this.URL = URL;
	}
	/** 获取 请求地址,对应字段 SYS_RESOURCES.URL */
	public String getURL(){
		return this.URL;
	}
	/** 设置 提示信息,对应字段 SYS_RESOURCES.TIP */
	public void setTIP(String TIP){
		this.TIP = TIP;
	}
	/** 获取 提示信息,对应字段 SYS_RESOURCES.TIP */
	public String getTIP(){
		return this.TIP;
	}
	/** 设置 父ID,对应字段 SYS_RESOURCES.PID */
	public void setPID(Integer PID){
		this.PID = PID;
	}
	/** 获取 父ID,对应字段 SYS_RESOURCES.PID */
	public Integer getPID(){
		return this.PID;
	}
	/** 设置 系统编码,对应字段 SYS_RESOURCES.SYSCODE */
	public void setSYSCODE(String SYSCODE){
		this.SYSCODE = SYSCODE;
	}
	/** 获取 系统编码,对应字段 SYS_RESOURCES.SYSCODE */
	public String getSYSCODE(){
		return this.SYSCODE;
	}
	/** 设置 图标,对应字段 SYS_RESOURCES.ICON */
	public void setICON(String ICON){
		this.ICON = ICON;
	}
	/** 获取 图标,对应字段 SYS_RESOURCES.ICON */
	public String getICON(){
		return this.ICON;
	}
	/** 设置 0是菜单，1是功能（增删改查）,对应字段 SYS_RESOURCES.TYPE */
	public void setTYPE(String TYPE){
		this.TYPE = TYPE;
	}
	/** 获取 0是菜单，1是功能（增删改查）,对应字段 SYS_RESOURCES.TYPE */
	public String getTYPE(){
		return this.TYPE;
	}
	/** 设置 是否使用，0正常，1不可用,对应字段 SYS_RESOURCES.ISUSE */
	public void setISUSE(String ISUSE){
		this.ISUSE = ISUSE;
	}
	/** 获取 是否使用，0正常，1不可用,对应字段 SYS_RESOURCES.ISUSE */
	public String getISUSE(){
		return this.ISUSE;
	}
	/** 设置 备注,对应字段 SYS_RESOURCES.REMARK */
	public void setREMARK(String REMARK){
		this.REMARK = REMARK;
	}
	/** 获取 备注,对应字段 SYS_RESOURCES.REMARK */
	public String getREMARK(){
		return this.REMARK;
	}
	/** 设置 创建用户编号,对应字段 SYS_RESOURCES.CREATE_BY */
	public void setCreateBy(Integer createBy){
		this.createBy = createBy;
	}
	/** 获取 创建用户编号,对应字段 SYS_RESOURCES.CREATE_BY */
	public Integer getCreateBy(){
		return this.createBy;
	}
	/** 设置 创建时间,对应字段 SYS_RESOURCES.CREATE_TIME */
	public void setCreateTime(Timestamp createTime){
		this.createTime = createTime;
	}
	/** 获取 创建时间,对应字段 SYS_RESOURCES.CREATE_TIME */
	public Timestamp getCreateTime(){
		return this.createTime;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
