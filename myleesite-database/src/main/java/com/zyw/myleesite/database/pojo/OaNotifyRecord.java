package com.zyw.myleesite.database.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "oa_notify_record")
public class OaNotifyRecord {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 通知通告ID
     */
    @Column(name = "oa_notify_id")
    private String oaNotifyId;

    /**
     * 接受人
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 阅读标记
     */
    @Column(name = "read_flag")
    private String readFlag;

    /**
     * 阅读时间
     */
    @Column(name = "read_date")
    private Date readDate;

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
     * 获取通知通告ID
     *
     * @return oa_notify_id - 通知通告ID
     */
    public String getOaNotifyId() {
        return oaNotifyId;
    }

    /**
     * 设置通知通告ID
     *
     * @param oaNotifyId 通知通告ID
     */
    public void setOaNotifyId(String oaNotifyId) {
        this.oaNotifyId = oaNotifyId;
    }

    /**
     * 获取接受人
     *
     * @return user_id - 接受人
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置接受人
     *
     * @param userId 接受人
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取阅读标记
     *
     * @return read_flag - 阅读标记
     */
    public String getReadFlag() {
        return readFlag;
    }

    /**
     * 设置阅读标记
     *
     * @param readFlag 阅读标记
     */
    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    /**
     * 获取阅读时间
     *
     * @return read_date - 阅读时间
     */
    public Date getReadDate() {
        return readDate;
    }

    /**
     * 设置阅读时间
     *
     * @param readDate 阅读时间
     */
    public void setReadDate(Date readDate) {
        this.readDate = readDate;
    }
}