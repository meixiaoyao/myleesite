package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_scheduler_state")
public class QrtzSchedulerState {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "instance_name")
    private String instanceName;

    @Column(name = "last_checkin_time")
    private Long lastCheckinTime;

    @Column(name = "checkin_interval")
    private Long checkinInterval;

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
     * @return last_checkin_time
     */
    public Long getLastCheckinTime() {
        return lastCheckinTime;
    }

    /**
     * @param lastCheckinTime
     */
    public void setLastCheckinTime(Long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    /**
     * @return checkin_interval
     */
    public Long getCheckinInterval() {
        return checkinInterval;
    }

    /**
     * @param checkinInterval
     */
    public void setCheckinInterval(Long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }
}