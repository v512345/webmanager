package com.aihsoft.modules.cms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aihsoft.modules.cms.service.ArticleService;
@Controller
@RequestMapping(value = "/article")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	@ResponseBody
	@RequestMapping(value="test")
	public String  test(HttpServletRequest request,HttpServletResponse response){
		return 	articleService.getaArticle("1").getId();
//		String a=request.getParameter("a");
//		return "sucess:"+a;
	}
}
