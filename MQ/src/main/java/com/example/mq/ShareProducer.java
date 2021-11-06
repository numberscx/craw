package com.example.mq;

import com.alibaba.fastjson.JSON;
import com.example.common.messages.ShareMess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShareProducer {
    @Autowired
    MqKeyGenerate mqKeyGenerate;
    public MqMessageData sendSmsCodeMq(String share_code,String start_tm,String end_tm) throws Exception {
//        log.info("sendSmsCodeMq - 发送短信验证码. smsMessage={}", smsMessage);
        String msgBody;
        try {
            ShareMess request = new ShareMess();
//            Map<String, String> map = Maps.newHashMap();
//            // 模板参数
//            String smsParamName = templetEnum.getSmsParamName();
//            // 模板编码
//            String templetCode = templetEnum.getTempletCode();
//            //替换模板验证码
//            map.put(smsParamName, smsMessage.getSmsCode());
//            String param = JSON.toJSONString(map);

//            request.setPhoneNumbers(smsMessage.getMobileNo());
//            request.setTemplateCode(templetCode);
//            request.setTemplateParam(param);
//            request.setOutId(smsMessage.getOutId());
            request.setShare_code(share_code);
            request.setStart_time(start_tm);
            request.setEnd_time(end_tm);
            request.setUpdate_only(Boolean.FALSE);

            msgBody = JSON.toJSONString(request);
        } catch (Exception e) {
//            log.error("发送短信验证码 smsMessage转换为json字符串失败", e);
            throw new Exception("generate");
        }
        String topic = "share-update-topic";
        String tag = "share-update-tag";
        String key = mqKeyGenerate.generateShareKey(share_code);
        return new MqMessageData(msgBody, topic, tag, key);
    }
}
