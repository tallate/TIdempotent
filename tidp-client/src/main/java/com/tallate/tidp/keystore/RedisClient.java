package com.tallate.tidp.keystore;

import java.util.List;
import java.util.Map;

/**
  */
public interface RedisClient {

    /**
     * 增/改
     */
    void set(final String key, final String value);

    /**
     * @param seconds 过期时间
     */
    void setex(final String key, final int seconds, final String value);

    /**
     * 设置过期时间，并且只有在不存在时才能保存成功
     */
    void setexnx(final String key, final int seconds, final String value);

    void hset(final String hkey, final String key, final String value);

    long incr(final String key);

    long decr(final String key);

    /**
     * 删
     */
    boolean del(final String key);

    long hdel(final String hkey, final String key);

    /**
     * 查
     */
    String get(final String key);

    String hget(final String hkey, final String key);

    Map<String, String> hgetAll(final String hkey);

    /**
     * 设置过期时间
     */
    long expire(final String key, final int second);

    /**
     * 获取有效时间,-1：永不过期，-2：已过期/已转移，n：还有n秒过期
     */
    long ttl(final String key);

    /**
     * 加载和执行lua脚本
     */
    String loadScript(String luaScript);

    Object executeLua(String sha, List<String> keys, List<String> params);
}
