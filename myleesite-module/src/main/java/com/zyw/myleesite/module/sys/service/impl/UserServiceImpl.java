package com.zyw.myleesite.module.sys.service.impl;

import com.zyw.myleesite.module.sys.mapper.SysUserMapper;
import com.zyw.myleesite.module.sys.service.UserService;
import com.zyw.myleesite.module.sys.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 通过用户id查询用户
     * @param loginId
     * @return
     */
    @Override
    public User searchByLoginId(String loginId) {
        User user = null;
        Example example = new Example(User.class);
        // 创建查询条件  可以通过用户名、邮箱、手机号登录
        example.createCriteria()
                .andEqualTo("login_name", loginId)
                .orEqualTo("email", loginId)
                .orEqualTo("phone", loginId)
                .orEqualTo("mobile", loginId);

         List<User> userList = sysUserMapper.selectByExample(example);
         if(userList != null){
             user = userList.get(0);
         }
        return user;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void save(String id) {

    }

    /**
     * 查询所有用户为list
     * @return
     */
    @Override
    public List<User> searchAll() {
        List<User> userList;
        userList = sysUserMapper.selectAll();
        return userList;
    }

    @Override
    public List<User> searchByKeyword(String keyword) {
        return null;
    }
}
