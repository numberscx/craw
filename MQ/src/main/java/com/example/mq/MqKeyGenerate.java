package com.example.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MqKeyGenerate {
//    private String key;
    SimpleDateFormat simpleDateFormat;
    MqKeyGenerate(){
        simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmmss");
    }
    public String generateShareKey(String share_code){
        Date day=new Date();
        String times=simpleDateFormat.format(day);
        return times+share_code;
    }
}
