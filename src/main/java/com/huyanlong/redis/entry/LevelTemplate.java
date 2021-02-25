package com.huyanlong.redis.entry;

import lombok.Data;
import lombok.ToString;

/**
 * @Author huyanlong
 * @Date 2021/2/25 23:22
 */
@ToString
@Data
public class LevelTemplate {
    /**
     * 名称
     */
    private String name;

    /**
     * 是否可下拉
     */
    private boolean drop;

    /**
     * 别名（用于爬取数据的时候参数的对照）
     */
    private String alias;
}
