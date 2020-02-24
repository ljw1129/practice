package com.ljw.study.pattern.factory.simplefactory;

import com.ljw.study.pattern.factory.AliPay;
import com.ljw.study.pattern.factory.IPay;
import com.ljw.study.pattern.factory.UnionPay;
import com.ljw.study.pattern.factory.WechatPay;

/**
 * @author lijunwei
 * @date 2020-02-24 - 18:03
 */
public class PayFactory {

    /**
     * 根据工厂传入的参数，返回相应的对象
     * @param name 工厂名称
     * @return 对象
     */
    public static IPay create(String name){
        switch (name) {
            case "AliPay":
                return new AliPay();
            case "UnionPay":
                return new UnionPay();
             default:
                 return new WechatPay();
        }
    }

    /**
     * 提供根据类名找到需要实例化对象的方法
     * @param c 需要实例化的类对象
     * @return Ipay对象
     */
   /* public static IPay create (Class c){
        return create(c.getSimpleName());
    }*/


    /**
     * 提供根据clazz找到需要实例化对象的方法,符合开闭原则，新增支付方式不需要修改工厂方法
     * @param clazz 需要实例化的类对象
     * @return Ipay对象
     */
    public static IPay create (Class<? extends IPay> clazz){
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
