package com.nopava.whodo.controller;


import com.nopava.whodo.service.Impl.IUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户与组对应表 前端控制器
 * </p>
 *
 * @author ruanjiewei
 * @since 2020-08-10
 */
@Controller
@RequestMapping("/userGroupAnnal")
public class UserGroupAnnalController {

    @Autowired
    private IUserServiceImpl userService;

    @GetMapping("/")
    @ResponseBody
    public Object getUser(){
        return userService.getById(1).getName();
    }

}
