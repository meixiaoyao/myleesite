package com.zyw.myleesite.module.sys.dao;

import com.zyw.myleesite.common.persistence.CrudDao;
import com.zyw.myleesite.module.sys.entity.Log;

/**
 * 日志DAO接口
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/27 下午 5:58
 */
public interface LogDao extends CrudDao<Log>{
    public void empty();
}
