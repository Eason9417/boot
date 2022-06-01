package com.baiyun.boot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class StudentAccount {
    @TableId(value = "studentId",type = IdType.AUTO)
    private int studentId;

    private String studentPwd;
}
