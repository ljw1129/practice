package com.ljw.study.pattern.factory;

/**
 * @author lijunwei
 * @date 2020-02-24 - 17:50
 */
public class AliRefund implements IRefund {

    public void refund(){
        System.out.println("支付宝支付退款");
    }
}
