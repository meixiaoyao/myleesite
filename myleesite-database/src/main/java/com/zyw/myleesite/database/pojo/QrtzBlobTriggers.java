package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_blob_triggers")
public class QrtzBlobTriggers {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "trigger_name")
    private String triggerName;

    @Id
    @Column(name = "trigger_group")
    private String triggerGroup;

    @Column(name = "blob_data")
    private byte[] blobData;

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
     * @return blob_data
     */
    public byte[] getBlobData() {
        return blobData;
    }

    /**
     * @param blobData
     */
    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }
}