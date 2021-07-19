package com.lut.keshe.dao;

import com.lut.keshe.pojo.Timu;
import com.lut.keshe.pojo.TimuExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TimuMapper {
    int countByExample(TimuExample example);

    int deleteByExample(TimuExample example);

    int deleteByPrimaryKey(String name);

    int insert(Timu record);

    int insertSelective(Timu record);

    List<Timu> selectByExample(TimuExample example);

    Timu selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Timu record, @Param("example") TimuExample example);

    int updateByExample(@Param("record") Timu record, @Param("example") TimuExample example);

    int updateByPrimaryKeySelective(Timu record);

    int updateByPrimaryKey(Timu record);
}