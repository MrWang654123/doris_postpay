package com.gtxy.yyf.doris.common.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 分页处理
 * @param <T>
 */

public class PageData<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    private int pageNo = 1;
    private int pageSize = 10;
    private String pageSort;
    private long total;
    private Collection<T> rowList = new ArrayList();

    public PageData() {
    }

    public PageData(int pageNo, int pageSize, long total, Collection<T> rowList) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.total = total;
        this.rowList = rowList;
    }

    public PageData(int pageNo, int pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public String getPageSort() {
        return this.pageSort;
    }

    public void setPageSort(String pageSort) {
        this.pageSort = pageSort;
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Collection<T> getRowList() {
        return this.rowList;
    }

    public void setRowList(Collection<T> rowList) {
        this.rowList = rowList;
    }
}