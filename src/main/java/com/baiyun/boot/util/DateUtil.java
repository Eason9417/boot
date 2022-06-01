package com.baiyun.boot.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class DateUtil {
    //将时间转化成年-月-日的形式
    public String YearMonDayData(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String newData = format.format(date);
        return newData;
    }
    //获取格式为年-月-日-时-分-秒格式的系统时间
    public String NowDate(){
        Date day = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sysdate = dt.format(day);
        return sysdate;
    }
}
