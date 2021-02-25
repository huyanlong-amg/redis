package com.huyanlong.redis.controller;

import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.responce.WebResponce;
import com.huyanlong.redis.server.RedisServer;
import com.huyanlong.redis.util.WebResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    RedisServer redisServer;

    @GetMapping("/queryData")
    public WebResponce getRedisData() {
        return WebResponceUtil.success("");
    }

    @PostMapping("/addRedisData")
    public WebResponce addRedisData(@RequestBody User user) {
        return redisServer.addRedisData(user);
    }

    @GetMapping("/getRedisData")
    public WebResponce queryRedisData(@RequestParam String key) {
        return  redisServer.queryRedisData(key);
    }
}
