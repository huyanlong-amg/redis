package com.huyanlong.redis.server;

import com.huyanlong.redis.entry.QueryPage;
import com.huyanlong.redis.responce.WebResponce;

/**
 * @Author huyanlong
 * @Date 2021/2/13 19:48
 */
public interface MysqlServer {

    WebResponce queryUserInfo(Integer id);

    WebResponce queryUserPage(QueryPage queryPage, String name);
}
