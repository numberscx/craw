package com.example.business;

import com.example.common.messages.MessageDTO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Singleton")
public class MessageJudge {
    public MessageDTO chooseAdd(String code,Boolean isShare){
        if(Boolean.TRUE.equals(isShare)){
            //股票增加或更新

        }
    }
}
