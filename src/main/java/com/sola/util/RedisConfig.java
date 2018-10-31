package com.sola.util;

import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{
	public RedisConfig() {
		super();
	}
	
	@Bean
	public CacheManager cacheManager(RedisConnectionFactory factory)
	{
		RedisCacheConfiguration config=RedisCacheConfiguration.defaultCacheConfig();
		config = config.entryTtl(Duration.ofMinutes(30)) //设置缓存的默认过期时间，也是使用Duration设置
				.disableCachingNullValues(); //不缓存空值
		
		// 设置一个初始化的缓存空间set集合
		Set<String> cacheNames=new HashSet<String>();
		cacheNames.add("my-redis-cache1");
		cacheNames.add("my-redis-cache2");
		
		// 对每个缓存空间应用不同的设置
		Map<String, RedisCacheConfiguration> configMap=new 	HashMap<String, RedisCacheConfiguration>();
		configMap.put("my-redis-cache1", config);
		configMap.put("my-redis-cache2", config.entryTtl(Duration.ofMinutes(1)));
		RedisCacheManager manager= RedisCacheManager.builder(factory)
				.initialCacheNames(cacheNames)
				.withInitialCacheConfigurations(configMap)
				.build();
		return manager;
		
	}
	
	
}
