package com.gaorui.service.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaorui.dao.UserDao;
import com.gaorui.service.IShowUser;

@Service
public class ImplShowUser implements IShowUser {
	@Autowired  
	private UserDao userDao;
	
//	@Override
	public List<Map<String, Object>> ShowUser() {
		// TODO Auto-generated method stub
		return userDao.ShowUser();
	}


}
