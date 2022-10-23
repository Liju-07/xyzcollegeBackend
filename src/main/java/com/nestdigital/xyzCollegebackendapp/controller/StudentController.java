package com.nestdigital.xyzCollegebackendapp.controller;

import com.nestdigital.xyzCollegebackendapp.Dao.StudentDao;
import com.nestdigital.xyzCollegebackendapp.Model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentDao dao;

@CrossOrigin(origins = "*")
    @PostMapping(path = "/studententry",consumes = "application/json",produces = "applications/json")
    public String studententry(@RequestBody StudentModel student)
    {
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success'}";
    }
}
