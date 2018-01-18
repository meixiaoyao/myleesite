package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "iim_chat_history")
public class IimChatHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String userid1;

    private String userid2;

    private String msg;

    private String status;

    @Column(name = "create_date")
    private Date createDate;

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
     * @return userid1
     */
    public String getUserid1() {
        return userid1;
    }

    /**
     * @param userid1
     */
    public void setUserid1(String userid1) {
        this.userid1 = userid1;
    }

    /**
     * @return userid2
     */
    public String getUserid2() {
        return userid2;
    }

    /**
     * @param userid2
     */
    public void setUserid2(String userid2) {
        this.userid2 = userid2;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}