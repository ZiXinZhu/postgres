package com.zzx.postgres.controller;

import com.zzx.postgres.dao.UserDao;
import com.zzx.postgres.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @GetMapping("/all")
    public List<UserPO> all(){
        return userDao.all();
    }
}
