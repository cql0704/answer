package com.cy.answer.model;

import java.util.Date;

public class UserAnswerRecord {
    private Integer id;

    private Integer userId;

    private Integer answerAmount;

    private Integer rightAmount;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAnswerAmount() {
        return answerAmount;
    }

    public void setAnswerAmount(Integer answerAmount) {
        this.answerAmount = answerAmount;
    }

    public Integer getRightAmount() {
        return rightAmount;
    }

    public void setRightAmount(Integer rightAmount) {
        this.rightAmount = rightAmount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}