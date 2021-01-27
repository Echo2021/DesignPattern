package com.test.cluster;

import java.util.concurrent.TimeUnit;

public interface CacheService {

	 String get(final String key, int redisType);

	    void set(String key, String value, int redisType);

	    void set(String key, String value, long timeout, TimeUnit timeUnit);

	    void del(String key);
}
