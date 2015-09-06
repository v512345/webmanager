package com.aihsoft.common.listener;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;

import com.aihsoft.common.config.Global;

public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {
	
	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		if (!printKeyLoadMessage()){
			return null;
		}
		return super.initWebApplicationContext(servletContext);
	}
	
	/**
	 * 获取Key加载信息
	 */
	public static boolean printKeyLoadMessage(){
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n======================================================================\r\n");
		sb.append("当前时间为："+new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(new Date())+"\r\n    欢迎使用 "+Global.getConfig("productName")+" \r\n");
		sb.append("\r\n======================================================================\r\n");
		System.out.println(sb.toString());
		return true;
	}
}
