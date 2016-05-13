package com.gaorui.dao;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	public List<Map<String,Object>> ShowUser();
}
