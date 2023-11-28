package com.ywy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ywy.dao.UserDao;
import com.ywy.domain.User;
import com.ywy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional(readOnly = false)
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }
    @Override
    public boolean delete(Integer uuid) {
        return userDao.delete(uuid);
    }

    @Override
    public User findUserById(Integer uuid) {
        return userDao.findUserById(uuid);
    }

    @Override
    public PageInfo<User> findAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<User> userList = userDao.findAll();
        return new PageInfo<User>( userList);
    }

    @Override
    public User login(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return userDao.findByUserNameAndPassword(user);
    }
}
