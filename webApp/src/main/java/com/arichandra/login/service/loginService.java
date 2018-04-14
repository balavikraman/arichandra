package com.arichandra.login.service;

import java.util.Map;

public interface loginService{
	Map<String,Object> getAuth(Map<String,Object> ipMap);
}