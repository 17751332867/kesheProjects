package com.lut.keshe.dao;

import com.lut.keshe.pojo.STTLink;
import com.lut.keshe.pojo.STTLinkExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface STTLinkMapper {
    int countByExample(STTLinkExample example);

    int deleteByExample(STTLinkExample example);

    int deleteByPrimaryKey(Integer studentID);

    int insert(STTLink record);

    int insertSelective(STTLink record);

    List<STTLink> selectByExample(STTLinkExample example);

    STTLink selectByPrimaryKey(Integer studentID);

    int updateByExampleSelective(@Param("record") STTLink record, @Param("example") STTLinkExample example);

    int updateByExample(@Param("record") STTLink record, @Param("example") STTLinkExample example);

    int updateByPrimaryKeySelective(STTLink record);

    int updateByPrimaryKey(STTLink record);
}