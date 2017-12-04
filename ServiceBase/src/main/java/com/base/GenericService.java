package com.base;

public interface GenericService<D extends GenericDao<M, Q, PK>, M, Q, PK> {

    int insert(M m);
    int update(M m);
    int deleteByPrimaryKey(PK pk);
    M selectByPrimaryKey(PK pk);
    D getDao();
}
