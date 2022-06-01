package com.baiyun.boot.service.lmpl;

import com.baiyun.boot.mapper.StudentAccountMapper;
import com.baiyun.boot.pojo.StudentAccount;
import com.baiyun.boot.service.StudentAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StudentAccountServiceImpl extends ServiceImpl<StudentAccountMapper, StudentAccount> implements StudentAccountService {
}
