package com.chia.controller;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:chia-servlet.xml",
		"classpath:chia-service.xml",
		"classpath:chia-dao.xml"}) 
public class BaseControllerTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	protected MockMvc mockMvc;
	
	@Test
	public viod test(){
		
	}

}
