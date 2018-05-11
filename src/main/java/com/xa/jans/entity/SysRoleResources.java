package com.xa.jans.entity;

import java.sql.Timestamp;
import com.xa.jans.utils.JsonUtil;

/**
 * @desc 角色-资源关系表
 * @author zyl
 * @date 
 */
public class SysRoleResources implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	// 角色ID
	private Integer ROLEID;
	// 权限或菜单ID
	private Integer RESOURCEID;
    
	/** 设置 角色ID,对应字段 SYS_ROLE_RESOURCES.ROLEID */
	public void setROLEID(Integer ROLEID){
		this.ROLEID = ROLEID;
	}
	/** 获取 角色ID,对应字段 SYS_ROLE_RESOURCES.ROLEID */
	public Integer getROLEID(){
		return this.ROLEID;
	}
	/** 设置 权限或菜单ID,对应字段 SYS_ROLE_RESOURCES.RESOURCEID */
	public void setRESOURCEID(Integer RESOURCEID){
		this.RESOURCEID = RESOURCEID;
	}
	/** 获取 权限或菜单ID,对应字段 SYS_ROLE_RESOURCES.RESOURCEID */
	public Integer getRESOURCEID(){
		return this.RESOURCEID;
	}
	@Override
	public String toString() {
		return JsonUtil.objectToJson(this);
	}
}
