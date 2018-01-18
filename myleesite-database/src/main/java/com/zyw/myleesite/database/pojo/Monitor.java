package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

public class Monitor {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * cpu使用率
     */
    private String cpu;

    /**
     * jvm使用率
     */
    private String jvm;

    /**
     * 内存使用率
     */
    private String ram;

    /**
     * 警告通知邮箱
     */
    private String toemail;

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
     * 获取cpu使用率
     *
     * @return cpu - cpu使用率
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * 设置cpu使用率
     *
     * @param cpu cpu使用率
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    /**
     * 获取jvm使用率
     *
     * @return jvm - jvm使用率
     */
    public String getJvm() {
        return jvm;
    }

    /**
     * 设置jvm使用率
     *
     * @param jvm jvm使用率
     */
    public void setJvm(String jvm) {
        this.jvm = jvm;
    }

    /**
     * 获取内存使用率
     *
     * @return ram - 内存使用率
     */
    public String getRam() {
        return ram;
    }

    /**
     * 设置内存使用率
     *
     * @param ram 内存使用率
     */
    public void setRam(String ram) {
        this.ram = ram;
    }

    /**
     * 获取警告通知邮箱
     *
     * @return toemail - 警告通知邮箱
     */
    public String getToemail() {
        return toemail;
    }

    /**
     * 设置警告通知邮箱
     *
     * @param toemail 警告通知邮箱
     */
    public void setToemail(String toemail) {
        this.toemail = toemail;
    }
}