package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_table")
public class GenTable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String comments;

    /**
     * 实体类名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 关联父表
     */
    @Column(name = "parent_table")
    private String parentTable;

    /**
     * 关联父表外键
     */
    @Column(name = "parent_table_fk")
    private String parentTableFk;

    /**
     * 创建者
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 备注信息
     */
    private String remarks;

    /**
     * 删除标记（0：正常；1：删除）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 同步
     */
    private String issync;

    /**
     * 表类型
     */
    @Column(name = "table_type")
    private String tableType;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return comments - 描述
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置描述
     *
     * @param comments 描述
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * 获取实体类名称
     *
     * @return class_name - 实体类名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置实体类名称
     *
     * @param className 实体类名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取关联父表
     *
     * @return parent_table - 关联父表
     */
    public String getParentTable() {
        return parentTable;
    }

    /**
     * 设置关联父表
     *
     * @param parentTable 关联父表
     */
    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }

    /**
     * 获取关联父表外键
     *
     * @return parent_table_fk - 关联父表外键
     */
    public String getParentTableFk() {
        return parentTableFk;
    }

    /**
     * 设置关联父表外键
     *
     * @param parentTableFk 关联父表外键
     */
    public void setParentTableFk(String parentTableFk) {
        this.parentTableFk = parentTableFk;
    }

    /**
     * 获取创建者
     *
     * @return create_by - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取备注信息
     *
     * @return remarks - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取删除标记（0：正常；1：删除）
     *
     * @return del_flag - 删除标记（0：正常；1：删除）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记（0：正常；1：删除）
     *
     * @param delFlag 删除标记（0：正常；1：删除）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取同步
     *
     * @return issync - 同步
     */
    public String getIssync() {
        return issync;
    }

    /**
     * 设置同步
     *
     * @param issync 同步
     */
    public void setIssync(String issync) {
        this.issync = issync;
    }

    /**
     * 获取表类型
     *
     * @return table_type - 表类型
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * 设置表类型
     *
     * @param tableType 表类型
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }
}