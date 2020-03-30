package com.vins.university.service.api;

import java.io.Serializable;

public interface AbstractCRUDService<T, ID extends Serializable>
{
    <S extends T> S create(S entity);

    <S extends T> void delete(S entity);
}
