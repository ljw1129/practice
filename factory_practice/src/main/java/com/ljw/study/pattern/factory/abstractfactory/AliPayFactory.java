package com.ljw.study.pattern.factory.abstractfactory;

import com.ljw.study.pattern.factory.*;

/**
 * @author lijunwei
 * @date 2020-02-24 - 22:30
 * 阿里支付产品族（包含支付，退款）
 */
public class AliPayFactory extends AbstractPayFactory {

    @Override
    protected IPay createPay () {
        super.init();
        return new AliPay();
    }

    @Override
    protected IRefund createRefund () {
        init();
        return new AliRefund();
    }
}
