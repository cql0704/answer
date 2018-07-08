package com.cy.answer.dao;

import com.cy.answer.model.UserAnswerLog;
import com.cy.answer.model.UserAnswerLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAnswerLogMapper {
    int countByExample(UserAnswerLogExample example);

    int deleteByExample(UserAnswerLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAnswerLog record);

    int insertSelective(UserAnswerLog record);

    List<UserAnswerLog> selectByExample(UserAnswerLogExample example);

    UserAnswerLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAnswerLog record, @Param("example") UserAnswerLogExample example);

    int updateByExample(@Param("record") UserAnswerLog record, @Param("example") UserAnswerLogExample example);

    int updateByPrimaryKeySelective(UserAnswerLog record);

    int updateByPrimaryKey(UserAnswerLog record);
}