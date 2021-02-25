package com.huyanlong.redis.entry;

import lombok.Data;

/**
 * @Author huyanlong
 * @Date 2021/2/20 23:30
 */
@Data
public class QueryPage {
    /**
     * 当前页面数据量
     */
    private int pageSize = 10;

    /**
     * 当前页码
     */
    private int pageNum = 1;
}
