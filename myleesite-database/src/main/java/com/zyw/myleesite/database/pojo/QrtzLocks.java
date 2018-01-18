package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_locks")
public class QrtzLocks {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "lock_name")
    private String lockName;

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
     * @return lock_name
     */
    public String getLockName() {
        return lockName;
    }

    /**
     * @param lockName
     */
    public void setLockName(String lockName) {
        this.lockName = lockName;
    }
}