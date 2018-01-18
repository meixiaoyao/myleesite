package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "config_sms_template")
public class ConfigSmsTemplate {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 模板名称
     */
    @Column(name = "sms_template_name")
    private String smsTemplateName;

    /**
     * 模板编码
     */
    @Column(name = "sms_template_code")
    private String smsTemplateCode;

    /**
     * 模板类型
     */
    @Column(name = "sms_template_type")
    private String smsTemplateType;

    /**
     * 短信内容
     */
    @Column(name = "sms_template_content")
    private String smsTemplateContent;

    /**
     * 外键
     */
    @Column(name = "config_sms")
    private String configSms;

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
     * 获取模板名称
     *
     * @return sms_template_name - 模板名称
     */
    public String getSmsTemplateName() {
        return smsTemplateName;
    }

    /**
     * 设置模板名称
     *
     * @param smsTemplateName 模板名称
     */
    public void setSmsTemplateName(String smsTemplateName) {
        this.smsTemplateName = smsTemplateName;
    }

    /**
     * 获取模板编码
     *
     * @return sms_template_code - 模板编码
     */
    public String getSmsTemplateCode() {
        return smsTemplateCode;
    }

    /**
     * 设置模板编码
     *
     * @param smsTemplateCode 模板编码
     */
    public void setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
    }

    /**
     * 获取模板类型
     *
     * @return sms_template_type - 模板类型
     */
    public String getSmsTemplateType() {
        return smsTemplateType;
    }

    /**
     * 设置模板类型
     *
     * @param smsTemplateType 模板类型
     */
    public void setSmsTemplateType(String smsTemplateType) {
        this.smsTemplateType = smsTemplateType;
    }

    /**
     * 获取短信内容
     *
     * @return sms_template_content - 短信内容
     */
    public String getSmsTemplateContent() {
        return smsTemplateContent;
    }

    /**
     * 设置短信内容
     *
     * @param smsTemplateContent 短信内容
     */
    public void setSmsTemplateContent(String smsTemplateContent) {
        this.smsTemplateContent = smsTemplateContent;
    }

    /**
     * 获取外键
     *
     * @return config_sms - 外键
     */
    public String getConfigSms() {
        return configSms;
    }

    /**
     * 设置外键
     *
     * @param configSms 外键
     */
    public void setConfigSms(String configSms) {
        this.configSms = configSms;
    }
}