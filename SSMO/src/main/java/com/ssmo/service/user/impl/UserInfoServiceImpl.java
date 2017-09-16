package com.ssmo.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssmo.dao.user.UserInfoMapper;
import com.ssmo.model.user.UserInfo;
import com.ssmo.service.user.UserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	
	@Resource
	private UserInfoMapper userInfoMapper;
	
	public UserInfo getUserInfoById(Integer id) {
		return userInfoMapper.getUserInfoById(id);
	}

	public List<UserInfo> getUserInfoAll() {
		return userInfoMapper.getUserInfoAll();
	}

	public UserInfo getUserInfoByName(String username) {
		return userInfoMapper.getUserInfoByName(username);
	}

}
