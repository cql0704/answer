package com.cy.answer.constant;

/**
 * 接口功能号枚举
 * @author cql
 *
 */
public enum FunctionCodeEnum {

	FUN_ANSWER_0001("FUN-ANSWER-001","保持或更新用户信息"),
	
	;
	//接口功能号
	private String funCode;
	//接口描述
	private String funDes;
	
	private FunctionCodeEnum(String funCode, String funDes) {
		this.funCode = funCode;
		this.funDes = funDes;
	}
	
	public String getFunCode() {
		return funCode;
	}
	
	public String getFunDes() {
		return funDes;
	}
	
}
