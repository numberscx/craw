package com.dao.dao.imple;

import com.dao.dao.entity.Shares;

import java.sql.Date;

public interface DaoInter {
    public Shares getLastShareRecord(String code);
}
