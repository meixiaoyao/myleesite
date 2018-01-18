package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "iim_mail_compose")
public class IimMailCompose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 状态 0 草稿 1 已发送
     */
    private String status;

    /**
     * 状态 0 未读 1 已读
     */
    private String readstatus;

    /**
     * 发送者
     */
    @Column(name = "senderId")
    private String senderid;

    /**
     * 接收者
     */
    @Column(name = "receiverId")
    private String receiverid;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 邮件id
     */
    @Column(name = "mailId")
    private String mailid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取状态 0 草稿 1 已发送
     *
     * @return status - 状态 0 草稿 1 已发送
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 0 草稿 1 已发送
     *
     * @param status 状态 0 草稿 1 已发送
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取状态 0 未读 1 已读
     *
     * @return readstatus - 状态 0 未读 1 已读
     */
    public String getReadstatus() {
        return readstatus;
    }

    /**
     * 设置状态 0 未读 1 已读
     *
     * @param readstatus 状态 0 未读 1 已读
     */
    public void setReadstatus(String readstatus) {
        this.readstatus = readstatus;
    }

    /**
     * 获取发送者
     *
     * @return senderId - 发送者
     */
    public String getSenderid() {
        return senderid;
    }

    /**
     * 设置发送者
     *
     * @param senderid 发送者
     */
    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    /**
     * 获取接收者
     *
     * @return receiverId - 接收者
     */
    public String getReceiverid() {
        return receiverid;
    }

    /**
     * 设置接收者
     *
     * @param receiverid 接收者
     */
    public void setReceiverid(String receiverid) {
        this.receiverid = receiverid;
    }

    /**
     * 获取发送时间
     *
     * @return sendtime - 发送时间
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * 设置发送时间
     *
     * @param sendtime 发送时间
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * 获取邮件id
     *
     * @return mailId - 邮件id
     */
    public String getMailid() {
        return mailid;
    }

    /**
     * 设置邮件id
     *
     * @param mailid 邮件id
     */
    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
}