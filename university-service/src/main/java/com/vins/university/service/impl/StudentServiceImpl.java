package com.vins.university.service.impl;

import com.vins.university.model.Student;
import com.vins.university.repository.api.StudentRepository;
import com.vins.university.service.api.IStudentService;
import com.vins.university.service.exceptions.EntityNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vova on 7/30/2016.
 */
@Service
public class StudentServiceImpl implements IStudentService
{
    final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;

    //    @Value("${version}")
    private int version;

    public StudentServiceImpl()
    {
        logger.info("Created");
    }

    public StudentServiceImpl(StudentRepository studentRepository, int version)
    {
        logger.info("Created {} {}", studentRepository, version);
        this.studentRepository = studentRepository;
        this.version = version;
    }

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }


    @Transactional
    public Student create(Student student)
    {
        Student dbStudent = studentRepository.save(student);
        logger.info("Created {}", dbStudent);
        return dbStudent;
    }

    @Transactional
    public void delete(Student student)
    {
        studentRepository.delete(student);
        logger.info("Deleted {}", student);
    }

    @Override
    public Student findBySid(String sid)
    {
        Student student = studentRepository.findBySid(sid);
        if (null == student)
        {
            throw new EntityNotFoundException("sid", sid);
        }
        return student;
    }
}
