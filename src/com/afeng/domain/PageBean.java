package com.afeng.domain;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * 分页信息对应的表
 */
public class PageBean<T>  implements Serializable {
    private Integer pageNumber;//当前页码数
    private Integer pageSize;//每页显示数据数
    private Integer totalRecord;//总记录数
    private  Integer totalPage;//总页数
    private Integer startIndex;//当前页起始索引
    private List<T> data = new LinkedList<>();//存放的泛型数据list

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     *
     * @param pageNumber 当前页码数
     * @param pageSize 每页显示的数据数目
     * @param totalRecord 总记录数
     */
    public PageBean(Integer pageNumber, Integer pageSize, Integer totalRecord) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;
        this.totalPage = (int) Math.ceil(totalRecord * 1.0 / pageSize);
        this.startIndex = (pageNumber - 1) * pageSize;
    }

}
