package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "case_single_table")
public class CaseSingleTable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 员工
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 归属部门
     */
    @Column(name = "office_id")
    private String officeId;

    /**
     * 归属区域
     */
    @Column(name = "area_id")
    private String areaId;

    /**
     * 请假开始日期
     */
    @Column(name = "begin_date")
    private Date beginDate;

    /**
     * 请假结束日期
     */
    @Column(name = "end_date")
    private Date endDate;

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
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取员工
     *
     * @return user_id - 员工
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置员工
     *
     * @param userId 员工
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取归属部门
     *
     * @return office_id - 归属部门
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * 设置归属部门
     *
     * @param officeId 归属部门
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    /**
     * 获取归属区域
     *
     * @return area_id - 归属区域
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设置归属区域
     *
     * @param areaId 归属区域
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * 获取请假开始日期
     *
     * @return begin_date - 请假开始日期
     */
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * 设置请假开始日期
     *
     * @param beginDate 请假开始日期
     */
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取请假结束日期
     *
     * @return end_date - 请假结束日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置请假结束日期
     *
     * @param endDate 请假结束日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
     * 获取逻辑删除标记（0：显示；1：隐藏）
     *
     * @return del_flag - 逻辑删除标记（0：显示；1：隐藏）
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置逻辑删除标记（0：显示；1：隐藏）
     *
     * @param delFlag 逻辑删除标记（0：显示；1：隐藏）
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}