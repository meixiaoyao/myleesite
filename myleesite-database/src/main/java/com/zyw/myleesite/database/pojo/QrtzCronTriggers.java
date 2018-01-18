package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_cron_triggers")
public class QrtzCronTriggers {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "trigger_name")
    private String triggerName;

    @Id
    @Column(name = "trigger_group")
    private String triggerGroup;

    @Column(name = "cron_expression")
    private String cronExpression;

    @Column(name = "time_zone_id")
    private String timeZoneId;

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
     * @return cron_expression
     */
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * @param cronExpression
     */
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * @return time_zone_id
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * @param timeZoneId
     */
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}