package com.vins.university.repository.api;

import com.vins.university.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by vova on 8/3/2016.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
    //    @Query("select s from Student s where s.sid = :sid")
    Student findBySid(
//            @Param("sid")
            String sid);

}
