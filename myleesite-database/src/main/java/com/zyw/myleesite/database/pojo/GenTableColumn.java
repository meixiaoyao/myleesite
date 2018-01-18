package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "gen_table_column")
public class GenTableColumn {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 归属表编号
     */
    @Column(name = "gen_table_id")
    private String genTableId;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String comments;

    /**
     * 列的数据类型的字节长度
     */
    @Column(name = "jdbc_type")
    private String jdbcType;

    /**
     * JAVA类型
     */
    @Column(name = "java_type")
    private String javaType;

    /**
     * JAVA字段名
     */
    @Column(name = "java_field")
    private String javaField;

    /**
     * 是否主键
     */
    @Column(name = "is_pk")
    private String isPk;

    /**
     * 是否可为空
     */
    @Column(name = "is_null")
    private String isNull;

    /**
     * 是否为插入字段
     */
    @Column(name = "is_insert")
    private String isInsert;

    /**
     * 是否编辑字段
     */
    @Column(name = "is_edit")
    private String isEdit;

    /**
     * 是否列表字段
     */
    @Column(name = "is_list")
    private String isList;

    /**
     * 是否查询字段
     */
    @Column(name = "is_query")
    private String isQuery;

    /**
     * 查询方式（等于、不等于、大于、小于、范围、左LIKE、右LIKE、左右LIKE）
     */
    @Column(name = "query_type")
    private String queryType;

    /**
     * 字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）
     */
    @Column(name = "show_type")
    private String showType;

    /**
     * 字典类型
     */
    @Column(name = "dict_type")
    private String dictType;

    /**
     * 其它设置（扩展字段JSON）
     */
    private String settings;

    /**
     * 排序（升序）
     */
    private Long sort;

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
     * 是否表单显示
     */
    @Column(name = "is_form")
    private String isForm;

    /**
     * 管理的查询表名
     */
    @Column(name = "tableName")
    private String tablename;

    @Column(name = "fieldLabels")
    private String fieldlabels;

    @Column(name = "fieldKeys")
    private String fieldkeys;

    @Column(name = "searchLabel")
    private String searchlabel;

    @Column(name = "searchKey")
    private String searchkey;

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
     * 获取归属表编号
     *
     * @return gen_table_id - 归属表编号
     */
    public String getGenTableId() {
        return genTableId;
    }

