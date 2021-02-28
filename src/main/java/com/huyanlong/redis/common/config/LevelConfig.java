package com.huyanlong.redis.common.config;

import com.huyanlong.redis.entry.LevelTemplate;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @Author huyanlong
 * @Date 2021/2/25 23:18
 */
@ConfigurationProperties(prefix = "leveltemp")
@ToString
@Data
public class LevelConfig {
    /**
     * 结构为：L1 ： {name : '', drop : true, alias : ''}
     */
    private Map<String, List<LevelTemplate>> allLevel;
}
