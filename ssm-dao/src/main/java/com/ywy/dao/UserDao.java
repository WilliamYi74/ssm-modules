package com.ywy.dao;

import com.ywy.domain.User;

import java.util.List;
public interface UserDao {
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
    public List<User> findAll();

    /**
     * 根据用户名和密码查询用户
     * tips: dao层方法名只和数据有关系 不能取login 业务层才叫login 表示业务含义
     * @param userName
     * @param password
     * @return
     */
    public User findByUserNameAndPassword(User user);
}
