package com.zyw.myleesite.module.sys.dao;

import com.zyw.myleesite.common.persistence.CrudDao;
import com.zyw.myleesite.common.persistence.annotation.MyBatisDao;
import com.zyw.myleesite.module.sys.entity.Role;

/**
 * 角色DAO接口
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/27 下午 5:12
 */
@MyBatisDao
public interface RoleDao extends CrudDao<Role> {
    public Role getByName(Role role);

    public Role getByEnname(Role role);

    /**
     * 维护角色与菜单权限关系
     *
     * @param role
     * @return
     */
    public int deleteRoleMenu(Role role);

    public int insertRoleMenu(Role role);

    /**
     * 维护角色与公司部门关系
     *
     * @param role
     * @return
     */
    public int deleteRoleOffice(Role role);

    public int insertRoleOffice(Role role);
}
