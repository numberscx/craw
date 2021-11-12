package com.dao.dao.entity;

import lombok.Data;

import java.sql.Date;
@Data
public class Shares {

    private Long id;
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



}
