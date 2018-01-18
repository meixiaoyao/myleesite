package com.zyw.myleesite.module.sys.dto;

public class LoginDTO {
    private String loginId;
    private String loginPwd;
    private String isRemember;
    private String validateCode;

    public LoginDTO() {
    }

    public LoginDTO(String loginId, String loginPwd, String isRemember, String validateCode) {
        this.loginId = loginId;
        this.loginPwd = loginPwd;
        this.isRemember = isRemember;
        this.validateCode = validateCode;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getIsRemember() {
        return isRemember;
    }

    public void setIsRemember(String isRemember) {
        this.isRemember = isRemember;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", isRemember='" + isRemember + '\'' +
                ", validateCode='" + validateCode + '\'' +
                '}';
    }
}
