package com.test.myschool.controller;

import com.test.myschool.common.R;
import com.test.myschool.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public R<Student> save(@RequestBody Student student){
        //1接受参数
        studentService.saveStudent(student);
        //2调用service
        //3相应结果
        return null;
    }

    
}
