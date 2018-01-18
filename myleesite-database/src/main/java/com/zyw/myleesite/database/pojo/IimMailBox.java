package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "iim_mail_box")
public class IimMailBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 状态 0 未读 1 已读
     */
    private String readstatus;

    /**
     * 发件人
     */
    @Column(name = "senderId")
    private String senderid;

    /**
     * 收件人
     */
    @Column(name = "receiverId")
    private String receiverid;

    /**
     * 发送时间
     */
    private Date sendtime;

    /**
     * 邮件外键
     */
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
     * 获取发件人
     *
     * @return senderId - 发件人
     */
    public String getSenderid() {
        return senderid;
    }

    /**
     * 设置发件人
     *
     * @param senderid 发件人
     */
    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    /**
     * 获取收件人
     *
     * @return receiverId - 收件人
     */
    public String getReceiverid() {
        return receiverid;
    }

    /**
     * 设置收件人
     *
     * @param receiverid 收件人
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
     * 获取邮件外键
     *
     * @return mailid - 邮件外键
     */
    public String getMailid() {
        return mailid;
    }

    /**
     * 设置邮件外键
     *
     * @param mailid 邮件外键
     */
    public void setMailid(String mailid) {
        this.mailid = mailid;
    }
}