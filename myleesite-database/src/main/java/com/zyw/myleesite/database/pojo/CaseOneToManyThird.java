package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "case_one_to_many_third")
public class CaseOneToManyThird {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 出发地
     */
    private String startarea;

    /**
     * 目的地
     */
    private String endarea;

    /**
     * 代理价格
     */
    private Double price;

    /**
     * 外键
     */
    @Column(name = "case_one_to_many_main")
    private String caseOneToManyMain;

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
     * 获取出发地
     *
     * @return startarea - 出发地
     */
    public String getStartarea() {
        return startarea;
    }

    /**
     * 设置出发地
     *
     * @param startarea 出发地
     */
    public void setStartarea(String startarea) {
        this.startarea = startarea;
    }

    /**
     * 获取目的地
     *
     * @return endarea - 目的地
     */
    public String getEndarea() {
        return endarea;
    }

    /**
     * 设置目的地
     *
     * @param endarea 目的地
     */
    public void setEndarea(String endarea) {
        this.endarea = endarea;
    }

    /**
     * 获取代理价格
     *
     * @return price - 代理价格
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置代理价格
     *
     * @param price 代理价格
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取外键
     *
     * @return case_one_to_many_main - 外键
     */
    public String getCaseOneToManyMain() {
        return caseOneToManyMain;
    }

    /**
     * 设置外键
     *
     * @param caseOneToManyMain 外键
     */
    public void setCaseOneToManyMain(String caseOneToManyMain) {
        this.caseOneToManyMain = caseOneToManyMain;
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