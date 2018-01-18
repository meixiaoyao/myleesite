package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_triggers")
public class QrtzTriggers {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "trigger_name")
    private String triggerName;

    @Id
    @Column(name = "trigger_group")
    private String triggerGroup;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "job_group")
    private String jobGroup;

    private String description;

    @Column(name = "next_fire_time")
    private Long nextFireTime;

    @Column(name = "prev_fire_time")
    private Long prevFireTime;

    private Integer priority;

    @Column(name = "trigger_state")
    private String triggerState;

    @Column(name = "trigger_type")
    private String triggerType;

    @Column(name = "start_time")
    private Long startTime;

    @Column(name = "end_time")
    private Long endTime;

    @Column(name = "calendar_name")
    private String calendarName;

    @Column(name = "misfire_instr")
    private Short misfireInstr;

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
     * @return next_fire_time
     */
    public Long getNextFireTime() {
        return nextFireTime;
    }

    /**
     * @param nextFireTime
     */
    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    /**
     * @return prev_fire_time
     */
    public Long getPrevFireTime() {
        return prevFireTime;
    }

    /**
     * @param prevFireTime
     */
    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
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
     * @return trigger_state
     */
    public String getTriggerState() {
        return triggerState;
    }

    /**
     * @param triggerState
     */
    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    /**
     * @return trigger_type
     */
    public String getTriggerType() {
        return triggerType;
    }

    /**
     * @param triggerType
     */
    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * @return start_time
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * @return calendar_name
     */
    public String getCalendarName() {
        return calendarName;
    }

    /**
     * @param calendarName
     */
    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    /**
     * @return misfire_instr
     */
    public Short getMisfireInstr() {
        return misfireInstr;
    }

    /**
     * @param misfireInstr
     */
    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
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