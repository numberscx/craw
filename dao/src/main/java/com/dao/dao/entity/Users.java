package com.dao.dao.entity;

import lombok.Data;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.sql.Date;

@Data
public class Users {

    private Long id;
    private String username;
    private String password;
    private String shares;
    private String funds;
    private Date firstlog;
    private Date lastlog;
    private JSONObject sharesStrategy;
}
