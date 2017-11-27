package com.base;

public interface GenericDao<T, K> {

    long countByExample(K example);
    int insert(T record);
    int abc();
}
