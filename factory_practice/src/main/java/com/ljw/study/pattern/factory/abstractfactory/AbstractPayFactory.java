package com.ljw.study.pattern.factory.abstractfactory;

import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.IRefund;

/**
 * @author lijunwei
 * @date 2020-02-24 - 22:30
 */
public abstract class AbstractPayFactory{
    /**
     * Spring中常用这种抽象工厂，易于扩展
     */
    public void init(){
        System.out.println("初始化Spring_Bean...context...definetion...");
    }

    protected abstract IPay createPay();

    protected abstract IRefund createRefund();

}
