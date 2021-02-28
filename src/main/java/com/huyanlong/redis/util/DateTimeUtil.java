package com.huyanlong.redis.util;

import com.huyanlong.redis.common.constant.DateFormatterPattern;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @Author huyanlong
 * @Date 2021/2/27 0:04
 */
public class DateTimeUtil {

    public static String getDateTimeByPattern(String pattern) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(pattern);
        return localDateTime.format(ofPattern);
    }


    public static String getTimeDifference(String dateTime, String pattern) {
        // 入参转换
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern(pattern));
        LocalDate localDate = localDateTime.toLocalDate();

        // 系统时间转换
        LocalDateTime systemDateTime = LocalDateTime.now();
        LocalDate systemDate = systemDateTime.toLocalDate();

        // 首先应该判断年、月、日
        Period period = Period.between(localDate, systemDate);

        // 然后检验时分秒之前的时差
        Duration duration = Duration.between(localDateTime, systemDateTime);
        if (period.getYears() > 0) {
            return period.getYears() + "年前更新";
        } else if (period.getMonths() > 0) {
            return period.getMonths() + "月前更新";
        } else if (period.getDays() > 0) {
            return period.getDays() + "天前更新";
        } else if (duration.toHours() > 0) {
            return duration.toHours() + "小时前更新";
        } else if (duration.toMinutes() > 0) {
            return duration.toMinutes() + "分钟前更新";
        } else {
            return "1分钟前更新";
        }
    }

    public static void main(String[] args) {
//        String byPattern = getDateTimeByPattern(DateFormatterPattern.NORM_DATETIME_MINUTE_PATTERN);
//        System.out.println(byPattern);
        String difference = getTimeDifference("2021-01-28 16:16", DateFormatterPattern.NORM_DATETIME_MINUTE_PATTERN);
        System.out.println(difference);
    }

//    public static <T> T getMethodParam(Class classzs, String targetMetomName, Class<T> paramClass) throws NoSuchMethodException {
//        Method method = classzs.getMethod(targetMetomName, paramClass);
//        method.getAnnotation(paramClass);
//        return method.;
//    }
}
