package com.sola.util;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.tool.hbm2ddl.Target;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{
//	private static final Logger log =LoggerFactory.getLogger(RedisConfig.class);
//	
//	@Value("${spring.redis.host}")
//	private String host;
//	@Value("${spring.redis.port}")
//	private String port;
//	@Value("${spring.redis.timeout}")
//	private int timeout;
//	@Value("${spring.redis.password}")
//	private String password;
//	
//	
//	public RedisConfig() {
//		super();
//	}
//	
//	//	@Bean
//	//	public CacheManager cacheManager(RedisConnectionFactory factory)
//	//	{
//	//		RedisCacheConfiguration config=RedisCacheConfiguration.defaultCacheConfig();
//	//		config = config.entryTtl(Duration.ofMinutes(30)) //设置缓存的默认过期时间，也是使用Duration设置
//	//				.disableCachingNullValues(); //不缓存空值
//	//		
//	//		// 设置一个初始化的缓存空间set集合
//	//		Set<String> cacheNames=new HashSet<String>();
//	//		cacheNames.add("my-redis-cache1");
//	//		cacheNames.add("my-redis-cache2");
//	//		
//	//		// 对每个缓存空间应用不同的设置
//	//		Map<String, RedisCacheConfiguration> configMap=new 	HashMap<String, RedisCacheConfiguration>();
//	//		configMap.put("my-redis-cache1", config);
//	//		configMap.put("my-redis-cache2", config.entryTtl(Duration.ofMinutes(1)));
//	//		RedisCacheManager manager= RedisCacheManager.builder(factory)
//	//				.initialCacheNames(cacheNames)
//	//				.withInitialCacheConfigurations(configMap)
//	//				.build();
//	//		return manager;
//	//		
//	//	}	
//	
//	@Autowired
//	private JedisConnectionFactory jedisConnectionFactory;
//	
//	@Bean
//	@Override
//	public KeyGenerator keyGenerator() {
//		return (target,method,params) ->{
//			StringBuilder sb=new StringBuilder();
//			sb.append(target.getClass().getName());
//			sb.append(":");
//			sb.append(method.getName());
//			for (Object object : params) {
//				sb.append(":"+String.valueOf(object));
//			}
//			String rsToUse = String.valueOf(sb);
//			log.info("自动生成Redis Key -> [{}]",rsToUse);
//			return rsToUse;
//		};
//	}
//	
//	
//	
//	@Bean
//	@Override
//	public CacheManager cacheManager() {
//		log.info("初始化 -> [{}]","CacheManage RedisCacheMannage started");
//		//初始化缓存管理器，使用默认配置
//		RedisCacheManager.RedisCacheManagerBuilder builder=RedisCacheManager
//						.RedisCacheManagerBuilder
//						.fromConnectionFactory(jedisConnectionFactory);
//		return builder.build();
//	}
//	
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory){
//		//设置序列化
//		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer=new Jackson2JsonRedisSerializer(Object.class);
//		Ob
//	}
}
