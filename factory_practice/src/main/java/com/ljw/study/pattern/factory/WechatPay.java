package com.ljw.study.pattern.factory;

/**
 * @author lijunwei
 * @date 2020-02-24 - 17:50
 */
public class WechatPay implements IPay {

    public void pay(){
        System.out.println("微信支付");
    }
}
