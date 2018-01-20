package com.zyw.myleesite.module.sys.security;

import com.zyw.myleesite.common.utils.StringUtils;
import com.zyw.myleesite.module.sys.utils.UserUtils;
import com.zyw.myleesite.module.sys.web.LoginController;
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
import java.security.Principal;

@Service
public class FormAuthenticationFilter extends org.apache.shiro.web.filter.authc.FormAuthenticationFilter {
    public static final String DEFAULT_CAPTCHA_PARAM = "validateCode";
    public static final String DEFAULT_MESSAGE_PARAM = "message";

    private String catptchaParam = DEFAULT_CAPTCHA_PARAM;
    private String messageParam = DEFAULT_MESSAGE_PARAM;

    /**
     * 创建令牌
     * @param request
     * @param response
     * @return
     */
    public AuthenticationToken createToken(ServletRequest request, ServletResponse response){
        String username = getUsername(request);
        String password = DigestUtils.md5DigestAsHex(getPassword(request).getBytes());
        if(password == null){
            password = "";
        }
        boolean rememberMe = isRememberMe(request);
        String host = StringUtils.getRemoteAddr((HttpServletRequest) request);
        String captcha = getCaptcha(request);
        return new UsernamePasswordToken(username, password, rememberMe, host, captcha);
    }

    public String getMessageParam(){
        return messageParam;
    }

    public String getCaptcha(ServletRequest request){
        return WebUtils.getCleanParam(request, catptchaParam);
    }
    /**
     * 登录成功跳转
     * @param request
     * @param response
     * @throws Exception
     */
    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        Principal principal = UserUtils.getPrincipal();
        if(principal != null){
            // 登录成功清除
            LoginController.isValidateCodeLogin(principal.getName(),false,true);
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
        String className = e.getClass().getName(), message= "";
        if(IncorrectCredentialsException.class.getName().equals(className) || UnknownAccountException.class.getName().equals(className)){
            message = "用户名或密码错误，请重试";
        }
        else if(e.getMessage() != null && StringUtils.startsWith(e.getMessage(), "msg:")){
            message = StringUtils.replace(e.getMessage(), "msg:", "");
            e.printStackTrace();
        }else{
            message = "系统出现问题，请稍后再试";
        }
        request.setAttribute(getFailureKeyAttribute(), className);
        request.setAttribute(getMessageParam(), message);
        return true;
    }


}
