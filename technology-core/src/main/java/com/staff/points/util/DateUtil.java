package com.staff.points.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yanjing
 * @version Id: DateUtil.java, v 0.1 2019/10/20 21:27 yanjing Exp $$
 */
public class DateUtil {

    private static final  String datePattern="yyyy-MM-dd HH:mm:ss";

    public static Date StringToDate(String  dateTime){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(datePattern);
        //必须捕获异常
        Date date =new Date();
        try {
            date=simpleDateFormat.parse(dateTime);
        } catch(ParseException px) {
            px.printStackTrace();
        }
        return date;
    }

}
