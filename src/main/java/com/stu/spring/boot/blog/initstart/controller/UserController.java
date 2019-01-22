package com.stu.spring.boot.blog.initstart.controller;

import com.stu.spring.boot.blog.initstart.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserRespository userRespository;

    /**
     * 查询所有
     */
    @ResponseBody
    @GetMapping("list")
    public ModelAndView userList(Model model){
        model.addAttribute("users",userRespository.findAll());
        return new ModelAndView("user/list","userModel",model);
    }
}
