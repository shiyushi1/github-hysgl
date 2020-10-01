package com.kgc.service;

import com.kgc.pojo.Meetngroom;

import java.util.List;

public interface MeetngroomService {
   List<Meetngroom>  getlist();

   int add(Meetngroom meetngroom);

}
