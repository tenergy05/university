package com.vins.university.service;

import com.vins.university.model.Dept;
import com.vins.university.model.Student;
import com.vins.university.service.api.IDeptService;
import com.vins.university.service.api.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by vova on 7/31/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        {
                "classpath:university-service-test-context.xml"
        }
)
public class StudentServiceTest
{
    //private IStudentService studentService = new StudentServiceImpl();
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IDeptService deptService;

    private Dept csDept;
    private Dept taasiaDept;

    @Before
    public void setup()
    {
        csDept = deptService.create(new Dept("303", "CS"));
        assertNotNull(csDept);
        System.out.println(csDept);

        taasiaDept = deptService.create(new Dept("104", "IE"));
        assertNotNull(taasiaDept);
        System.out.println(csDept);
    }

    @Test
    public void testCreateStudent()
    {
        Student ireneStudent = studentService.create(new Student("306257", "irene", "n", csDept));
        assertNotNull(ireneStudent);
        System.out.println(ireneStudent);

        Student vovaStudent = studentService.create(new Student("303932", "vova", "b", csDept));
        assertNotNull(vovaStudent);
        System.out.println(vovaStudent);

        Student pikinesStudent = studentService.create(new Student("307123", "pikines", "k", taasiaDept));
        assertNotNull(pikinesStudent);
        System.out.println(pikinesStudent);

        Student vovaStudentFetched = studentService.findBySid("303932");
        assertNotNull(vovaStudentFetched);
        System.out.println(vovaStudentFetched);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void testCreateStudentNullDept()
    {
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
