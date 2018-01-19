package com.zyw.myleesite.module.sys.web;

import com.zyw.myleesite.common.utils.CacheUtils;
import com.zyw.myleesite.common.utils.IDUtils;
import com.zyw.myleesite.module.sys.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    static Map<Principal, Integer> failMap = new HashMap<>();

    /**
     * 登陆成功 跳转页面
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login(){
        Principal principal = UserUtils.getPrincipal();
        if(principal != null){
            return "redirect:/main";
        }
        return "modules/sys/sysLogin";
    }

    /**
     * 登录失败清空验证码
     * @param request
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String loginFail(HttpServletRequest request){
        request.getSession().setAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY, IDUtils.getId());
        return "modules/sys/sysLogin";
    }


    /**
     * 判断是否验证 验证码登录
     * @param username
     * @param isFail
     * @return
     */
    public static boolean isValidateCodeLogin(String username, boolean isFail, boolean clean){
        Map<String, Integer> loginFailMap = (Map<String, Integer>)CacheUtils.get("loginFailMap");
        if(loginFailMap == null){
            loginFailMap = new HashMap<>();
            CacheUtils.put("loginFailMap", loginFailMap);
        }
        Integer loginFailNum = loginFailMap.get(username);
        // 登录失败时，次数加1
        if(isFail){
            loginFailMap.put(username,loginFailNum++);
        }
        // 登录成功之后 删除用户记录
        if(clean){
            loginFailMap.remove(username);
        }
        // 失败次数大于等于2时，需要验证登录
        return loginFailMap.get(username) >= 2;
    }
}
