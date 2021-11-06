package com.example.common.commshares;

import java.math.BigDecimal;

public class ShareStrategy {
    /*
    * 在n天内均价的多少百分比买入
    * */
    private Float buyRatio;
    /*
     * 当天换手率
     * */
    private BigDecimal changeAmount;
    /*
     * 止损倍率
     * */
    private Float stopLoss;
    /*
     * 止盈倍率
     * */
    private Float stopWin;
    /*
     * 手续费
     * */
    private Float poundages;

}
