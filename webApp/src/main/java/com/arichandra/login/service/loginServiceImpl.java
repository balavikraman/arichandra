package com.arichandra.login.service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService{

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public Map<String, Object> getAuth(Map<String, Object> ipMap) {
		Map<String,Object> returnMap = new HashMap<String,Object>();
		
		returnMap.put("serviceStatus", "Success");
		return returnMap;
	}
	
}