package com.vins.university.service;

import com.vins.university.model.Dept;
import com.vins.university.model.Student;
import com.vins.university.service.api.IDeptService;
import com.vins.university.service.api.IStudentService;
import com.vins.university.service.impl.StudentServiceImpl;
import org.hibernate.AnnotationException;
import org.hibernate.TransientPropertyValueException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by vova on 7/31/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        {
                "classpath:university-service-test-context.xml"
        }
)
public class StudentServiceTest {
    //private IStudentService studentService = new StudentServiceImpl();
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IDeptService deptService;

    private Dept csDept;
    private Dept taasiaDept;

    @Before
    public void setup() {
        csDept = deptService.create(new Dept("303", "CS"));
        assertTrue(csDept != null);
        System.out.println(csDept);

        taasiaDept = deptService.create(new Dept("104", "IE"));
        assertTrue(taasiaDept != null);
        System.out.println(csDept);
    }

    @Test
    public void testCreateStudent() {
        Student ireneStudent = studentService.create(new Student("306257", "irene", "n", csDept));
        assertTrue(ireneStudent != null);
        System.out.println(ireneStudent);

        Student vovaStudent = studentService.create(new Student("303932", "vova", "b", csDept));
        assertTrue(vovaStudent != null);
        System.out.println(vovaStudent);

        Student pikinesStudent = studentService.create(new Student("307123", "pikines", "k", taasiaDept));
        assertTrue(pikinesStudent != null);
        System.out.println(pikinesStudent);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testCreateStudentNullDept() {
        Student nullDeptStudent = studentService.create(new Student("777", "nobody1", "zzz",
                null
        ));
    }

//    @Test //(expected = TransientPropertyValueException.class)
//    public void testCreateStudentNoDept() {
//        Student nullDeptStudent = studentService.create(new Student("777", "nobody2", "zzz",
//                new Dept("xxx", "yyy")
//        ));
//    }
}
