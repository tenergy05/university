package com.vins.university.service.impl;

import com.vins.university.service.api.AbstractCRUDService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

public abstract class AbstractCRUDServiceImpl<T, ID extends Serializable> implements AbstractCRUDService<T,ID>
{
    final Logger logger = LoggerFactory.getLogger(AbstractCRUDServiceImpl.class);


    protected abstract CrudRepository<T, ID>  getRepository();

    @Override
    @Transactional
    public <S extends T> S create(S entity)
    {
        S savedEntity = getRepository().save(entity);
        logger.info("Created {}", savedEntity);
        return savedEntity;
    }

    @Override
    @Transactional
    public <S extends T> void delete(S entity)
    {
        getRepository().delete(entity);
        logger.info("Deleted {}", entity);
    }
}
