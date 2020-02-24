package com.ljw.study.pattern.factory;

/**
 * @author lijunwei
 * @date 2020-02-24 - 17:50
 */
public class UnionRefund implements IRefund {

    public void refund(){
        System.out.println("银联支付退款");
    }
}
