package com.zyw.myleesite.module.sys.entity;

/**
 * <p>Title: LoginFail </p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/18 上午 10:12
 */
public class LoginFail {
    private String loginId;
    private int failCount;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    public LoginFail() {
    }

    public LoginFail(String loginId, int failCount) {
        this.loginId = loginId;
        this.failCount = failCount;
    }
}
