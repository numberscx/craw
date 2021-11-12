package com.example.mq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@Scope("Singleton")
@Component
public class MqProduce {
    private final DefaultMQProducer producer = new DefaultMQProducer("UserProducer");
    @Value("${mp.namesrvAddr}")
    private String namesrvAddr;
    MqProduce() throws MQClientException {
        producer.setNamesrvAddr(namesrvAddr);
        producer.start();
    }
    public void sendSharesMessage(String code, HashMap<String,String> judges,String data){
        Message message = null;
        byte[] messageBody = data.getBytes();
        if(judges.containsKey("shares")&&judges.get("shares").equals(("true"))){
            if(judges.containsKey("update")&&judges.get("update").equals("true"))
                message = new Message("TOPIC_shares", "TAG_update", String.valueOf(System.currentTimeMillis()), messageBody);

        }else if(judges.containsKey("funds")&&judges.get("funds").equals(("true"))){
            if(judges.containsKey("update")&&judges.get("update").equals("true"))
                message = new Message("TOPIC_funds", "TAG_update", String.valueOf(System.currentTimeMillis()), messageBody);

        }
    }
}
