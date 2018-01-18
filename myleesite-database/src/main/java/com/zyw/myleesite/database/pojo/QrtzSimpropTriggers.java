package com.zyw.myleesite.database.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "qrtz_simprop_triggers")
public class QrtzSimpropTriggers {
    @Id
    @Column(name = "sched_name")
    private String schedName;

    @Id
    @Column(name = "trigger_name")
    private String triggerName;

    @Id
    @Column(name = "trigger_group")
    private String triggerGroup;

    @Column(name = "str_prop_1")
    private String strProp1;

    @Column(name = "str_prop_2")
    private String strProp2;

    @Column(name = "str_prop_3")
    private String strProp3;

    @Column(name = "int_prop_1")
    private Integer intProp1;

    @Column(name = "int_prop_2")
    private Integer intProp2;

    @Column(name = "long_prop_1")
    private Long longProp1;

    @Column(name = "long_prop_2")
    private Long longProp2;

    @Column(name = "dec_prop_1")
    private BigDecimal decProp1;

    @Column(name = "dec_prop_2")
    private BigDecimal decProp2;

    @Column(name = "bool_prop_1")
    private String boolProp1;

    @Column(name = "bool_prop_2")
    private String boolProp2;

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
     * @return str_prop_1
     */
    public String getStrProp1() {
        return strProp1;
    }

    /**
     * @param strProp1
     */
    public void setStrProp1(String strProp1) {
        this.strProp1 = strProp1;
    }

    /**
     * @return str_prop_2
     */
    public String getStrProp2() {
        return strProp2;
    }

    /**
     * @param strProp2
     */
    public void setStrProp2(String strProp2) {
        this.strProp2 = strProp2;
    }

    /**
     * @return str_prop_3
     */
    public String getStrProp3() {
        return strProp3;
    }

    /**
     * @param strProp3
     */
    public void setStrProp3(String strProp3) {
        this.strProp3 = strProp3;
    }

    /**
     * @return int_prop_1
     */
    public Integer getIntProp1() {
        return intProp1;
    }

    /**
     * @param intProp1
     */
    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    /**
     * @return int_prop_2
     */
    public Integer getIntProp2() {
        return intProp2;
    }

    /**
     * @param intProp2
     */
    public void setIntProp2(Integer intProp2) {
        this.intProp2 = intProp2;
    }

    /**
     * @return long_prop_1
     */
    public Long getLongProp1() {
        return longProp1;
    }

    /**
     * @param longProp1
     */
    public void setLongProp1(Long longProp1) {
        this.longProp1 = longProp1;
    }

    /**
     * @return long_prop_2
     */
    public Long getLongProp2() {
        return longProp2;
    }

    /**
     * @param longProp2
     */
    public void setLongProp2(Long longProp2) {
        this.longProp2 = longProp2;
    }

    /**
     * @return dec_prop_1
     */
    public BigDecimal getDecProp1() {
        return decProp1;
    }

    /**
     * @param decProp1
     */
    public void setDecProp1(BigDecimal decProp1) {
        this.decProp1 = decProp1;
    }

    /**
     * @return dec_prop_2
     */
    public BigDecimal getDecProp2() {
        return decProp2;
    }

    /**
     * @param decProp2
     */
    public void setDecProp2(BigDecimal decProp2) {
        this.decProp2 = decProp2;
    }

    /**
     * @return bool_prop_1
     */
    public String getBoolProp1() {
        return boolProp1;
    }

    /**
     * @param boolProp1
     */
    public void setBoolProp1(String boolProp1) {
        this.boolProp1 = boolProp1;
    }

    /**
     * @return bool_prop_2
     */
    public String getBoolProp2() {
        return boolProp2;
    }

    /**
     * @param boolProp2
     */
    public void setBoolProp2(String boolProp2) {
        this.boolProp2 = boolProp2;
    }
}