package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_scheme")
public class GenScheme {
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
     * 分类
     */
    private String category;

    /**
     * 生成包路径
     */
    @Column(name = "package_name")
    private String packageName;

    /**
     * 生成模块名
     */
    @Column(name = "module_name")
    private String moduleName;

    /**
     * 生成子模块名
     */
    @Column(name = "sub_module_name")
    private String subModuleName;

    /**
     * 生成功能名
     */
    @Column(name = "function_name")
    private String functionName;

    /**
     * 生成功能名（简写）
     */
    @Column(name = "function_name_simple")
    private String functionNameSimple;

    /**
     * 生成功能作者
     */
    @Column(name = "function_author")
    private String functionAuthor;

    /**
     * 生成表编号
     */
    @Column(name = "gen_table_id")
    private String genTableId;

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
     * 获取分类
     *
     * @return category - 分类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置分类
     *
     * @param category 分类
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取生成包路径
     *
     * @return package_name - 生成包路径
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置生成包路径
     *
     * @param packageName 生成包路径
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * 获取生成模块名
     *
     * @return module_name - 生成模块名
     */
    public String getModuleName() {
        return moduleName;
    }

    /**
     * 设置生成模块名
     *
     * @param moduleName 生成模块名
     */
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * 获取生成子模块名
     *
     * @return sub_module_name - 生成子模块名
     */
    public String getSubModuleName() {
        return subModuleName;
    }

    /**
     * 设置生成子模块名
     *
     * @param subModuleName 生成子模块名
     */
    public void setSubModuleName(String subModuleName) {
        this.subModuleName = subModuleName;
    }

    /**
     * 获取生成功能名
     *
     * @return function_name - 生成功能名
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * 设置生成功能名
     *
     * @param functionName 生成功能名
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * 获取生成功能名（简写）
     *
     * @return function_name_simple - 生成功能名（简写）
     */
    public String getFunctionNameSimple() {
        return functionNameSimple;
    }

    /**
     * 设置生成功能名（简写）
     *
     * @param functionNameSimple 生成功能名（简写）
     */
    public void setFunctionNameSimple(String functionNameSimple) {
        this.functionNameSimple = functionNameSimple;
    }

    /**
     * 获取生成功能作者
     *
     * @return function_author - 生成功能作者
     */
    public String getFunctionAuthor() {
        return functionAuthor;
    }

    /**
     * 设置生成功能作者
     *
     * @param functionAuthor 生成功能作者
     */
    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor;
    }

    /**
     * 获取生成表编号
     *
     * @return gen_table_id - 生成表编号
     */
    public String getGenTableId() {
        return genTableId;
    }

    /**
     * 设置生成表编号
     *
     * @param genTableId 生成表编号
     */
    public void setGenTableId(String genTableId) {
        this.genTableId = genTableId;
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
}