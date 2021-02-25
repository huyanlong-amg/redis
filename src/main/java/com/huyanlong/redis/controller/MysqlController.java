package com.huyanlong.redis.controller;

import com.huyanlong.redis.common.config.LevelConfig;
import com.huyanlong.redis.entry.QueryPage;
import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.responce.WebResponce;
import com.huyanlong.redis.server.MysqlServer;
import com.huyanlong.redis.util.WebResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 数据展示
 *
 * @Author huyanlong
 * @Date 2021/2/13 19:46
 */
@Validated
@RestController
@RequestMapping("mysql")
public class MysqlController {

    @Autowired
    private MysqlServer mysqlServer;

    @Autowired
    LevelConfig levelConfig;

    @GetMapping("getUser")
    public WebResponce getUserInfo(@NotNull(message = "id不能为null") @RequestParam Integer id) {
        return mysqlServer.queryUserInfo(id);
    }

    @PostMapping("addUser")
    public WebResponce addUserInfo(@Valid User user) {

        return WebResponceUtil.success(null);
    }

    @GetMapping("getUser/{name}")
    public WebResponce getUserById(QueryPage queryPage, @NotBlank(message = "名称不能为null") @PathVariable("name") String name) {
        return mysqlServer.queryUserPage(queryPage, name);
    }

    @GetMapping("level")
    public WebResponce getLevel() {
        System.out.println("进来了");
        return WebResponceUtil.success(levelConfig.getAllLevel());
    }
}
