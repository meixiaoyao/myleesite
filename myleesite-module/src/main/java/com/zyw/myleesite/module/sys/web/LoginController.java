package com.zyw.myleesite.module.sys.web;

import com.zyw.myleesite.common.utils.IDUtils;
import com.zyw.myleesite.module.sys.dto.LoginDTO;
import com.zyw.myleesite.module.sys.utils.UserUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    /**
     * 登陆成功 跳转页面
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login(){
        LoginDTO principal = UserUtils.getPrincipal();
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

}
