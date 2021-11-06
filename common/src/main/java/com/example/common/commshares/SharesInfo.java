package com.example.common.commshares;

import java.sql.Date;
import java.util.List;

/*
* 2021/10/30
* scx
* 用来计算买卖策略的平均收益率
* */
public class SharesInfo {
    /*
     * 日期
     * */
    private List<Date> ymd;
    /*
     * 股票代码
     * */
    private String share_code;
    /*
     * 股票名字
     * */
    private String share_name;
    /*
     * 收盘价
     * */
    private List<String> end_price;

    public ShareYield configure_yield(ShareStrategy shareStrategy){
        return null;
    }

    public List<Date> getYmd() {
        return ymd;
    }

    public void setYmd(List<Date> ymd) {
        this.ymd = ymd;
    }

    public String getShare_code() {
        return share_code;
    }

    public void setShare_code(String share_code) {
        this.share_code = share_code;
    }

    public String getShare_name() {
        return share_name;
    }

    public void setShare_name(String share_name) {
        this.share_name = share_name;
    }

    public List<String> getEnd_price() {
        return end_price;
    }

    public void setEnd_price(List<String> end_price) {
        this.end_price = end_price;
    }
}