    /**
     * 设置归属表编号
     *
     * @param genTableId 归属表编号
     */
    public void setGenTableId(String genTableId) {
        this.genTableId = genTableId;
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
     * 获取列的数据类型的字节长度
     *
     * @return jdbc_type - 列的数据类型的字节长度
     */
    public String getJdbcType() {
        return jdbcType;
    }

    /**
     * 设置列的数据类型的字节长度
     *
     * @param jdbcType 列的数据类型的字节长度
     */
    public void setJdbcType(String jdbcType) {
        this.jdbcType = jdbcType;
    }

    /**
     * 获取JAVA类型
     *
     * @return java_type - JAVA类型
     */
    public String getJavaType() {
        return javaType;
    }

    /**
     * 设置JAVA类型
     *
     * @param javaType JAVA类型
     */
    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    /**
     * 获取JAVA字段名
     *
     * @return java_field - JAVA字段名
     */
    public String getJavaField() {
        return javaField;
    }

    /**
     * 设置JAVA字段名
     *
     * @param javaField JAVA字段名
     */
    public void setJavaField(String javaField) {
        this.javaField = javaField;
    }

    /**
     * 获取是否主键
     *
     * @return is_pk - 是否主键
     */
    public String getIsPk() {
        return isPk;
    }

    /**
     * 设置是否主键
     *
     * @param isPk 是否主键
     */
    public void setIsPk(String isPk) {
        this.isPk = isPk;
    }

    /**
     * 获取是否可为空
     *
     * @return is_null - 是否可为空
     */
    public String getIsNull() {
        return isNull;
    }

    /**
     * 设置是否可为空
     *
     * @param isNull 是否可为空
     */
    public void setIsNull(String isNull) {
        this.isNull = isNull;
    }

    /**
     * 获取是否为插入字段
     *
     * @return is_insert - 是否为插入字段
     */
    public String getIsInsert() {
        return isInsert;
    }

    /**
     * 设置是否为插入字段
     *
     * @param isInsert 是否为插入字段
     */
    public void setIsInsert(String isInsert) {
        this.isInsert = isInsert;
    }

    /**
     * 获取是否编辑字段
     *
     * @return is_edit - 是否编辑字段
     */
    public String getIsEdit() {
        return isEdit;
    }

    /**
     * 设置是否编辑字段
     *
     * @param isEdit 是否编辑字段
     */
    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    /**
     * 获取是否列表字段
     *
     * @return is_list - 是否列表字段
     */
    public String getIsList() {
        return isList;
    }

    /**
     * 设置是否列表字段
     *
     * @param isList 是否列表字段
     */
    public void setIsList(String isList) {
        this.isList = isList;
    }

    /**
     * 获取是否查询字段
     *
     * @return is_query - 是否查询字段
     */
    public String getIsQuery() {
        return isQuery;
    }

    /**
     * 设置是否查询字段
     *
     * @param isQuery 是否查询字段
     */
    public void setIsQuery(String isQuery) {
        this.isQuery = isQuery;
    }

    /**
     * 获取查询方式（等于、不等于、大于、小于、范围、左LIKE、右LIKE、左右LIKE）
     *
     * @return query_type - 查询方式（等于、不等于、大于、小于、范围、左LIKE、右LIKE、左右LIKE）
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * 设置查询方式（等于、不等于、大于、小于、范围、左LIKE、右LIKE、左右LIKE）
     *
     * @param queryType 查询方式（等于、不等于、大于、小于、范围、左LIKE、右LIKE、左右LIKE）
     */
    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    /**
     * 获取字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）
     *
     * @return show_type - 字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）
     */
    public String getShowType() {
        return showType;
    }

    /**
     * 设置字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）
     *
     * @param showType 字段生成方案（文本框、文本域、下拉框、复选框、单选框、字典选择、人员选择、部门选择、区域选择）
     */
    public void setShowType(String showType) {
        this.showType = showType;
    }

    /**
     * 获取字典类型
     *
     * @return dict_type - 字典类型
     */
    public String getDictType() {
        return dictType;
    }

    /**
     * 设置字典类型
     *
     * @param dictType 字典类型
     */
    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    /**
     * 获取其它设置（扩展字段JSON）
     *
     * @return settings - 其它设置（扩展字段JSON）
     */
    public String getSettings() {
        return settings;
    }

    /**
     * 设置其它设置（扩展字段JSON）
     *
     * @param settings 其它设置（扩展字段JSON）
     */
    public void setSettings(String settings) {
        this.settings = settings;
    }

    /**
     * 获取排序（升序）
     *
     * @return sort - 排序（升序）
     */
    public Long getSort() {
        return sort;
    }

    /**
     * 设置排序（升序）
     *
     * @param sort 排序（升序）
     */
    public void setSort(Long sort) {
        this.sort = sort;
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
     * 获取是否表单显示
     *
     * @return is_form - 是否表单显示
     */
    public String getIsForm() {
        return isForm;
    }

    /**
     * 设置是否表单显示
     *
     * @param isForm 是否表单显示
     */
    public void setIsForm(String isForm) {
        this.isForm = isForm;
    }

    /**
     * 获取管理的查询表名
     *
     * @return tableName - 管理的查询表名
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * 设置管理的查询表名
     *
     * @param tablename 管理的查询表名
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    /**
     * @return fieldLabels
     */
    public String getFieldlabels() {
        return fieldlabels;
    }

    /**
     * @param fieldlabels
     */
    public void setFieldlabels(String fieldlabels) {
        this.fieldlabels = fieldlabels;
    }

    /**
     * @return fieldKeys
     */
    public String getFieldkeys() {
        return fieldkeys;
    }

    /**
     * @param fieldkeys
     */
    public void setFieldkeys(String fieldkeys) {
        this.fieldkeys = fieldkeys;
    }

    /**
     * @return searchLabel
     */
    public String getSearchlabel() {
        return searchlabel;
    }

    /**
     * @param searchlabel
     */
    public void setSearchlabel(String searchlabel) {
        this.searchlabel = searchlabel;
    }

    /**
     * @return searchKey
     */
    public String getSearchkey() {
        return searchkey;
    }

    /**
     * @param searchkey
     */
    public void setSearchkey(String searchkey) {
        this.searchkey = searchkey;
    }
}