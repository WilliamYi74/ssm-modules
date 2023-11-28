package com.ywy.service;

import com.github.pagehelper.PageInfo;
import com.ywy.domain.User;

public interface UserService {
    /**
     * 保存用户
     * @param user
     * @return
     */
    public boolean save(User user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    public boolean update(User user);

    /**
     * 删除用户
     * @param uuid
     * @return
     */
    public boolean delete(Integer uuid);

    /**
     * 根据单个用户
     * @param uuid
     * @return
     */
    public User findUserById(Integer uuid);

    /**
     * 查询所有用户
     * @return
     */
    public PageInfo<User> findAll(int page, int size);

    /**
     * 根据用户名和密码登录
     * @param userName
     * @param password
     * @return
     */
    public User login(String userName, String password);
}
