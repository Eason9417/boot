package com.baiyun.boot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Student {
    @TableId(value = "studentId",type = IdType.AUTO)
    private int studentId;
    private String studentName,gender,nationality,politicsStatus,school,major;
    private Date birthday,admissionDate;
}
