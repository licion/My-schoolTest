package service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.myschool.mapper.StudentMapper;
import com.test.myschool.pojo.Student;
import org.springframework.stereotype.Service;
import service.StudentService;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

    @Override
    public void saveStudent(Student student) {
        if (student.getAge() != null && student.getAge() >=12 && student.getAge() <=40){
            save(student);
        }else {
            throw new IllegalArgumentException("s");
        }

    }
}
