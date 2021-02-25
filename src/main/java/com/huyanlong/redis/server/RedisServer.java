package com.huyanlong.redis.server;

import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.responce.WebResponce;

public interface RedisServer {
    WebResponce addRedisData(User user);

    WebResponce queryRedisData(String key);
}
