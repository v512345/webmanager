package com.aihsoft.test.modules.cms.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.aihsoft.modules.cms.service.ArticleService;


@Transactional  
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-context.xml"})
@TransactionConfiguration( defaultRollback = true)  
public class ArticleServiceTest {
	@Autowired
	private ArticleService articleService;
	@Before
	public void before() throws Exception {
		System.out.println("测试开始:============start==================");
	}
	
	@Test  
	public void test() throws Exception{
		System.out.println(articleService.get("1").getId());
		
	}
	
	@After
	public void after() throws Exception {
		System.out.println("测试结束:============end==================");
	}
}
