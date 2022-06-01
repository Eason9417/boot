package com.baiyun.boot.service.lmpl;


import com.baiyun.boot.mapper.StudentMapper;
import com.baiyun.boot.pojo.Student;
import com.baiyun.boot.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
