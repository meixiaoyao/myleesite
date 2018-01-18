package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_simple_triggers")
public class QrtzSimpleTriggers {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "trigger_name")
    private String triggerName;

    @Id
    @Column(name = "trigger_group")
    private String triggerGroup;

    @Column(name = "repeat_count")
    private Long repeatCount;

    @Column(name = "repeat_interval")
    private Long repeatInterval;

    @Column(name = "times_triggered")
    private Long timesTriggered;

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
     * @return repeat_count
     */
    public Long getRepeatCount() {
        return repeatCount;
    }

    /**
     * @param repeatCount
     */
    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    /**
     * @return repeat_interval
     */
    public Long getRepeatInterval() {
        return repeatInterval;
    }

    /**
     * @param repeatInterval
     */
    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    /**
     * @return times_triggered
     */
    public Long getTimesTriggered() {
        return timesTriggered;
    }

    /**
     * @param timesTriggered
     */
    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }
}