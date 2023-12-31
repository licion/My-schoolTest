package service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.myschool.common.PageResult;
import com.test.myschool.pojo.Student;

public interface StudentService extends IService<Student> {
    void saveStudent(Student student);

    PageResult<Student> pager(Integer pageNum, Integer size, String name);

    void updateStudent(Student student);
}
