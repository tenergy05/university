package com.vins.university.service.api;

import com.vins.university.model.Dept;

/**
 * Created by kisa on 8/14/2016.
 */
public interface IDeptService
{
    Dept create(Dept dept);

    void delete(Dept dept);
}
