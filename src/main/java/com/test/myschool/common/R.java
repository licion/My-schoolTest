package com.test.myschool.common;

import lombok.Data;

/**
 * 后端响应数据的统一类型
 * @param <T>
 */
@Data
public class R<T> {
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String msg;
    /**
     * 响应的业务数据
     */
    private T data;

    /**
     * 返回操作成功的信息
     * @param data 给前端响应的数据
     * @param <T>  给前端响应的数据类型
     * @return
     */
    public static <T> R<T> success(T data) {
        R<T> r = new R<>();
        r.code = 0;
        r.msg = "操作成功";
        r.data = data;
        return r;
    }

    /**
     * 返回操作成功的信息
     * @param <T>
     * @return
     */
    public static <T> R<T> success() {
        R<T> r = new R<>();
        r.code = 0;
        r.msg = "操作成功";
        return r;
    }

    /**
     * 返回操作失败信息
     * @param <T>
     * @return
     */
    public static <T> R<T> error() {
        R<T> r = new R<>();
        r.code = 500;
        r.msg = "操作失败";
        return r;
    }
}
