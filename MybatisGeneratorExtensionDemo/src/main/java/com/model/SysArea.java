package com.model;

import com.base.BaseModel;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_area
 * @mbg.generated do_not_delete_during_merge
 */
public class SysArea extends BaseModel {
    /**
     * Database Column Remarks:
     *   地区编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.id
     * @mbg.generated
     */
    private String id;

    /**
     * Database Column Remarks:
     *   地区名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.area_name
     * @mbg.generated
     */
    private String areaName;

    /**
     * Database Column Remarks:
     *   父级地区编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.father_id
     * @mbg.generated
     */
    private String fatherId;

    /**
     * Database Column Remarks:
     *   地区简称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.area_shortname
     * @mbg.generated
     */
    private String areaShortname;

    /**
     * Database Column Remarks:
     *   地区完整名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.area_fullname
     * @mbg.generated
     */
    private String areaFullname;

    /**
     * Database Column Remarks:
     *   状态,1启用0禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.status
     * @mbg.generated
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.upd_datetime
     * @mbg.generated
     */
    private Date updDatetime;

    /**
     * Database Column Remarks:
     *   更新人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.upd_user
     * @mbg.generated
     */
    private String updUser;

    /**
     * Database Column Remarks:
     *   排序ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.sort_id
     * @mbg.generated
     */
    private Integer sortId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.max_delnum_county
     * @mbg.generated
     */
    private Byte maxDelnumCounty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.max_delnum_base
     * @mbg.generated
     */
    private Byte maxDelnumBase;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.test_boolean
     * @mbg.generated
     */
    private Boolean testBoolean;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.test_blob
     * @mbg.generated
     */
    private byte[] testBlob;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_area.test_clob
     * @mbg.generated
     */
    private String testClob;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.id
     *
     * @return the value of sys_area.id
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.id
     *
     * @param id the value for sys_area.id
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.area_name
     *
     * @return the value of sys_area.area_name
     * @mbg.generated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.area_name
     *
     * @param areaName the value for sys_area.area_name
     * @mbg.generated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.father_id
     *
     * @return the value of sys_area.father_id
     * @mbg.generated
     */
    public String getFatherId() {
        return fatherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.father_id
     *
     * @param fatherId the value for sys_area.father_id
     * @mbg.generated
     */
    public void setFatherId(String fatherId) {
        this.fatherId = fatherId == null ? null : fatherId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.area_shortname
     *
     * @return the value of sys_area.area_shortname
     * @mbg.generated
     */
    public String getAreaShortname() {
        return areaShortname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.area_shortname
     *
     * @param areaShortname the value for sys_area.area_shortname
     * @mbg.generated
     */
    public void setAreaShortname(String areaShortname) {
        this.areaShortname = areaShortname == null ? null : areaShortname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.area_fullname
     *
     * @return the value of sys_area.area_fullname
     * @mbg.generated
     */
    public String getAreaFullname() {
        return areaFullname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.area_fullname
     *
     * @param areaFullname the value for sys_area.area_fullname
     * @mbg.generated
     */
    public void setAreaFullname(String areaFullname) {
        this.areaFullname = areaFullname == null ? null : areaFullname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.status
     *
     * @return the value of sys_area.status
     * @mbg.generated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.status
     *
     * @param status the value for sys_area.status
     * @mbg.generated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.upd_datetime
     *
     * @return the value of sys_area.upd_datetime
     * @mbg.generated
     */
    public Date getUpdDatetime() {
        return updDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.upd_datetime
     *
     * @param updDatetime the value for sys_area.upd_datetime
     * @mbg.generated
     */
    public void setUpdDatetime(Date updDatetime) {
        this.updDatetime = updDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.upd_user
     *
     * @return the value of sys_area.upd_user
     * @mbg.generated
     */
    public String getUpdUser() {
        return updUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.upd_user
     *
     * @param updUser the value for sys_area.upd_user
     * @mbg.generated
     */
    public void setUpdUser(String updUser) {
        this.updUser = updUser == null ? null : updUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.sort_id
     *
     * @return the value of sys_area.sort_id
     * @mbg.generated
     */
    public Integer getSortId() {
        return sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.sort_id
     *
     * @param sortId the value for sys_area.sort_id
     * @mbg.generated
     */
    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.max_delnum_county
     *
     * @return the value of sys_area.max_delnum_county
     * @mbg.generated
     */
    public Byte getMaxDelnumCounty() {
        return maxDelnumCounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.max_delnum_county
     *
     * @param maxDelnumCounty the value for sys_area.max_delnum_county
     * @mbg.generated
     */
    public void setMaxDelnumCounty(Byte maxDelnumCounty) {
        this.maxDelnumCounty = maxDelnumCounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.max_delnum_base
     *
     * @return the value of sys_area.max_delnum_base
     * @mbg.generated
     */
    public Byte getMaxDelnumBase() {
        return maxDelnumBase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.max_delnum_base
     *
     * @param maxDelnumBase the value for sys_area.max_delnum_base
     * @mbg.generated
     */
    public void setMaxDelnumBase(Byte maxDelnumBase) {
        this.maxDelnumBase = maxDelnumBase;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.test_boolean
     *
     * @return the value of sys_area.test_boolean
     * @mbg.generated
     */
    public Boolean getTestBoolean() {
        return testBoolean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.test_boolean
     *
     * @param testBoolean the value for sys_area.test_boolean
     * @mbg.generated
     */
    public void setTestBoolean(Boolean testBoolean) {
        this.testBoolean = testBoolean;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.test_blob
     *
     * @return the value of sys_area.test_blob
     * @mbg.generated
     */
    public byte[] getTestBlob() {
        return testBlob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.test_blob
     *
     * @param testBlob the value for sys_area.test_blob
     * @mbg.generated
     */
    public void setTestBlob(byte[] testBlob) {
        this.testBlob = testBlob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_area.test_clob
     *
     * @return the value of sys_area.test_clob
     * @mbg.generated
     */
    public String getTestClob() {
        return testClob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_area.test_clob
     *
     * @param testClob the value for sys_area.test_clob
     * @mbg.generated
     */
    public void setTestClob(String testClob) {
        this.testClob = testClob == null ? null : testClob.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaName=").append(areaName);
        sb.append(", fatherId=").append(fatherId);
        sb.append(", areaShortname=").append(areaShortname);
        sb.append(", areaFullname=").append(areaFullname);
        sb.append(", status=").append(status);
        sb.append(", updDatetime=").append(updDatetime);
        sb.append(", updUser=").append(updUser);
        sb.append(", sortId=").append(sortId);
        sb.append(", maxDelnumCounty=").append(maxDelnumCounty);
        sb.append(", maxDelnumBase=").append(maxDelnumBase);
        sb.append(", testBoolean=").append(testBoolean);
        sb.append(", testBlob=").append(testBlob);
        sb.append(", testClob=").append(testClob);
        sb.append("]");
        sb.append(", from super class ");
        sb.append(super.toString());
        return sb.toString();
    }
}