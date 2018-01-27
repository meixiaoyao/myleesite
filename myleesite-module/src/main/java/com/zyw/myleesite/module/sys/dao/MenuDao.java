package com.zyw.myleesite.module.sys.dao;

import com.zyw.myleesite.common.persistence.CrudDao;
import com.zyw.myleesite.common.persistence.annotation.MyBatisDao;
import com.zyw.myleesite.module.sys.entity.Menu;

import java.util.List;

/**
 * 菜单DAO接口
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/27 下午 5:12
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {
    public List<Menu> findByParentIdsLike(Menu menu);

    public List<Menu> findByUserId(Menu menu);

    public int updateParentIds(Menu menu);

    public int updateSort(Menu menu);

    List<Menu> findParentIdsByName(String currentName);
}
