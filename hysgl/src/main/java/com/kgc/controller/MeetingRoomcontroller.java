package com.kgc.controller;

import com.kgc.pojo.Meetngroom;
import com.kgc.service.MeetngroomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MeetingRoomcontroller  {
    @Resource
    MeetngroomService meetngroomService;
    @RequestMapping("/list")
    public String list(Model model){
        List<Meetngroom> list=meetngroomService.getlist();
        model.addAttribute("list", list);
        return "/index";
    }
    @RequestMapping("/toadd")
    public String add(Meetngroom meetngroom){
        int i=meetngroomService.add(meetngroom);

        return "redirect:/list";
    }

}
