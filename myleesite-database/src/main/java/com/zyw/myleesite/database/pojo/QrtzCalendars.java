package com.zyw.myleesite.database.pojo;

import javax.persistence.*;

@Table(name = "qrtz_calendars")
public class QrtzCalendars {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "calendar_name")
    private String calendarName;

    private byte[] calendar;

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
     * @return calendar
     */
    public byte[] getCalendar() {
        return calendar;
    }

    /**
     * @param calendar
     */
    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }
}