package com.zyw.myleesite.module.sys.security;

/**
 * 用户 密码令牌
 * <p>Title: UsernamePasswordToken</p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/1/15 15:46
 */
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken {
    private static final long serialVersionUID = 1L;

    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public UsernamePasswordToken(){
        super();
    }

    public UsernamePasswordToken(String username, String password, boolean rememberMe, String host, String captcha){
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }
}
