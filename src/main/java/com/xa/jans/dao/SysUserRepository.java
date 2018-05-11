package com.xa.jans.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xa.jans.entity.SysUser;

/**
 * @author zyl
 * @date 2018年3月1日
 * @desc 这里使用了findBy，也可以用find,read,readBy,query,queryBy,get,getBy代替。
 */
public interface SysUserRepository extends JpaRepository<SysUser, Integer> {

	/**
	 * 通过名称相等查询 相当于 select * from person p where p.name = ?
	 */
	SysUser findByName(String name);
	
//	@Modifying
//	@Transactional
//	@Query("SELECT * FROM SYS_USER S WHERE S.ID != :id AND S.NAME=:name")
	@Query(value = "SELECT * FROM SYS_USER S WHERE S.ID != ?1 AND S.NAME=?2", nativeQuery = true)
	List<SysUser> findRepeatName(Integer id,String name);

	/**
	 * 这里使用的是@Query查询。
	 */
	// @Query("select * from person p where p.name = ?")
	// List<Person> fffindByName(String name);
	/**
	 * 通过名称模糊查询 相当于 select * from person p where p.name like ?
	 */
	List<SysUser> findByNameLike(String name);

	/**
	 * 排序查询 使用方式：List<Person> people = personRepository.findByName("x",new
	 * Sort(Direction.ASC,"age"));
	 */
	List<SysUser> findByNameLike(String name, Sort sort);

	/**
	 * 分页查询 使用方式：Page<Person> people = personRepository.findByName("x",new
	 * PageRequest(0,10));
	 */
	Page<SysUser> findByName(String name, Pageable pageable);
	

	/**
	 * @param name
	 * @return 影响的行数
	 */
//	@Modifying
//	@Transactional
//	@Query("update Person p set p.age=? where p.name=?")
//	int setAgeByName(String name);

}
