package com.ylc.miaosha.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Description: TODO
 * @Date: 2019/4/22
 */
@Component
public class RedisPool {

    @Autowired
    RedisConfig redisConfig;

    @Bean
    public JedisPool JedisPool(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(redisConfig.getPoolMaxIdle());
        config.setMaxTotal(redisConfig.getPoolMaxTotal());
        config.setMaxWaitMillis(redisConfig.getPoolMaxWait());//毫秒
        JedisPool pool = new JedisPool(config,redisConfig.getHost(),redisConfig.getPort(),redisConfig.getTimeout());

        return pool;
    }
}
