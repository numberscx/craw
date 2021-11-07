package com.dao.dao.entity;

import java.sql.Date;

public class Shares {
    /*
    * 日期
    * */
    private Date ymd;
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
    private String end_price;
    /*
     * 涨跌额
     * */
    private String change_amount;
    /*
     * 涨跌幅
     * */
    private String change_rate;
    /*
     * 换手率
     * */
    private String change_hand;
    /*
     * 成交量
     * */
    private String deal_number;
    /*
     * 成交金额
     * */
    private String deal_amount;
    /*
     * 总市值
     * */
    private String total_value;
    /*
     * 流通市值
     * */
    private String flow_value;
    public Date getYmd() {
        return ymd;
    }

    public void setYmd(Date ymd) {
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

    public String getEnd_price() {
        return end_price;
    }

    public void setEnd_price(String end_price) {
        this.end_price = end_price;
    }

    public String getChange_amount() {
        return change_amount;
    }

    public void setChange_amount(String change_amount) {
        this.change_amount = change_amount;
    }

    public String getChange_rate() {
        return change_rate;
    }

    public void setChange_rate(String change_rate) {
        this.change_rate = change_rate;
    }

    public String getChange_hand() {
        return change_hand;
    }

    public void setChange_hand(String change_hand) {
        this.change_hand = change_hand;
    }

    public String getDeal_number() {
        return deal_number;
    }

    public void setDeal_number(String deal_number) {
        this.deal_number = deal_number;
    }

    public String getDeal_amount() {
        return deal_amount;
    }

    public void setDeal_amount(String deal_amount) {
        this.deal_amount = deal_amount;
    }

    public String getTotal_value() {
        return total_value;
    }

    public void setTotal_value(String total_value) {
        this.total_value = total_value;
    }

    public String getFlow_value() {
        return flow_value;
    }

    public void setFlow_value(String flow_value) {
        this.flow_value = flow_value;
    }


}
