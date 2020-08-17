package com.leaves.controller;

import com.leaves.service.UserService;
import com.leaves.utils.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/alluser", method = RequestMethod.GET)
    public Msg queryAllUser(){
        log.info(new Msg().getCode()+"");
        return userService.selectAllUser();
    }
}
