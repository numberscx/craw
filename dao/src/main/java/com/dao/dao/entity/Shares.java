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
    private String shareCode;
    /*
     * 股票名字
     * */
    private String shareName;
    /*
     * 收盘价
     * */
    private String endPrice;
    /*
     * 涨跌额
     * */
    private String changeAmount;
    /*
     * 涨跌幅
     * */
    private String changeRate;
    /*
     * 换手率
     * */
    private String changeHand;
    /*
     * 成交量
     * */
    private String dealNumber;
    /*
     * 成交金额
     * */
    private String dealAmount;
    /*
     * 总市值
     * */
    private String totalValue;
    /*
     * 流通市值
     * */
    private String flowValue;


}
