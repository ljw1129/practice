package com.ljw.study.pattern.factory;

/**
 * @author lijunwei
 * @date 2020-02-24 - 17:50
 */
public class UnionPay implements IPay {

    public void pay(){
        System.out.println("银联支付");
    }
}