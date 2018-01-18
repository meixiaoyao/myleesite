package com.zyw.myleesite.module.sys.security;

import com.zyw.myleesite.module.sys.dto.LoginDTO;
import com.zyw.myleesite.module.sys.entity.User;
import com.zyw.myleesite.module.sys.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 系统安全认证实现类
 * <p>Title: SystemAuthorizingRealm</p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/1/15 16:08
 */
@Service
public class SystemAuthorizingRealm extends AuthorizingRealm {
    private static final String ROLE_ADMIN = "admin";
    private static final String ROLE_ADMIN_PERMISION = "sys:user:add, sys:user:delete, sys:user:save";

    @Autowired
    private UserService userService;

    /**
     * 授权查询回调函数，进行鉴权但缓存中无用户的授权信息时调用
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole(ROLE_ADMIN);
        for(String permision : StringUtils.split(ROLE_ADMIN_PERMISION, ",")){
            info.addStringPermission(permision);
        }
        return info;
    }

    /**
     * 认证回调函数，登录时调用
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)authenticationToken;

        String validateCode = (String)getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);

        if(validateCode != null){
            if(!usernamePasswordToken.getValidateCode().equals(validateCode)){
                throw new AuthenticationException("msg:验证码错误，请重新输入");
            }
            User user = userService.searchByLoginId(usernamePasswordToken.getUsername());
            // 用户验证
            if(user != null){
                String loginId = usernamePasswordToken.getUsername();
                String loginPwd = usernamePasswordToken.getPassword().toString();
                String rememberMe = usernamePasswordToken.isRememberMe() ? "on" : "";
                return new SimpleAuthenticationInfo(new LoginDTO(loginId, loginPwd, rememberMe, null), user.getLoginName(), user.getPassword());
            }
        }
        return null;
    }

    /**
     * 获取shiro管理的session
     * @return
     */
    private Session getSession(){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        if(session == null){
            session = subject.getSession();
        }
        return session;
    }
}
