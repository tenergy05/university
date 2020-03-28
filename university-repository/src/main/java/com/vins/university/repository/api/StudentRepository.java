package com.vins.university.repository.api;

import com.vins.university.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by vova on 8/3/2016.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
//    @Query("select s from Student s where s.sid = :sid")
    Student findBySid(
//            @Param("sid")
                    String sid);

}
