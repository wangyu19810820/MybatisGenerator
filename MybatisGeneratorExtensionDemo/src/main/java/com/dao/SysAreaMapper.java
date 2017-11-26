package com.dao;

import com.base.GenericDao;
import com.model.SysArea;
import com.model.SysAreaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAreaMapper extends com.base.GenericDao<SysArea, SysAreaCriteria> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    long countByExample(SysAreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int deleteByExample(SysAreaCriteria example);

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
    List<SysArea> selectByExampleWithBLOBs(SysAreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    List<SysArea> selectByExample(SysAreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") SysArea record, @Param("example") SysAreaCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_area
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaCriteria example);
}