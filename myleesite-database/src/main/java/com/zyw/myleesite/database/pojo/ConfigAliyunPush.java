package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "config_aliyun_push")
public class ConfigAliyunPush {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * Key
     */
    @Column(name = "access_key_id")
    private String accessKeyId;

    /**
     * Secret
     */
    @Column(name = "access_key_secret")
    private String accessKeySecret;

    /**
     * AppKey
     */
    @Column(name = "app_key")
    private String appKey;

    /**
     * RegionId
     */
    @Column(name = "region_id")
    private String regionId;

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
     * 获取Key
     *
     * @return access_key_id - Key
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * 设置Key
     *
     * @param accessKeyId Key
     */
    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * 获取Secret
     *
     * @return access_key_secret - Secret
     */
    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    /**
     * 设置Secret
     *
     * @param accessKeySecret Secret
     */
    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    /**
     * 获取AppKey
     *
     * @return app_key - AppKey
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * 设置AppKey
     *
     * @param appKey AppKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    /**
     * 获取RegionId
     *
     * @return region_id - RegionId
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * 设置RegionId
     *
     * @param regionId RegionId
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
}