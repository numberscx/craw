package com.dao.dao.imple;

import com.dao.dao.entity.Shares;
import com.example.common.commshares.SharesInfo;

import java.sql.Date;
import java.util.List;

public class SharesTabImple implements SharesTab{
    @Override
    public List<Shares> get_shares(Date begin, Date end, String share_code) {
        return null;
    }

    /*
    * 需要计算或者整理的不要直接放在dao里面，在business中计算
    * */
    @Deprecated
    @Override
    public SharesInfo get_shares_info(Date begin, Date end, String share_code) {
        return null;
    }

    @Override
    public String get_end_price(Date dnow, String share_code) {
        return null;
    }
}
