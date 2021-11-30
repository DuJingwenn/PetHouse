package com.pethouse.controller;


import com.pethouse.entity.UserInfo;
import com.pethouse.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Daven
 * @since 2021-10-05
 */
@RestController
@RequestMapping("/user-info")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @RequestMapping("/one")
    public UserInfo test(){
        return userInfoService.getById(1);
    }

}
