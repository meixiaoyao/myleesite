package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "iim_mail")
public class IimMail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容概要
     */
    private String overview;

    /**
     * 内容
     */
    private byte[] content;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容概要
     *
     * @return overview - 内容概要
     */
    public String getOverview() {
        return overview;
    }

    /**
     * 设置内容概要
     *
     * @param overview 内容概要
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(byte[] content) {
        this.content = content;
    }
}