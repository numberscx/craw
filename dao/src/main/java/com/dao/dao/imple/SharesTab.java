package com.dao.dao.imple;

import com.dao.dao.entity.Shares;
import com.example.common.commshares.SharesInfo;

import java.sql.Date;
import java.util.List;

public interface SharesTab {
    List<Shares> get_shares(Date begin,Date end,String share_code);
    SharesInfo get_shares_info(Date begin, Date end, String share_code);
    String get_end_price(Date dnow,String share_code);
}
