package com.gtxy.yyf.doris.common.utils;



import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * @ClassName:
 * @PackageName: com.how2java.springboot.utils
 * @author: youjp
 * @create: 2019-08-13 21:06
 * @description:
 * @Version: 1.0
 */
public final class JsonUtils {
    private JsonUtils() {
    }

    public static <T> T parseObject(String text, Class<T> clazz) {
        return JSON.parseObject(text, clazz);
    }

    public static <T> List<T> parseArray(String text, Class<T> clazz) {
        return JSON.parseArray(text, clazz);
    }

    public static String toJSONString(Object object) {
        return JSON.toJSONString(object);
    }

    public static String toJSONString(Object object, boolean prettyFormat) {
        return JSON.toJSONString(object, prettyFormat);
    }
}
