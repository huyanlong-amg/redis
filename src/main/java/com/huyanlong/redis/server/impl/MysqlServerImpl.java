package com.huyanlong.redis.server.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huyanlong.redis.entry.QueryPage;
import com.huyanlong.redis.entry.User;
import com.huyanlong.redis.mapper.UserMapper;
import com.huyanlong.redis.responce.WebResponce;
import com.huyanlong.redis.server.MysqlServer;
import com.huyanlong.redis.util.RedisUtil;
import com.huyanlong.redis.util.WebResponceUtil;
import io.lettuce.core.cluster.RedisClusterURIUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author huyanlong
 * @Date 2021/2/13 19:49
 */
@Service
public class MysqlServerImpl implements MysqlServer {

    @Autowired
    private UserMapper userMapper;

    @Override
    public WebResponce queryUserPage(QueryPage queryPage, String name) {
        Page<User> page = new Page<>(queryPage.getPageNum(), queryPage.getPageSize());
        LambdaQueryWrapper<User> lambdaQuery = Wrappers.<User>lambdaQuery();
        lambdaQuery.eq(User::getName, name);
        IPage<User> userPage = userMapper.selectPage(page, lambdaQuery);
        return WebResponceUtil.success(RedisUtil.getDataTable(userPage));
    }

    @Override
    public WebResponce queryUserInfo(Integer id) {
        User user = userMapper.selectById(id);
        return WebResponceUtil.success(user);
    }
}
