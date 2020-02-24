package com.ljw.study.pattern.factory.methodfactory;

import com.ljw.study.pattern.factory.AliPay;
import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.UnionPay;

/**
 * @author lijunwei
 * @date 2020-02-24 - 18:03
 */
public class UnionPayFactory implements IPayFactory {

    private UnionPayFactory (){};

    // 饿汉式单例返回
    public static final UnionPayFactory instance = new UnionPayFactory();

    public static UnionPayFactory getInstance(){
        return instance;
    }

    @Override
    public IPay create () {
        return new UnionPay();
    }
}
