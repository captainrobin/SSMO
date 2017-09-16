package com.ssmo.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmo.model.user.UserInfo;
import com.ssmo.service.user.UserInfoService;

/**
 * ”√ªß
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
	
	@ResponseBody
	@RequestMapping("/login.do")
	public Map<String , Object> login(String username,String password){
		Map<String , Object> map = new HashMap<String , Object>();
		if(username == null || ("").equals(username) || password == null || ("").equals(password)){
			map.put("massage", 1);
			return map;
		}
		UserInfo userInfo = userInfoService.getUserInfoByName(username);
		if(userInfo == null){
			map.put("massage", 2);
			return map;
		}
		if(!userInfo.getPassword().equals(password)){
			map.put("massage", 3);
			return map;
		}
		map.put("massage", 0);
		return map;
	}
	

}
