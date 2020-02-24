package com.ljw.study.pattern.factory.methodfactory;

import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.simplefactory.PayFactory;

/**
 * @author lijunwei
 * @date 2020-02-24 - 17:58
 */
public class MethodFactoryTest {

    public static void main (String[] args) {
        // 工厂方法模式
        /*IPayFactory factory = new WechatPayFactory();
        IPay pay = factory.create();
        pay.pay();*/

        // 改成单例访问
        IPayFactory factory = UnionPayFactory.getInstance();
        IPay pay = factory.create();
        pay.pay();
    }
}
