package com.cy.answer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.answer.model.UserInfo;
import com.cy.answer.service.UserInfoService;

@Controller
@RequestMapping("test/")
public class Test {
	
	@Autowired
	private UserInfoService userInfoService;
		
	@ResponseBody
	@RequestMapping("hello")
	public Object testUser(String wxId) {
		UserInfo userInfo = userInfoService.findByWxId(wxId);
		System.out.println(userInfo);
		return "hello world";
	}
 	
}
