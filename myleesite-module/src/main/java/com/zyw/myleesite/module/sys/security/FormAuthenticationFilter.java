package com.zyw.myleesite.module.sys.security;

import com.zyw.myleesite.common.utils.StringUtils;
import com.zyw.myleesite.module.sys.dto.LoginDTO;
import com.zyw.myleesite.module.sys.entity.LoginFail;
import com.zyw.myleesite.module.sys.utils.UserUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

@Service
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {

    /**
     * 创建令牌
     * @param request
     * @param response
     * @return
     */
    public AuthenticationToken createToken(ServletRequest request, ServletResponse response){
        String username = WebUtils.getCleanParam(request, "loginId");
        String password = DigestUtils.md5DigestAsHex(WebUtils.getCleanParam(request, "loginPwd").getBytes());
        boolean rememberMe = "on".equals(WebUtils.getCleanParam(request, "isRemember")) ? true : false;
        String host = StringUtils.getRemoteAddress((HttpServletRequest) request);
        String validateCode = WebUtils.getCleanParam(request, "validateCode");
        return new UsernamePasswordToken(username, password, rememberMe, host, validateCode);
    }

    /**
     * 登录成功跳转
     * @param request
     * @param response
     * @throws Exception
     */
    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        LoginDTO principal = UserUtils.getPrincipal();
        if(principal != null){
            WebUtils.issueRedirect(request, response,"/main", null, true);
        }
    }

    /**
     * 登录失败调用
     * @param token
     * @param e
     * @param request
     * @param response
     * @return
     */
    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        String className = e.getClass().getName();
        if(IncorrectCredentialsException.class.getName().equals(className) || UnknownAccountException.class.getName().equals(className)){
            request.setAttribute("message", "用户名或密码错误，请重新输入");
        }
        else if(e.getMessage() != null && StringUtils.startsWith(e.getMessage(), "msg:")){
            request.setAttribute("message", e.getMessage().replace("msg:", ""));
        }
        return true;
    }
}