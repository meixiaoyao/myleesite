package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_fired_triggers")
public class QrtzFiredTriggers {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "entry_id")
    private String entryId;

    @Column(name = "trigger_name")
    private String triggerName;

    @Column(name = "trigger_group")
    private String triggerGroup;

    @Column(name = "instance_name")
    private String instanceName;

    @Column(name = "fired_time")
    private Long firedTime;

    @Column(name = "sched_time")
    private Long schedTime;

    private Integer priority;

    private String state;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_group")
    private String jobGroup;

    @Column(name = "is_nonconcurrent")
    private String isNonconcurrent;

    @Column(name = "requests_recovery")
    private String requestsRecovery;

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
     * @return entry_id
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * @param entryId
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * @return trigger_name
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * @param triggerName
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    /**
     * @return trigger_group
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * @param triggerGroup
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    /**
     * @return instance_name
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * @param instanceName
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * @return fired_time
     */
    public Long getFiredTime() {
        return firedTime;
    }

    /**
     * @param firedTime
     */
    public void setFiredTime(Long firedTime) {
        this.firedTime = firedTime;
    }

    /**
     * @return sched_time
     */
    public Long getSchedTime() {
        return schedTime;
    }

    /**
     * @param schedTime
     */
    public void setSchedTime(Long schedTime) {
        this.schedTime = schedTime;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state;
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
}