package com.base;

public interface GenericDao<T, K> {

    long countByExample(K example);
}
