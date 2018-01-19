package com.zyw.myleesite.module.sys.utils;

import com.zyw.myleesite.common.utils.CacheUtils;
import com.zyw.myleesite.module.sys.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import javax.servlet.http.HttpSession;
import java.security.Principal;

/**
 * 用户操作工具类
 * <p>Title: UserUtils</p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/1/16 14:34
 */
public class UserUtils {
//    private static UserDao userDao = SpringContextHolder.getBean(UserDao.class);
//    private static RoleDao roleDao = SpringContextHolder.getBean(RoleDao.class);
//    private static MenuDao menuDao = SpringContextHolder.getBean(MenuDao.class);
//    private static AreaDao areaDao = SpringContextHolder.getBean(AreaDao.class);
//    private static OfficeDao officeDao = SpringContextHolder.getBean(OfficeDao.class);

    public static final String USER_CACHE = "userCache";
    public static final String USER_CACHE_ID_ = "id_";
    public static final String USER_CACHE_LOGIN_NAME_ = "ln";
    public static final String USER_CACHE_LIST_BY_OFFICE_ID_ = "oid_";

    public static final String CACHE_ROLE_LIST = "roleList";
    public static final String CACHE_MENU_LIST = "menuList";
    public static final String CACHE_AREA_LIST = "areaList";
    public static final String CACHE_OFFICE_LIST = "officeList";
    public static final String CACHE_OFFICE_ALL_LIST = "officeAllList";
//    /**
//     * 根据ID获取用户
//     *
//     * @param id
//     * @return 取不到返回null
//     */
//    public static User get(String id) {
//        User user = (User) CacheUtils.get(USER_CACHE, USER_CACHE_ID_ + id);
//        if (user == null) {
//            user = userDao.get(id);
//            if (user == null) {
//                return null;
//            }
//            user.setRoleList(roleDao.findList(new Role(user)));
//            CacheUtils.put(USER_CACHE, USER_CACHE_ID_ + user.getId(), user);
//            CacheUtils.put(USER_CACHE, USER_CACHE_LOGIN_NAME_ + user.getLoginName(), user);
//        }
//        return user;
//    }
//
//    /**
//     * 获取当前用户
//     *
//     * @return 取不到返回 new User()
//     */
//    public static User getUser() {
//        Principal principal = getPrincipal();
//        if (principal != null) {
//            User user = get(principal.getId());
//            if (user != null) {
//                return user;
//            }
//            return new User();
//        }
//        // 如果没有登录，则返回实例化空的User对象。
//        return new User();
//    }
    /**
     * 从会话获取用户信息
     * @param session
     * @return
     */
    public static User getUser(HttpSession session) {
        return (User) session.getAttribute("user");
    }
    /**
     * 获取当前登录对象
     *
     * @return
     */
    public static Principal getPrincipal() {
        Subject subject = SecurityUtils.getSubject();
        Principal principal = (Principal)subject.getPrincipal();
        if (principal != null) {
            return principal;
        }
        return null;
    }


    /**
     * 获取shiro管理的session
     * @return
     */
    public static Session getSession(){
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession(false);
        if(session == null){
            session = subject.getSession();
        }
        return session;
    }
}

