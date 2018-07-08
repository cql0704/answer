package com.cy.answer.model;

import java.util.Date;

/**
 * 用户信息
 * @author cql
 *
 */
public class UserInfo {
	//用户id
    private Integer userId;
    //微信id
    private String wxId;
    //微信头像
    private String headImage;
    //微信昵称
    private String nickName;
    //注册时间
    private Date registTime;
    //最后登录时间
    private Date lastLoginTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId == null ? null : wxId.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", wxId=" + wxId + ", headImage=" + headImage + ", nickName=" + nickName
				+ ", registTime=" + registTime + ", lastLoginTime=" + lastLoginTime + "]";
	}
    
    
}