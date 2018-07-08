package com.cy.answer.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.answer.constant.FunConstant;
import com.cy.answer.exception.BizException;
import com.cy.answer.service.UserInfoService;



/**
 * 用户相关controller
 * @author cql
 *
 */
@Controller
@RequestMapping("userInfo/")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;

	/**
	 * 保存或更新用户信息
	 * @param wxId
	 * @param headImage
	 * @param nickName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("FUN-ANSWER-001")
	public Map<String, Object> saveOrUpdateUser(String wxId, String headImage, String nickName){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		try {
			userInfoService.saveOrUpdateUser(wxId, headImage, nickName);
		} catch (BizException e) {
			e.printStackTrace();
			resultMap.put(FunConstant.RESULT_FIELD, FunConstant.FAILED_NO);
			resultMap.put(FunConstant.RESULT_INFO, e.getMessage());
			return resultMap;
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put(FunConstant.RESULT_FIELD, FunConstant.FAILED_NO);
			resultMap.put(FunConstant.RESULT_INFO,"保存或更新用户信息失败");
			return resultMap;
		}
		
		resultMap.put(FunConstant.RESULT_FIELD, FunConstant.SUCCESS_No);
		resultMap.put(FunConstant.RESULT_INFO, "保存或更新用户信息成功");
		return resultMap;
		
	}
}
