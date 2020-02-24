package com.ljw.study.pattern.factory.abstractfactory;

import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.IRefund;
import com.ljw.study.pattern.factory.methodfactory.WechatPayFactory;

/**
 * @author lijunwei
 * @date 2020-02-24 - 22:30
 */
public class AbstractPayFactoryTest {

    public static void main (String[] args) {
        WechatFactory wechatFactory = new WechatFactory();
        // 支付
        IPay pay = wechatFactory.createPay();
        pay.pay();

        // 退款
        IRefund refund = wechatFactory.createRefund();
        refund.refund();
    }

}
