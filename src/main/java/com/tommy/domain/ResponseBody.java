package com.tommy.domain;

import java.io.Serializable;

/**
 * 功能描述：封装响应的数据结构
 * coding and debug by tommy
 */
public class ResponseBody<T> implements Serializable {
    //时间
    private String date = DateUtil.getCurrentDateStr("yyyy-MM-dd HH:mm:ss");
    //状态码 默认200响应成功
    private int status=200;
    //接口返回的数据
    private T data;

    //消息内容
    private InfoMsg info;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public InfoMsg getInfo() {
        return info;
    }

    public void setInfo(InfoMsg info) {
        this.info = info;
    }
}
