package com.zyw.myleesite.common.config;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * <p>Title: Global </p>
 * <p>Description: </p>
 *
 * @author Zyw
 * @version 1.0.0
 * @date 2018/01/18 上午 8:53
 */
public class Global {
    // 当前对象实例
    private static Global global = new Global();

    // 保存全局属性值
    private static Map<String, String> map = Maps.newHashMap();

//    private static PropertiesLoader propertiesLoaderder;
}
