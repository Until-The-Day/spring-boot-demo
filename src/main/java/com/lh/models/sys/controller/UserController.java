package com.lh.models.sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sys/user")
public class UserController {

    @GetMapping("getUser")
    public Map<String, Object> getUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "张三");
        return map;
    }
}
