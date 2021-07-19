package com.lut.keshe.dao;

import com.lut.keshe.pojo.SOG;
import com.lut.keshe.pojo.SOGExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SOGMapper {
    int countByExample(SOGExample example);

    int deleteByExample(SOGExample example);

    int deleteByPrimaryKey(Integer studentID);

    int insert(SOG record);

    int insertSelective(SOG record);

    List<SOG> selectByExample(SOGExample example);

    SOG selectByPrimaryKey(Integer studentID);

    int updateByExampleSelective(@Param("record") SOG record, @Param("example") SOGExample example);

    int updateByExample(@Param("record") SOG record, @Param("example") SOGExample example);

    int updateByPrimaryKeySelective(SOG record);

    int updateByPrimaryKey(SOG record);
}