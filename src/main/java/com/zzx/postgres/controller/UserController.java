package com.zzx.postgres.controller;

import com.zzx.postgres.dao.UserDao;
import com.zzx.postgres.po.UserPO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    Logger logger= LoggerFactory.getLogger("InfoLogs");
    @Autowired
    UserDao userDao;

    @GetMapping("/all")
    public List<UserPO> all(){
        logger.info("获取到数据库数据！{}",userDao.all());
        return userDao.all();
    }
}
