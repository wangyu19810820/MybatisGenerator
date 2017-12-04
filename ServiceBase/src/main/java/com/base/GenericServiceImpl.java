package com.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenericServiceImpl<D extends GenericDao<M, Q, PK>, M, Q, PK>
        implements GenericService<D, M, Q, PK> {

    @Autowired
    protected D dao;

    public int insert(M m) {
        return dao.insert(m);
    }

    public int update(M m) {
        return dao.updateByPrimaryKeySelective(m);
    }

    public int deleteByPrimaryKey(PK pk) {
        return dao.deleteByPrimaryKey(pk);
    }

    public M selectByPrimaryKey(PK pk) {
        return dao.selectByPrimaryKey(pk);
    }

    public D getDao() {
        return dao;
    }
}
