package com.service;

import com.base.GenericService;
import com.dao.CompanyMapper;
import com.model.Company;
import com.model.CompanyExample;

public interface CompanyService extends GenericService<CompanyMapper, Company, CompanyExample, Integer> {
}