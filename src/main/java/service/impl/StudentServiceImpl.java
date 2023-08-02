package service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.myschool.common.PageResult;
import com.test.myschool.mapper.StudentMapper;
import com.test.myschool.pojo.Student;
import lombok.val;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import service.StudentService;

import java.util.List;

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

    @Override
    public PageResult<Student> pager(Integer pageNum, Integer size, String name) {
        //这是第一步自动生成page对象，并将参数传入
        IPage<Student> page = new Page<>(pageNum,size);
        //这是第一步自动生成的对象，将其改变为lambda。
        LambdaQueryWrapper<Student> queryWrapper = new LambdaQueryWrapper<>();
        //lambda表达式写入
        /*
         * if(StringUtils.isNotEmpty(name)){
         * Student::getName,name
         * }
         * */
        queryWrapper.like(StringUtils.isNotEmpty(name),Student::getName,name);
        //第一步，先封装返回值，并使用自动生成生成对应的对象。
        IPage<Student> result = page(page, queryWrapper);
        List<Student> records = result.getRecords();
        //拿到返回值后从中获取pageResult所需的元素
        Long total = result.getTotal();
        PageResult<Student> pageResult = new PageResult<>();
        pageResult.setRecords(records);
        pageResult.setTotal(total);
        return pageResult;
    }

    @Override
    public void updateStudent(Student student) {
        if (student.getAge() != null && student.getAge() >=12 && student.getAge() <=40){
            updateById(student);
        }else {
            throw new IllegalArgumentException("s");
        }
    }


}
