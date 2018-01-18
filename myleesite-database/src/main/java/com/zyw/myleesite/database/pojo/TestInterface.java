package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "test_interface")
public class TestInterface {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 接口类型
     */
    private String type;

    /**
     * 请求URL
     */
    private String url;

    /**
     * 请求body
     */
    private String body;

    /**
     * 成功时返回消息
     */
    private String successmsg;

    /**
     * 失败时返回消息
     */
    private String errormsg;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 删除标记
     */
    @Column(name = "del_flag")
    private String delFlag;

    /**
     * 接口名称
     */
    private String name;

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
     * 获取接口类型
     *
     * @return type - 接口类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置接口类型
     *
     * @param type 接口类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取请求URL
     *
     * @return url - 请求URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求URL
     *
     * @param url 请求URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取请求body
     *
     * @return body - 请求body
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置请求body
     *
     * @param body 请求body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 获取成功时返回消息
     *
     * @return successmsg - 成功时返回消息
     */
    public String getSuccessmsg() {
        return successmsg;
    }

    /**
     * 设置成功时返回消息
     *
     * @param successmsg 成功时返回消息
     */
    public void setSuccessmsg(String successmsg) {
        this.successmsg = successmsg;
    }

    /**
     * 获取失败时返回消息
     *
     * @return errormsg - 失败时返回消息
     */
    public String getErrormsg() {
        return errormsg;
    }

    /**
     * 设置失败时返回消息
     *
     * @param errormsg 失败时返回消息
     */
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取删除标记
     *
     * @return del_flag - 删除标记
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记
     *
     * @param delFlag 删除标记
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取接口名称
     *
     * @return name - 接口名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置接口名称
     *
     * @param name 接口名称
     */
    public void setName(String name) {
        this.name = name;
    }
}