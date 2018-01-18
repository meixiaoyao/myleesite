package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

public class Calendar {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 事件标题
     */
    private String title;

    /**
     * 事件开始时间
     */
    private String starttime;

    /**
     * 事件结束时间
     */
    private String endtime;

    /**
     * 是否为全天时间
     */
    private String allday;

    /**
     * 时间的背景色
     */
    private String color;

    private String userid;

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
     * 获取事件标题
     *
     * @return title - 事件标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置事件标题
     *
     * @param title 事件标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取事件开始时间
     *
     * @return starttime - 事件开始时间
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置事件开始时间
     *
     * @param starttime 事件开始时间
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取事件结束时间
     *
     * @return endtime - 事件结束时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置事件结束时间
     *
     * @param endtime 事件结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取是否为全天时间
     *
     * @return allday - 是否为全天时间
     */
    public String getAllday() {
        return allday;
    }

    /**
     * 设置是否为全天时间
     *
     * @param allday 是否为全天时间
     */
    public void setAllday(String allday) {
        this.allday = allday;
    }

    /**
     * 获取时间的背景色
     *
     * @return color - 时间的背景色
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置时间的背景色
     *
     * @param color 时间的背景色
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
}