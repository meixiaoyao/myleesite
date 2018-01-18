package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_job_details")
public class QrtzJobDetails {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "job_name")
    private String jobName;

    @Id
    @Column(name = "job_group")
    private String jobGroup;

    private String description;

    @Column(name = "job_class_name")
    private String jobClassName;

    @Column(name = "is_durable")
    private String isDurable;

    @Column(name = "is_nonconcurrent")
    private String isNonconcurrent;

    @Column(name = "is_update_data")
    private String isUpdateData;

    @Column(name = "requests_recovery")
    private String requestsRecovery;

    @Column(name = "job_data")
    private byte[] jobData;

    /**
     * @return sched_name
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * @param schedName
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    /**
     * @return job_name
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return job_group
     */
    public String getJobGroup() {
        return jobGroup;
    }

    /**
     * @param jobGroup
     */
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return job_class_name
     */
    public String getJobClassName() {
        return jobClassName;
    }

    /**
     * @param jobClassName
     */
    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    /**
     * @return is_durable
     */
    public String getIsDurable() {
        return isDurable;
    }

    /**
     * @param isDurable
     */
    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }

    /**
     * @return is_nonconcurrent
     */
    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    /**
     * @param isNonconcurrent
     */
    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    /**
     * @return is_update_data
     */
    public String getIsUpdateData() {
        return isUpdateData;
    }

    /**
     * @param isUpdateData
     */
    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    /**
     * @return requests_recovery
     */
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    /**
     * @param requestsRecovery
     */
    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    /**
     * @return job_data
     */
    public byte[] getJobData() {
        return jobData;
    }

    /**
     * @param jobData
     */
    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }
}