package com.lzh.dto;

import java.util.List;

/**
 * Created by DELL on 2018/3/27.
 */
public class PageDto {
    private long total;
    private List rows;//不要指定泛型，希望给所有的模块都可以使用。

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

}
