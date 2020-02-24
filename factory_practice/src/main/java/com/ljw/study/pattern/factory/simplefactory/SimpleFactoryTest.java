package com.ljw.study.pattern.factory.simplefactory;

import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.UnionPay;

/**
 * @author lijunwei
 * @date 2020-02-24 - 17:58
 */
public class SimpleFactoryTest {

    public static void main (String[] args) {

        // 普通方式，没有用简单工厂方法，客户端的依赖比较多，如果以后加了更多支付方式，这个类会膨胀。
        /*IPay pay = new Alipay();
        pay.pay();

        pay = new WechatPay();
        pay.pay();*/

        // 修改为简单工厂模式
        //IPay pay = PayFactory.create("wechat");
        IPay pay = PayFactory.create(UnionPay.class);
        pay.pay();
    }
}
