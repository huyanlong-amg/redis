package com.huyanlong.redis.responce;

import lombok.Data;

@Data
public class WebResponce<T> {
    private Integer code;
    private String msg;
    private T data;
}
