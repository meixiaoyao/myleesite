package com.zyw.myleesite.common.persistence;

import java.util.List;

/**
 * DAO支持类实现
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/27 下午 5:32
 */
public interface TreeDao<T extends TreeEntity<T>> extends CrudDao<T> {
    /**
     * 找到所有子节点
     *
     * @param entity
     * @return
     */
    public List<T> findByParentIdsLike(T entity);

    /**
     * 更新所有父节点字段
     *
     * @param entity
     * @return
     */
    public int updateParentIds(T entity);
}
