package com.fengze.ssm.web;

import com.fengze.ssm.common.Response;
import com.fengze.ssm.model.UserDo;
import com.fengze.ssm.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ASUS on 2017/4/25.
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/all")
    public Response<List<UserDo>> getUserAll(){

        return new Response<>(userService.selectAll());

    }

}
