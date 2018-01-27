package com.zyw.myleesite.module.sys.dao;

import com.zyw.myleesite.common.persistence.TreeDao;
import com.zyw.myleesite.common.persistence.annotation.MyBatisDao;
import com.zyw.myleesite.module.sys.entity.Area;

/**
 * <p>Title: AreaDao </p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/27 下午 5:29
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
}
