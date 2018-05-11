package com.xa.jans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.jans.entity.SysUser;
import com.xa.jans.service.SysUserService;
import com.xa.jans.utils.ResultUtil;
import com.xa.jans.vo.Result;

@RestController
@RequestMapping("user")
public class SysUserController {

	@Autowired
	private SysUserService service;

	/**
	 * 
	 * @param pageNum 页数从0开始
	 * @param pageSize
	 * @param user
	 * @return
	 */
	@GetMapping("/page")
	public Result page(int pageNum,int pageSize,SysUser user) {
		PageRequest pageRequest = PageRequest.of(pageNum,pageSize, Direction.DESC, "name");
		Page<SysUser> page = service.page(user,pageRequest);
		return ResultUtil.success(page);
	}

	@GetMapping("/findByName")
	public Result<SysUser> findByName(String name) {
		return service.findByName(name);
	}

	@GetMapping("/save")
	public Result<String> save(SysUser sysUser) throws Exception {
		return service.save(sysUser);
	}

	@GetMapping("/update")
	public Result<String> update(SysUser sysUser) throws Exception {
		return service.update(sysUser);
	}


	@GetMapping("/deleteById")
	public Result<String> deleteById(Integer id) throws Exception {
		return service.deleteById(id);
	}

}
