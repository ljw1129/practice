package com.ljw.study.pattern.factory.methodfactory;

import com.ljw.study.pattern.factory.AliPay;
import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.UnionPay;
import com.ljw.study.pattern.factory.WechatPay;

/**
 * @author lijunwei
 * @date 2020-02-24 - 18:03
 */
public class AliPayFactory implements IPayFactory {

    @Override
    public IPay create () {
        return new AliPay();
    }
}
