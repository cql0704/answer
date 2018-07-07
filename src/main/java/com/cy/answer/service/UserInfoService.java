package com.cy.answer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.answer.dao.UserInfoMapper;
import com.cy.answer.model.UserInfo;
import com.cy.answer.model.UserInfoExample;
import com.cy.answer.model.UserInfoExample.Criteria;

@Service
public class UserInfoService {
	
	@Autowired
	private UserInfoMapper userInfoDao;
	
	/**
	 * 根据微信id查找用户，只有当查找到一条记录时才返回
	 * @param wxId
	 * @return
	 */
	public UserInfo findByWxId(String wxId) {
		UserInfoExample userInfoExample = new UserInfoExample();
		Criteria criteria = userInfoExample.createCriteria();
		criteria.andWxIdEqualTo(wxId);
		List<UserInfo> list = userInfoDao.selectByExample(userInfoExample);
		
		if (list != null && list.size() == 1) {
			return list.get(0);
		} else {
			return null;
		}		
	}
}
