package com.dao;

import com.base.GenericDao;
import com.model.SysArea;
import com.model.SysAreaCriteria;
import com.model.SysAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAreaMapper extends GenericDao<SysArea, SysAreaCriteria, String> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    long countByExample(SysAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int deleteByExample(SysAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int deleteByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int insert(SysArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int insertSelective(SysArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    List<SysArea> selectByExample(SysAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    SysArea selectByPrimaryKey(String areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysArea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByPrimaryKey(SysArea record);
}