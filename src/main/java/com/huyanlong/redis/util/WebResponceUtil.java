package com.huyanlong.redis.util;

import com.huyanlong.redis.responce.WebResponce;

/**
 * 前台返回工具类
 */
public class WebResponceUtil {

    public static <T> WebResponce success(T data) {
        WebResponce webResponce = new WebResponce();
        webResponce.setCode(0);
        webResponce.setMsg("成功");
        webResponce.setData(data);
        return webResponce;
    }

    public static <T> WebResponce error(T data, String msg) {
        WebResponce webResponce = new WebResponce();
        webResponce.setCode(-1);
        webResponce.setMsg(msg);
        webResponce.setData(data);
        return webResponce;
    }
}
