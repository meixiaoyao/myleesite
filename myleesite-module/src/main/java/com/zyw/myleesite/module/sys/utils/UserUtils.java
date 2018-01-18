package com.zyw.myleesite.module.sys.utils;

import com.zyw.myleesite.module.sys.dto.LoginDTO;
import com.zyw.myleesite.module.sys.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpSession;

/**
 * 用户操作工具类
 * <p>Title: UserUtils</p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/1/16 14:34
 */
public class UserUtils {
    /**
     * 从会话获取用户信息
     * @param session
     * @return
     */
    public static User getUser(HttpSession session) {
        return (User) session.getAttribute("user");
    }

    /**
     * 获取当前登录对象
     *
     * @return
     */
    public static LoginDTO getPrincipal() {
        Subject subject = SecurityUtils.getSubject();
        LoginDTO loginDTO = (LoginDTO) subject.getPrincipal();
        if (loginDTO != null) {
            return loginDTO;
        }
        return null;
    }
}

