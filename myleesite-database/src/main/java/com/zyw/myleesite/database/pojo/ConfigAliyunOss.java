package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "config_aliyun_oss")
public class ConfigAliyunOss {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * Key
     */
    @Column(name = "oss_key")
    private String ossKey;

    /**
     * Secret
     */
    @Column(name = "oss_secret")
    private String ossSecret;

    /**
     * Bucket Name
     */
    @Column(name = "bucket_name")
    private String bucketName;

    /**
     * OSS End Point
     */
    @Column(name = "oss_end_point")
    private String ossEndPoint;

    /**
     * 自动创建 Bucket
     */
    @Column(name = "auto_create_bucket")
    private String autoCreateBucket;

    /**
     * 支持百度富文本
     */
    @Column(name = "baidu_use_status")
    private String baiduUseStatus;

    /**
     * 启用 CDN
     */
    @Column(name = "use_cdn")
    private String useCdn;

    /**
     * CDN End Point
     */
    @Column(name = "cdn_end_point")
    private String cdnEndPoint;

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
     * @return oss_key - Key
     */
    public String getOssKey() {
        return ossKey;
    }

    /**
     * 设置Key
     *
     * @param ossKey Key
     */
    public void setOssKey(String ossKey) {
        this.ossKey = ossKey;
    }

    /**
     * 获取Secret
     *
     * @return oss_secret - Secret
     */
    public String getOssSecret() {
        return ossSecret;
    }

    /**
     * 设置Secret
     *
     * @param ossSecret Secret
     */
    public void setOssSecret(String ossSecret) {
        this.ossSecret = ossSecret;
    }

    /**
     * 获取Bucket Name
     *
     * @return bucket_name - Bucket Name
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * 设置Bucket Name
     *
     * @param bucketName Bucket Name
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * 获取OSS End Point
     *
     * @return oss_end_point - OSS End Point
     */
    public String getOssEndPoint() {
        return ossEndPoint;
    }

    /**
     * 设置OSS End Point
     *
     * @param ossEndPoint OSS End Point
     */
    public void setOssEndPoint(String ossEndPoint) {
        this.ossEndPoint = ossEndPoint;
    }

    /**
     * 获取自动创建 Bucket
     *
     * @return auto_create_bucket - 自动创建 Bucket
     */
    public String getAutoCreateBucket() {
        return autoCreateBucket;
    }

    /**
     * 设置自动创建 Bucket
     *
     * @param autoCreateBucket 自动创建 Bucket
     */
    public void setAutoCreateBucket(String autoCreateBucket) {
        this.autoCreateBucket = autoCreateBucket;
    }

    /**
     * 获取支持百度富文本
     *
     * @return baidu_use_status - 支持百度富文本
     */
    public String getBaiduUseStatus() {
        return baiduUseStatus;
    }

    /**
     * 设置支持百度富文本
     *
     * @param baiduUseStatus 支持百度富文本
     */
    public void setBaiduUseStatus(String baiduUseStatus) {
        this.baiduUseStatus = baiduUseStatus;
    }

    /**
     * 获取启用 CDN
     *
     * @return use_cdn - 启用 CDN
     */
    public String getUseCdn() {
        return useCdn;
    }

    /**
     * 设置启用 CDN
     *
     * @param useCdn 启用 CDN
     */
    public void setUseCdn(String useCdn) {
        this.useCdn = useCdn;
    }

    /**
     * 获取CDN End Point
     *
     * @return cdn_end_point - CDN End Point
     */
    public String getCdnEndPoint() {
        return cdnEndPoint;
    }

    /**
     * 设置CDN End Point
     *
     * @param cdnEndPoint CDN End Point
     */
    public void setCdnEndPoint(String cdnEndPoint) {
        this.cdnEndPoint = cdnEndPoint;
    }
}