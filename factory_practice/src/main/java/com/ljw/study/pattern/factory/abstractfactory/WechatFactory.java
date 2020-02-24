package com.ljw.study.pattern.factory.abstractfactory;

import com.ljw.study.pattern.factory.*;

/**
 * @author lijunwei
 * @date 2020-02-24 - 22:30
 * 微信支付产品族（包含支付，退款等功能）
 */
public class WechatFactory extends AbstractPayFactory {

    protected IPay createPay () {
        super.init();
        return new WechatPay();
    }

    @Override
    protected IRefund createRefund () {
        init();
        return new WechatRefund();
    }


}
