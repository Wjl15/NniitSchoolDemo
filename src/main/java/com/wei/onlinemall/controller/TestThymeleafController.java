package com.wei.onlinemall.controller;

import com.wei.onlinemall.pogo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author WeiJinLong
 * @Date 2022-09-15 14:31
 */
@Controller
@RequestMapping("/thymeleaf")
public class TestThymeleafController {

    @RequestMapping("/")

   public String test(Model model){

//    public ModelAndView test(){

        model.addAttribute("msg","这是传递过来的信息");

        Person person = Person.builder()
                .pname("wjl")
                .password("123123")
                .page(2).build();

//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("index");
//        modelAndView.addObject("msg", "这是传递过来的信息");
//
//        return modelAndView;

        return "index";


    }
}
