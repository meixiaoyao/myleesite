package com.zyw.myleesite.module.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 跳转主页
 * <p>Title: MainController</p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/1/17 0017 下午 5:19
 */
@Controller
public class MainController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(){
        return "modules/sys/sysLogin";
    }
}
