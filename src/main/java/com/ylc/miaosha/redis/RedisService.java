package com.ylc.miaosha.redis;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Description: RedisService
 * @Date: 2019/4/22
 */
@Service
public class RedisService {

    @Autowired
    JedisPool jedisPool;


    public <T> T get(String key, Class<T> clazz){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String str = jedis.get(key);
            T t = stringToBean(str, clazz);

            return t;
        }finally {
            if(jedis != null){
                jedis.close();
            }
        }

    }


    public <T> boolean set(String key, T value){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            String str = beanToString(value);
            jedis.set(key, str);

            return true;
        }finally {
            if(jedis != null){
                jedis.close();
            }
        }

    }

    private <T> T stringToBean(String str, Class<T> clazz){
        if(str == null || str.length() < 0 || clazz == null){
            return null;
        }
        return JSON.toJavaObject(JSON.parseObject(str), clazz);
    }

    private <T> String beanToString(T value){
        if(value == null){
            return null;
        }
        Class clazz = value.getClass();
        if(clazz == String.class){
            return ""+value;
        }
        String str = JSON.toJSONString(value);
        return str;
    }

}
