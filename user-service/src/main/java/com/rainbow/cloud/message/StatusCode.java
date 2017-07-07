package com.rainbow.cloud.message;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang.StringUtils;

import java.text.MessageFormat;

/**
 * Created by caihongli on 2017/5/26.
 */
public enum StatusCode implements ResultCode {

    OK(20000, "请求成功"),

    /**
     * 用于登录时用户不存在的情况
     */
    USER_NOT_EXISTS(42003, "用户不存在, 请先注册{0}"),

    // 50xxx 服务端异常
    /**
     * 用于处理未知的服务端错误
     */
    SERVER_UNKNOWN_ERROR(50001, "服务端异常, 请稍后再试");

    private int code;

    private String message;

    private static final ImmutableMap<Integer, StatusCode> CACHE;

    static {
        final ImmutableMap.Builder<Integer, StatusCode> builder = ImmutableMap.builder();
        for (StatusCode statusCode : values()) {
            builder.put(statusCode.code(), statusCode);
        }
        CACHE = builder.build();
    }

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static StatusCode valueOfCode(int code) {
        final StatusCode status = CACHE.get(code);
        if (status == null) {
            throw new IllegalArgumentException("No matching constant for [" + code + "]");
        }
        return status;
    }

    public static StatusCode valueOfCode(int code, Object ... args) {
        final StatusCode status = CACHE.get(code);
        if (status == null) {
            throw new IllegalArgumentException("No matching constant for [" + code + "]");
        }
        if(args.length>0) {
            status.message= MessageFormat.format(status.message, args);
        }
        return status;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
