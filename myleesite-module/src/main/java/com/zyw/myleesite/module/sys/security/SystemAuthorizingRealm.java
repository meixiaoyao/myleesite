package com.zyw.myleesite.module.sys.security;

import com.zyw.myleesite.common.config.Global;
import com.zyw.myleesite.common.utils.Encodes;
import com.zyw.myleesite.module.sys.entity.User;
import com.zyw.myleesite.module.sys.service.UserService;
import com.zyw.myleesite.module.sys.utils.UserUtils;
import com.zyw.myleesite.module.sys.web.LoginController;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
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
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;

        if(LoginController.isValidateCodeLogin(token.getUsername(),false,false)){
            String validateCode = (String) UserUtils.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
            // 验证码错误
            if(token.getCaptcha() == null && !token.getCaptcha().equals(validateCode)) {
                throw new AuthenticationException("msg:验证码错误，请重试");
            }
        }

        // 验证码正确
        User user = userService.searchByLoginId(token.getUsername());
        // 用户验证
        if(user != null){
            // 判断是否允许登录
            if(Global.NO.equals(user.getLoginFlag())){
                throw new AuthenticationException("msg:该账号禁止登录");
            }
            // 密码加密
            byte[] salt = Encodes.decodeHex(user.getPassword().substring(0, 16));
            return new SimpleAuthenticationInfo(new Principal(user), user.getPassword().substring(16), ByteSource.Util.bytes(salt), user.getName());
        }
         return null;
    }




    /**
     * 授权用户信息
     */
    private static class Principal{
        private static final long serialVersionUID = 1L;

        private String id;
        private String loginName;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLoginName() {
            return loginName;
        }

        public void setLoginName(String loginName) {
            this.loginName = loginName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

         public Principal(User user) {
            this.id = user.getId();
            this.loginName = user.getLoginName();
            this.name = user.getName();
        }

        public String seesionId(){
            try{
                return (String) UserUtils.getSession().getId();
            }catch (Exception e){
                return "";
            }
        }

        @Override
        public String toString() {
            return id;
        }
    }

}
