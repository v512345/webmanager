package com.aihsoft.test.modules.cms.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.aihsoft.modules.cms.controller.ArticleController;

@Transactional  
@TransactionConfiguration(defaultRollback = true)  
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring-mvc.xml","classpath:spring-context.xml"})  
public class ArticleContrllerTest  {
	@Resource(name="articleController")  
	ArticleController articleController;  

	private MockHttpServletRequest request;  
	private MockHttpServletResponse response;  

	@Before  
	public void before() {  
		request = new MockHttpServletRequest();  
		response = new MockHttpServletResponse();  
		request.setCharacterEncoding("UTF-8");  
	}  

	@Test  
	public void testToSearchPage()  {  
//		request.setParameter("a","2");
//		request.setRequestURI("/article/test.do?a=2");  
//		request.setMethod(HttpMethod.GET.name());  
		 request.addParameter("a", "2011-11-29");  

		String mv = null;  
		try  {  
			mv = articleController.test(request,response);  
			System.out.println(mv);
		}catch (Exception e){  
			e.printStackTrace();  
			fail("testToSearchPage failed!");  
		}  
		assertNotNull(mv);  
		assertEquals(response.getStatus(), 200);  
	}  
}
