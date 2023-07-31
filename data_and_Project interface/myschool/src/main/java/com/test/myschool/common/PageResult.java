package com.test.myschool.common;

import lombok.Data;

import java.util.List;

/**
 * 封装分页查询数据
 * @param <T>
 */
@Data
public class PageResult<T> {
    /**
     * 总记录数
     */
    private long total;
    /**
     * 当前页数据
     */
    private List<T> records;
}
