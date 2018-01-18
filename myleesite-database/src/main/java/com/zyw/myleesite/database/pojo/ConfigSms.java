package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "config_sms")
public class ConfigSms {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * AccessId
     */
    @Column(name = "sms_access_id")
    private String smsAccessId;

    /**
     * AccessKey
     */
    @Column(name = "sms_access_key")
    private String smsAccessKey;

    /**
     * MNSEndpoint
     */
    @Column(name = "sms_mns_endpoint")
    private String smsMnsEndpoint;

    /**
     * 主题
     */
    @Column(name = "sms_topic")
    private String smsTopic;

    /**
     * 签名
     */
    @Column(name = "sms_sign_name")
    private String smsSignName;

    /**
     * 测试手机
     */
    @Column(name = "test_number")
    private String testNumber;

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
     * 获取AccessId
     *
     * @return sms_access_id - AccessId
     */
    public String getSmsAccessId() {
        return smsAccessId;
    }

    /**
     * 设置AccessId
     *
     * @param smsAccessId AccessId
     */
    public void setSmsAccessId(String smsAccessId) {
        this.smsAccessId = smsAccessId;
    }

    /**
     * 获取AccessKey
     *
     * @return sms_access_key - AccessKey
     */
    public String getSmsAccessKey() {
        return smsAccessKey;
    }

    /**
     * 设置AccessKey
     *
     * @param smsAccessKey AccessKey
     */
    public void setSmsAccessKey(String smsAccessKey) {
        this.smsAccessKey = smsAccessKey;
    }

    /**
     * 获取MNSEndpoint
     *
     * @return sms_mns_endpoint - MNSEndpoint
     */
    public String getSmsMnsEndpoint() {
        return smsMnsEndpoint;
    }

    /**
     * 设置MNSEndpoint
     *
     * @param smsMnsEndpoint MNSEndpoint
     */
    public void setSmsMnsEndpoint(String smsMnsEndpoint) {
        this.smsMnsEndpoint = smsMnsEndpoint;
    }

    /**
     * 获取主题
     *
     * @return sms_topic - 主题
     */
    public String getSmsTopic() {
        return smsTopic;
    }

    /**
     * 设置主题
     *
     * @param smsTopic 主题
     */
    public void setSmsTopic(String smsTopic) {
        this.smsTopic = smsTopic;
    }

    /**
     * 获取签名
     *
     * @return sms_sign_name - 签名
     */
    public String getSmsSignName() {
        return smsSignName;
    }

    /**
     * 设置签名
     *
     * @param smsSignName 签名
     */
    public void setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
    }

    /**
     * 获取测试手机
     *
     * @return test_number - 测试手机
     */
    public String getTestNumber() {
        return testNumber;
    }

    /**
     * 设置测试手机
     *
     * @param testNumber 测试手机
     */
    public void setTestNumber(String testNumber) {
        this.testNumber = testNumber;
    }
}