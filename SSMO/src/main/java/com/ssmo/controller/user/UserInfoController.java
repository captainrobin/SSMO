package com.ssmo.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmo.model.user.UserInfo;
import com.ssmo.service.user.UserInfoService;

/**
 * 用户
 * @author no one
 *
 */
@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@Resource
	private UserInfoService userInfoService;
	
	@RequestMapping("/toRegister.html")
	public String toRegister(){
		return "register";
	}
	
	@RequestMapping("/transfer.html")
	public String transfer(HttpServletRequest request, HttpServletResponse response){
		
		return "transfer";
	}
	
	@ResponseBody
	@RequestMapping("/login.do")
	public Map<String , Object> login(HttpServletRequest request, HttpServletResponse response,String username,String password){
		Map<String , Object> map = new HashMap<String , Object>();
		if(username == null || ("").equals(username) || password == null || ("").equals(password)){
			map.put("massage", 1);//账号或密码为空！
			return map;
		}
		UserInfo userInfo = userInfoService.getUserInfoByName(username);
		if(userInfo == null){
			map.put("massage", 2);//账号不存在！
			return map;
		}
		if(!userInfo.getPassword().equals(password)){
			map.put("massage", 3);//密码错误！
			return map;
		}
		map.put("massage", 0);//账号验证通过！正在为您跳转...
		Cookie username_cookie=new Cookie("isLogin", "isOK");
		username_cookie.setMaxAge(30 * 60);
        response.addCookie(username_cookie);
        
		return map;
	}
	

}
