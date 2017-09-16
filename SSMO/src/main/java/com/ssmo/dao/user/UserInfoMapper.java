package com.ssmo.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssmo.model.user.UserInfo;

@Repository("userInfoMapper")
public interface UserInfoMapper {
	
	public UserInfo getUserInfoById(Integer id);
	
	public List<UserInfo> getUserInfoAll();

	public UserInfo getUserInfoByName(String username);

}
