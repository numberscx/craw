package com.dao.dao.imple;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.dao.entity.Fundsinfo;
import com.dao.dao.entity.Shares;
import com.dao.dao.mapper.FundsMapper;
import com.dao.dao.mapper.FundsinfoMapper;
import com.dao.dao.mapper.SharesMapper;
import com.dao.dao.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class DaoImple implements DaoInter{
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private FundsinfoMapper fundsinfoMapper;
    @Autowired
    private SharesMapper sharesMapper;
    @Autowired
    private FundsMapper fundsMapper;

    public Shares getLastShareRecord(String code){

        QueryWrapper<Shares> queryWrapper = new QueryWrapper<>();
        new QueryWrapper<User>().lambda().eq(Shares::getId, 10086)
        Shares share = sharesMapper.selectOne(queryWrapper);
    }
}
