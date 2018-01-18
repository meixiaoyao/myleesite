package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "config_mail")
public class ConfigMail {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 主机名
     */
    @Column(name = "mail_host")
    private String mailHost;

    /**
     * 主机端口
     */
    @Column(name = "mail_port")
    private Integer mailPort;

    /**
     * 邮箱地址
     */
    @Column(name = "mail_username")
    private String mailUsername;

    /**
     * 邮箱密码
     */
    @Column(name = "mail_password")
    private String mailPassword;

    /**
     * 发件人昵称
     */
    @Column(name = "mail_from")
    private String mailFrom;

    /**
     * 使用SSL/TLS
     */
    @Column(name = "mail_ssl")
    private String mailSsl;

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
     * 获取主机名
     *
     * @return mail_host - 主机名
     */
    public String getMailHost() {
        return mailHost;
    }

    /**
     * 设置主机名
     *
     * @param mailHost 主机名
     */
    public void setMailHost(String mailHost) {
        this.mailHost = mailHost;
    }

    /**
     * 获取主机端口
     *
     * @return mail_port - 主机端口
     */
    public Integer getMailPort() {
        return mailPort;
    }

    /**
     * 设置主机端口
     *
     * @param mailPort 主机端口
     */
    public void setMailPort(Integer mailPort) {
        this.mailPort = mailPort;
    }

    /**
     * 获取邮箱地址
     *
     * @return mail_username - 邮箱地址
     */
    public String getMailUsername() {
        return mailUsername;
    }

    /**
     * 设置邮箱地址
     *
     * @param mailUsername 邮箱地址
     */
    public void setMailUsername(String mailUsername) {
        this.mailUsername = mailUsername;
    }

    /**
     * 获取邮箱密码
     *
     * @return mail_password - 邮箱密码
     */
    public String getMailPassword() {
        return mailPassword;
    }

    /**
     * 设置邮箱密码
     *
     * @param mailPassword 邮箱密码
     */
    public void setMailPassword(String mailPassword) {
        this.mailPassword = mailPassword;
    }

    /**
     * 获取发件人昵称
     *
     * @return mail_from - 发件人昵称
     */
    public String getMailFrom() {
        return mailFrom;
    }

    /**
     * 设置发件人昵称
     *
     * @param mailFrom 发件人昵称
     */
    public void setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
    }

    /**
     * 获取使用SSL/TLS
     *
     * @return mail_ssl - 使用SSL/TLS
     */
    public String getMailSsl() {
        return mailSsl;
    }

    /**
     * 设置使用SSL/TLS
     *
     * @param mailSsl 使用SSL/TLS
     */
    public void setMailSsl(String mailSsl) {
        this.mailSsl = mailSsl;
    }
}