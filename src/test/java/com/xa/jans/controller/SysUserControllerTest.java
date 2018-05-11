package com.xa.jans.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class SysUserControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void test() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/user/page").param("pageNum", "0").param("pageSize", "8"))
		.andExpect(MockMvcResultMatchers.status().isOk());
//		.andExpect(MockMvcResultMatchers.content().string("abc"));
	}

}
