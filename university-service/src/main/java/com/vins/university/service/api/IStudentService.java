package com.vins.university.service.api;

import com.vins.university.model.Student;

/**
 * Created by vova on 7/30/2016.
 */
public interface IStudentService extends AbstractCRUDService<Student, Long>
{
//    Student create(Student student);
//
//    void delete(Student student);

    Student findBySid(String sid);
}
