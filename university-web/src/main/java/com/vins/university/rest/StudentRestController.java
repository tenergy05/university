package com.vins.university.rest;

import com.vins.university.model.Student;
import com.vins.university.service.api.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vova on 8/6/2016.
 */
@RestController
public class StudentRestController extends BaseRestController
{
    final Logger logger = LoggerFactory.getLogger(StudentRestController.class);

    @Autowired
    private IStudentService studentService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "VVV";
    }

    @RequestMapping(value = "/students/{sid}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public
    @ResponseBody
    Student getBySid(@PathVariable String sid,
                     @RequestParam(value = "expands", required = false) String expands)
    {
        logger.info("sid={} expands={}", sid, expands);

//        if (sid.equals("VVV"))
//            throw new RuntimeException("Go home!!");

        return studentService.findBySid(sid);
    }

    @RequestMapping(value = "/students/",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    public Student create(@RequestBody Student student)
    {
        logger.info("{}", student);
        Student newStudent = studentService.create(student);
        return newStudent;
    }


}
