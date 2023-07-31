package com.test.myschool.controller;

import com.test.myschool.common.R;
import com.test.myschool.pojo.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping
    public R<Student> save(@RequestBody Student student){

        return null;
    }
}
