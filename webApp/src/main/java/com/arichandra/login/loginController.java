package com.arichandra.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arichandra.login.service.loginService;

@RestController
public class loginController{
	private loginService loginService;
	
	@Autowired(required=true)
	@Qualifier(value="loginService")
	public void setloginService(loginService ls){
		this.loginService = ls;
	}
	
	@RequestMapping(value="/getAuth", method=RequestMethod.POST)
	public Map<String,Object> getAuth(@RequestBody Map<String,Object> userMap){
		return this.loginService.getAuth(userMap);
	}
}