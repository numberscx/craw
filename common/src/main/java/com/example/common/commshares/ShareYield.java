package com.example.common.commshares;

import java.sql.Date;
import java.util.List;

/*
* 2021/10/30
* scx
* 计算出的收益率等其他信息
* */
public class ShareYield {
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
    /*
     * 操作-买或卖
     * */
    private List<ShareAction> shareActions;
    /*
     * 任意时刻的资产状态
     * */
    private List<Asset> assets;
}
