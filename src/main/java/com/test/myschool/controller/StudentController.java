package com.test.myschool.controller;

import com.test.myschool.common.PageResult;
import com.test.myschool.common.R;
import com.test.myschool.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;

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
        return R.success();
    }

    @GetMapping("/pager")
    public R<PageResult<Student>> pageResultR(Integer pageNum,Integer size,String name){

        //1接受参数
        PageResult<Student> pageResult =  studentService.pager(pageNum,size,name);
        //2调用service
        //3相应结果
        return R.success(pageResult);
    }

    @GetMapping("/{id}")
    public R<Student> getStudent(@PathVariable(value = "id") Long id){
        //使用自带方法
        Student student = studentService.getById(id);
        return R.success(student);
    }

    @PostMapping
    public R update(@RequestBody Student student){
        studentService.updateStudent(student);
        return R.success();
    }

    @DeleteMapping()
    public R deleteStudent(@RequestParam List<Long> ids){
        studentService.removeByIds(ids);
        return R.success();
    }








}
