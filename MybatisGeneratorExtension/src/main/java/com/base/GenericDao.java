package com.base;

public interface GenericDao<T, K> {

    int countByExample(K example);
}
