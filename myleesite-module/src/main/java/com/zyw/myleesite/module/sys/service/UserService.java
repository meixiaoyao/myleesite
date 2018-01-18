package com.zyw.myleesite.module.sys.service;

import com.zyw.myleesite.module.sys.entity.User;

import java.util.List;

public interface UserService {
    public User searchByLoginId(String loginId);

    public void delete(String id);

    public void save(String id);

    public List<User> searchAll();

    public List<User> searchByKeyword(String keyword);
}
