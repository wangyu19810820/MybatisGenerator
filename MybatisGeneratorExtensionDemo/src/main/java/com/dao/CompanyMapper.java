package com.dao;

import com.base.GenericDao;
import com.model.Company;
import com.model.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper extends GenericDao<Company, CompanyExample, Integer> {
}