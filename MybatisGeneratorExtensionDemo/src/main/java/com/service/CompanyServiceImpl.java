package com.service;

import com.base.GenericServiceImpl;
import com.dao.CompanyMapper;
import com.model.Company;
import com.model.CompanyExample;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl extends GenericServiceImpl<CompanyMapper, Company, CompanyExample, Integer> implements CompanyService {
}