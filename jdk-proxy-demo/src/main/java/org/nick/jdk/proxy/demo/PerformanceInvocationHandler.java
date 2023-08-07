package org.nick.jdk.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 和实际被代理的类没有强绑定的关联关系
public class PerformanceInvocationHandler implements InvocationHandler {

    private final Object target;

    public PerformanceInvocationHandler(Object target) {
        this.target = target;
    }

    //TODO scs 20230807 proxy 实例有啥用？当前场景用不上啊
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        try {
            Object result = method.invoke(target, args);
            return result;
        } catch (Exception e) {
            throw e;
        } finally {
            long endTime = System.currentTimeMillis();
            System.out.println(target.getClass().getName() + "." + method.getName()
                    + " time consumed ms: " + (endTime - startTime));
        }
    }
}
