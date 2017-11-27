package com.dao;

import com.model.SysArea;

import java.util.List;

public interface SysAreaExtendMapper extends SysAreaMapper {

    List<SysArea> selectByFatherId();
}
