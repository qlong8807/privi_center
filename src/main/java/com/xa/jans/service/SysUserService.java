package com.xa.jans.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.xa.jans.entity.SysUser;
import com.xa.jans.vo.Result;

public interface SysUserService {

	public Page<SysUser> page(SysUser sysUser,PageRequest pageRequest);

	public Result<SysUser> findByName(String name);

	public Result<String> save(SysUser sysUser) throws Exception;

	public Result<String> update(SysUser sysUser) throws Exception;

	public Result<String> delete(SysUser sysUser) throws Exception;

	public Result<String> deleteById(Integer id) throws Exception;

}
