package com.cy.answer.dao;

import com.cy.answer.model.UserAnswerRecord;
import com.cy.answer.model.UserAnswerRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAnswerRecordMapper {
    int countByExample(UserAnswerRecordExample example);

    int deleteByExample(UserAnswerRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserAnswerRecord record);

    int insertSelective(UserAnswerRecord record);

    List<UserAnswerRecord> selectByExample(UserAnswerRecordExample example);

    UserAnswerRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserAnswerRecord record, @Param("example") UserAnswerRecordExample example);

    int updateByExample(@Param("record") UserAnswerRecord record, @Param("example") UserAnswerRecordExample example);

    int updateByPrimaryKeySelective(UserAnswerRecord record);

    int updateByPrimaryKey(UserAnswerRecord record);
}