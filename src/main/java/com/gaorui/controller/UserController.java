package com.gaorui.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.gaorui.service.IShowUser;
import com.gaorui.util.CommonUtil;



@Controller
@RequestMapping(value="User")
public class UserController {
	@Autowired  
	private IShowUser iShowUser;
	
	 @RequestMapping(value="ShowUser")
	 @ResponseBody
	 public JSONObject ShowUser(HttpServletRequest request){
		 System.out.println("remote:"+request.getRemoteUser());
	    	return CommonUtil.constructResponse(1,"数据库错误",iShowUser.ShowUser());
	    }
	 
	 @RequestMapping(value="Hello")
	 public String Hello(){
	    	
	    	return "Hello";
	    }
}
