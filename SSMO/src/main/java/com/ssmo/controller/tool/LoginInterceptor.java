package com.ssmo.controller.tool;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		//获取request的cookie
	    Cookie[] cookies = request.getCookies();
	    System.out.println("查询cookie");
	    if (null==cookies) {
	      System.out.println("没有cookie==============");
	    } else {
	    	//遍历cookie如果找到登录状态则返回true执行原来controller的方法
	    	System.out.println("有cookie==============");
	      for(Cookie cookie : cookies){
	    	  System.out.println(cookie.getName());
	    	  if(cookie.getName().equals("isLogin")){
	    		  System.out.println("有cookie,cookie正确==============");
	          return true;
	        }
	      }
	      System.out.println("有cookie,但cookie不对==============");
	    }
	    //没有找到登录状态则重定向到登录页，返回false，不执行原来controller的方法
	    response.sendRedirect("/SSMO/index.jsp");
	    return false;
	}

}
