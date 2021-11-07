package com.dao.dao;

import com.dao.dao.entity.Shares;
import com.dao.dao.mapper.SharesMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
//@MapperScan("com.dao.dao.mapper")
class DaoApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    SharesMapper sharesMapper;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
    @Test
    void sharesTest() {
        List<Shares> a=sharesMapper.selectList(null);
        System.out.println(a.get(0).toString());
    }

}
