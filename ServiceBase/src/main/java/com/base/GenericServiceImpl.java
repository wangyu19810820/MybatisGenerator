package com.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class GenericServiceImpl<M, PK> implements GenericService<M, PK> {

    @Autowired
    private GenericDao<M, PK> dao;

    public long count() {
        return dao.countByExample(null);
    }
}
