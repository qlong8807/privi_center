package com.xa.jans.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xa.jans.Application_Privi;
import com.xa.jans.entity.SysUser;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application_Privi.class)
public class SysUserRepositoryTest {
	
	@Autowired
	private SysUserRepository repository;

	@Test
	public void testInsert() {
		for(int i=0;i<100;i++) {
			SysUser user = new SysUser();
			user.setName("zhangsan"+i);
			user.setRealName("张三"+i);
			user.setEmail("abc@qq.cc");
			user.setAddress("address"+i);
			user.setSex(0);
			user.setBirthday(new Timestamp(System.currentTimeMillis()));
			user.setStatus(0);
			user.setAge(22);
			user.setCreateBy(0);
			user.setCreateTime(new Timestamp(System.currentTimeMillis()));
			repository.save(user);
		}
	}
	
	@Test
	public void testFind() {
		SysUser findByName = repository.findByName("zhangsan3");
		System.out.println(findByName);
	}
	@Test
	public void testFindSort() {
		List<SysUser> findAll = repository.findAll(new Sort(Direction.DESC,"name"));
		for(SysUser user:findAll) {
			System.out.println(user.toString());
		}
	}
	@Test
	public void testRepeat() {
		List<SysUser> findAll = repository.findRepeatName(11, "zhangsan12");
		System.err.println("size:"+findAll.size());
		for(SysUser user:findAll) {
			System.out.println(user.toString());
		}
	}
	@Test
	public void testFindPage() {
		PageRequest pageRequest = PageRequest.of(1, 10, Direction.DESC, "name");
		Page<SysUser> findAll = repository.findAll(pageRequest);
		System.err.println("总条数是："+findAll.getTotalElements());
		System.err.println("size："+findAll.getSize());
		System.err.println("number："+findAll.getNumber());
		System.err.println("总页数："+findAll.getTotalPages());
		System.err.println("是否有上页："+findAll.hasPrevious());
		System.err.println("是否有下页："+findAll.hasNext());
		for(SysUser user:findAll) {
			System.out.println(user.toString());
		}
	}
	
	@Test
	public void testUpdate() {
		Optional<SysUser> findById = repository.findById(11);
		SysUser sysUser = findById.get();
		System.out.println(sysUser.toString());
		sysUser.setEmail("第二个@qq.com");
		SysUser save = repository.save(sysUser);
		System.out.println(save);
		
	}
	@Test
	public void testUpdate2() {
		SysUser sysUser = new SysUser();
		sysUser.setId(12);
		sysUser.setName("abc");
		sysUser.setRealName("李四");
		sysUser.setEmail("第二个@qq.com");
		SysUser save = repository.save(sysUser);
		System.out.println(save);
		
	}

}
