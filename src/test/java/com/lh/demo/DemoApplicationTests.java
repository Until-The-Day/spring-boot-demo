package com.lh.demo;

import com.lh.models.sys.dao.UserDao;
import com.lh.models.sys.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        SysUser sysUser = userDao.getById(1L);
        System.out.println(sysUser.getUserName());
    }

}
