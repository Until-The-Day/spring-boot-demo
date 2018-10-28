package com.lh.models.sys.controller;

import com.lh.models.sys.dao.UserDao;
import com.lh.models.sys.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sys/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("getUser")
    public Map<String, Object> getUser() {
        Map<String, Object> map = new HashMap<>();
        SysUser sysUser = userDao.getById(1L);
        map.put("1", sysUser);
//        map.put("1", "张三");
        return map;
    }
}
