package com.xa.jans.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.xa.jans.dao.SysUserRepository;
import com.xa.jans.entity.SysUser;
import com.xa.jans.enums.ResultEnum;
import com.xa.jans.exception.MyException;
import com.xa.jans.service.SysUserService;
import com.xa.jans.utils.ResultUtil;
import com.xa.jans.vo.Result;

@Service
public class SysUserServiceImpl implements SysUserService{
	
	@Autowired
	private SysUserRepository repository;

	@Override
	public Page<SysUser> page(SysUser sysUser,PageRequest pageRequest) {
		Example<SysUser> example = Example.of(sysUser);
		Page<SysUser> findAll = repository.findAll(example,pageRequest);
		return findAll;
	}

	@Override
	public Result<SysUser> findByName(String name) {
		SysUser user = repository.findByName(name);
		return ResultUtil.success(user);
	}

	@Override
	public Result<String> save(SysUser sysUser) throws Exception {
		//判断用户名是否重复
		SysUser user = repository.findByName(sysUser.getName());
		if(null != user) {
			throw new MyException(ResultEnum.NAME_REPEAT);
		}
		try {
			repository.save(sysUser);
		} catch (Exception e) {
			throw e;
		}
		return ResultUtil.success(null);
	}

	@Override
	public Result<String> update(SysUser sysUser) throws Exception {
		//判断用户名是否重复
		List<SysUser> users = repository.findRepeatName(sysUser.getId(), sysUser.getName());
		if(null != users && users.size() > 0) {
			throw new MyException(ResultEnum.NAME_REPEAT);
		}
		try {
			repository.save(sysUser);
		} catch (Exception e) {
			throw e;
		}
		return ResultUtil.success(null);
	}

	@Override
	public Result<String> delete(SysUser sysUser) throws Exception {
		repository.delete(sysUser);;
		return ResultUtil.success("");
	}

	@Override
	public Result<String> deleteById(Integer id) throws Exception {
		repository.deleteById(id);
		return ResultUtil.success("");
	}

}
