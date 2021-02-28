package com.huyanlong.redis.server.impl;

import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.responce.WebResponce;
import com.huyanlong.redis.server.RedisServer;
import com.huyanlong.redis.util.WebResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServerImpl implements RedisServer {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 主要实验redis存储
     *
     * @param user 用户结构体
     * @return 结果数据
     */
    @Override
    public WebResponce addRedisData(User user) {
        // StringRedisTemplate
//        stringRedisTemplate.opsForValue().set(UUID.randomUUID().toString(), "");

        redisTemplate.opsForValue().set("user", user);
        return WebResponceUtil.success("");
    }

    /**
     * 工具key之查询redis数据
     *
     * @param key 索引
     * @return 结果数据
     */
    @Override
    public WebResponce queryRedisData(String key) {
        Object user = redisTemplate.opsForValue().get("user");
        return WebResponceUtil.success(user);
    }
}
