package com.example.ff.demo.test.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    //替换注入spring中的redisTemplate实例
    @Bean   //入参  RedisConnectionFactory redisConnectionFactory  将由spring自动注入
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory){

        //创建RedisTemplate模板对象
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
        //setConnectionFactory（不要忘记这一步，否则spring启动将报错）
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        //进行redis的key值的序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer =
                new Jackson2JsonRedisSerializer<>(Object.class);

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        /*指定enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL)的话，
        存储到redis里的数据将是有类型的json数据*/
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        //为serializer指定objectMapper
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);

        //设置value的序列化
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);

        //设置hash key的序列化
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());

        //设置hash value的序列化
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);

        return redisTemplate;
    }


}
