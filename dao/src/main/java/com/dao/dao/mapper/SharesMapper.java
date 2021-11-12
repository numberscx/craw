package com.dao.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dao.dao.entity.Shares;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SharesMapper extends BaseMapper<Shares> {

}
