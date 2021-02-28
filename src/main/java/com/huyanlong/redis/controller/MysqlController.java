package com.huyanlong.redis.controller;

import com.huyanlong.redis.common.config.LevelConfig;
import com.huyanlong.redis.entry.LeftDate;
import com.huyanlong.redis.entry.QueryPage;
import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.responce.WebResponce;
import com.huyanlong.redis.server.MysqlServer;
import com.huyanlong.redis.util.WebResponceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 数据展示
 *
 * @Author huyanlong
 * @Date 2021/2/13 19:46
 */
@RestController
@RequestMapping("mysql")
public class MysqlController {

    private static final String[] group = {"lcm", "nfvo", "access"};

    private static final String[] level = {"L1", "L2", "L3", "L4"};

    private static final String[] muplan = {"我负责的微服务", "我参与的微服务", "红旗微服务"};


    @Autowired
    private LevelConfig levelConfig;
    @Autowired
    private MysqlServer mysqlServer;

    @GetMapping("getUser")
    public WebResponce getUserInfo(@NotNull(message = "id不能为null") @RequestParam Integer id) {
        return mysqlServer.queryUserInfo(id);
    }

    @PostMapping("addUser")
    public WebResponce addUserInfo(@Valid User user) {

        return WebResponceUtil.success(user);
    }

    @GetMapping("getUser/{name}")
    public WebResponce getUserById(QueryPage queryPage, @NotBlank(message = "名称不能为null") @PathVariable("name") String name) {
        return mysqlServer.queryUserPage(queryPage, name);
    }

    @GetMapping("user")
    public WebResponce getUser(@RequestParam("context") User user) {
        return WebResponceUtil.success(user);
    }

    @GetMapping("level")
    public WebResponce getLevel() {
        System.out.println("进来了");
        return WebResponceUtil.success(levelConfig.getAllLevel());
    }

    @GetMapping("left")
    public WebResponce getLeft() {

        Map<String, Object> map = new HashMap<>();

        Map<String, List<LeftDate>> hashMap = new HashMap<>();
        for (String str : group) {
            List<LeftDate> leftDates = new ArrayList<>();
            for (String lev : level) {
                LeftDate leftDate = new LeftDate();
                leftDate.setLabel(lev);
                leftDate.setValue(50);
                leftDates.add(leftDate);
            }
            hashMap.put(str, leftDates);
        }
        map.put("jindu", hashMap);

        List<LeftDate> leftDates = new ArrayList<>();
        for (String my : muplan) {
            LeftDate leftDate = new LeftDate();
            leftDate.setLabel(my);
            leftDate.setValue(20);
            leftDates.add(leftDate);
        }
        map.put("wode", leftDates);
        return WebResponceUtil.success(map);
    }
}
