package com.huyanlong.redis;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.mapper.UserMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.NotBlank;
import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectIds() {
        List<Integer> asList = Arrays.asList(1, 2, 3);
        List<User> users = userMapper.selectBatchIds(asList);
        users.forEach(System.out::println);
    }

    @Test
    public void testCreate() {
        // mp 默认基于雪花算法的自增id
        User user = new User();
        user.setId(9);
        user.setName("pujianguo");
        user.setAge(20);
        user.setEmail("pujianguo@huawei.com");
        user.setGroup("nfvo");
        userMapper.insert(user);
    }

    @Test
    public void testCreate2() {
        User user = new User();
        user.setName("liming");
        user.setAge(15);
        user.setEmail("liming@huawei.com");
        user.setIpAddr("192.168.1.110");
        userMapper.insert(user);
    }

    /**
     * 条件构造器
     */
    @Test
    public void testWrapper() {
        User user = new User();
        user.setIpAddr("192.168.1.110");
        QueryWrapper<User> wrapper = new QueryWrapper<>(user);
//        wrapper.select("name", "age").like("name", "ya").lt("age", 30);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println(users);
    }

    @Test
    public void testMap() {
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("ipAddr", "192.168.1.110");
        List<User> users = userMapper.selectByMap(hashMap);
        System.out.println(users);
    }

    @Test
    public void testWrapperMaps() {
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.select("name", "age").like("ipAddr", "192.168.1.110");
        List<Map<String, Object>> mapList = userMapper.selectMaps(wrapper);
        System.out.println(mapList);
    }

    @Test
    public void testLambda() {
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.<User>lambdaQuery();
        lambdaQuery.select(User::getAge,User::getName).like(User::getIpAddr, "192.168.1.110");
        List<Map<String, Object>> maps = userMapper.selectMaps(lambdaQuery);
        System.out.println(lambdaQuery);
    }

    // Wrapper
    // 1. 名字中包含某某的并且年龄大于某个值的
    @Test
    public void selectByWrapper() {
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.<User>lambdaQuery();

        QueryWrapper<User> query = Wrappers.<User>query();
        query.like("name", "yan").lt("age", 20);

        lambdaQuery.like(User::getName, "yan").lt(User::getAge, 20);
        List<User> users = userMapper.selectList(query);

        users.forEach(System.out::println);

    }

    /**
     * 名字为王姓并且（年龄小于40或邮箱不为空）
     */
    @Test
    public void selectByWrapper5() {
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.<User>lambdaQuery();
        lambdaQuery.eq(User::getId, 1);
        List<User> userList = userMapper.selectList(lambdaQuery);
        userList.forEach(System.out::println);
    }

    /**
     * （年龄小于40并且大与20或邮箱不为空）名字为王姓并且
     */
    @Test
    public void selectByWrapper7() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<User>();
        queryWrapper.nested(wq->wq.lt("age",40))
                .or().isNotNull("email")
                .likeRight("username","王");
        List<User> userInfoList = userMapper.selectList(queryWrapper);
        userInfoList.forEach(System.out::println);
    }

    @Test
    public void test001() {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
//        wrapper.select(User::getName, User::getAge);
//        List<User> users = userMapper.selectList(wrapper);
//        Optional<User> first = users.stream().findFirst();
//        first.get()
//        users.stream().collect(Collectors.groupingBy(User::getName, Collectors.averagingInt(User::getAge).));
//        System.out.println(collect);
    }

}
