package com.sumu.seckill.utils;

import java.util.UUID;

/**
 * UUID工具类
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
