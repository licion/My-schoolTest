package service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.myschool.pojo.Student;

public interface StudentService extends IService<Student> {
    void saveStudent(Student student);
}
