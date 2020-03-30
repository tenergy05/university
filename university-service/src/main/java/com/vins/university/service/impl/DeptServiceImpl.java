package com.vins.university.service.impl;

import com.vins.university.model.Dept;
import com.vins.university.model.Student;
import com.vins.university.repository.api.DeptRepository;
import com.vins.university.service.api.IDeptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by kisa on 8/14/2016.
 */
@Service
public class DeptServiceImpl extends AbstractCRUDServiceImpl<Dept, Long>
        implements IDeptService
{
    final Logger logger = LoggerFactory.getLogger(DeptServiceImpl.class);

    private final DeptRepository deptRepository;

    public DeptServiceImpl(DeptRepository deptRepository)
    {
        logger.info("Created");
        this.deptRepository = deptRepository;
    }

    @Override
    protected CrudRepository<Dept, Long> getRepository()
    {
        return deptRepository;
    }

//    @Override
//    @Transactional
//    public Dept create(Dept dept)
//    {
//        return deptRepository.save(dept);
//    }
//
//    @Override
//    @Transactional
//    public void delete(Dept dept)
//    {
//        deptRepository.delete(dept);
//
//    }
}
