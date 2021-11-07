package com.dao.dao.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dao.dao.entity.Shares;
import org.springframework.stereotype.Component;

@Component(value ="sharesMapper")
public interface SharesMapper extends BaseMapper<Shares>{
}
