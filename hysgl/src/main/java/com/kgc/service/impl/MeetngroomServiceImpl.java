package com.kgc.service.impl;

import com.kgc.mapper.MeetngroomMapper;
import com.kgc.pojo.Meetngroom;
import com.kgc.pojo.MeetngroomExample;
import com.kgc.service.MeetngroomService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("meetngroomService")
public class MeetngroomServiceImpl implements MeetngroomService {
    @Resource
    MeetngroomMapper meetngroomMapper;
    @Override
    public List<Meetngroom> getlist() {
        MeetngroomExample example=new MeetngroomExample();
        MeetngroomExample.Criteria criteria=example.createCriteria();
        List<Meetngroom> list=meetngroomMapper.selectByExample(null);
        return list;
    }

    @Override
    public int add(Meetngroom meetngroom) {
        int i=meetngroomMapper.insertSelective(meetngroom);
        return i;
    }
}
