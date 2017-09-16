package com.ssmo.service.user;

import java.util.List;

import com.ssmo.model.user.UserInfo;

public interface UserInfoService {
	
	public UserInfo getUserInfoById(Integer id);
	
	public List<UserInfo> getUserInfoAll();

	public UserInfo getUserInfoByName(String username);

}
