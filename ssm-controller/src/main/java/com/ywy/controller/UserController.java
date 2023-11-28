package com.ywy.controller;

import com.github.pagehelper.PageInfo;
import com.ywy.controller.result.R;
import com.ywy.controller.result.ResultStatus;
import com.ywy.domain.User;
import com.ywy.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping
    public R<Boolean> saveUser(@RequestBody User user) {
        return new R<Boolean>(userService.save(user), HttpStatus.OK.value(), ResultStatus.SUCCESS.ordinal(), null);
    }
    @GetMapping("/{page}/{size}")
    public R<PageInfo<User>> findAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        return new R<>(userService.findAll(page, size), HttpStatus.OK.value(), ResultStatus.SUCCESS.ordinal(), null);
    }
    @PutMapping
    public R<Boolean> updateById(@RequestBody User user) {
        return new R<Boolean>(userService.update(user), HttpStatus.OK.value(), ResultStatus.SUCCESS.ordinal(), null);
    }
    @GetMapping("/{uuid}")
    public R<User> findById(@PathVariable("uuid") Integer uuid) {
        return new R<User>(userService.findUserById(uuid), HttpStatus.OK.value(), ResultStatus.SUCCESS.ordinal(), null);
    }
    @DeleteMapping("/{uuid}")
    public R<Boolean> deleteById(@PathVariable("uuid") Integer uuid) {
        return new R<Boolean>(userService.delete(uuid), HttpStatus.OK.value(), ResultStatus.SUCCESS.ordinal(), null);
    }
    @PostMapping("/login/{userName}/{password}")
    public R<User> login(@PathVariable("userName") String userName, @PathVariable("password") String password) {
        return new R<User>(userService.login(userName,password), HttpStatus.OK.value(), ResultStatus.SUCCESS.ordinal(), null);
    }
}
