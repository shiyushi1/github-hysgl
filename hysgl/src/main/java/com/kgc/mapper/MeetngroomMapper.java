package com.kgc.mapper;

import com.kgc.pojo.Meetngroom;
import com.kgc.pojo.MeetngroomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeetngroomMapper {
    int countByExample(MeetngroomExample example);

    int deleteByExample(MeetngroomExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Meetngroom record);

    int insertSelective(Meetngroom record);

    List<Meetngroom> selectByExample(MeetngroomExample example);

    Meetngroom selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Meetngroom record, @Param("example") MeetngroomExample example);

    int updateByExample(@Param("record") Meetngroom record, @Param("example") MeetngroomExample example);

    int updateByPrimaryKeySelective(Meetngroom record);

    int updateByPrimaryKey(Meetngroom record);
}