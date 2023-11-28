package com.ywy.service;

import com.github.pagehelper.PageInfo;
import com.ywy.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext-*.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

//    @Test
//    public void testSave(){
//        User user = new User();
//        user.setUserName("william");
//        user.setPassword("aaa");
//        user.setRealName("williamyi");
//        user.setBirthday(new Date());
//        user.setGender(0);
//        boolean flag = userService.save(user);
//        Assert.assertTrue(flag);
//    }
//    @Test
//    public void testUpdate(){
//        User user = new User();
//        user.setUuid(4);
//        user.setUserName("william");
//        user.setPassword("ccc");
//        user.setRealName("williamyi");
//        user.setBirthday(new Date());
//        user.setGender(0);
//        boolean flag = userService.update(user);
//        Assert.assertTrue(flag);
//    }
//    @Test
//    public void testDelete(){
//        boolean flag = userService.delete(3);
//        Assert.assertTrue(flag);
//    }
    @Test
    public void testFindById(){
        User user = userService.findUserById(1);
        Assert.assertNotNull(user);
    }
    @Test
    public void testFindAll(){
        PageInfo<User> userPageInfo = userService.findAll(1, 2);
        System.out.println(userPageInfo.getSize());
        Assert.assertNotEquals(userPageInfo.getSize(), 0);
    }
    @Test
    public void testLogin(){
        User user = userService.login("william", "ccc");
        Assert.assertNotNull("登录结果",user);
    }
}
