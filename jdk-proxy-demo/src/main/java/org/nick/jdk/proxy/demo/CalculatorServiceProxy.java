package org.nick.jdk.proxy.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class CalculatorServiceProxy {

    public static CalculatorService getProxiedInstance(CalculatorService service) {
        ClassLoader classLoader = service.getClass().getClassLoader();
        Class<?>[] interfaces = new Class[]{CalculatorService.class}; // 这儿倒是必须用接口
        InvocationHandler invocationHandler = new PerformanceInvocationHandler(service);
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        CalculatorService proxiedService = (CalculatorService) proxy;
        return proxiedService;
    }

    public static void main(String[] args) {
        CalculatorService service = new CalculatorServiceImpl();
        CalculatorService proxiedService = getProxiedInstance(service);

        Integer result = proxiedService.add(1, 1);
        System.out.println("1 + 1 = " + result);
        System.out.println();

        result = proxiedService.sub(1, 1);
        System.out.println("1 - 1 = " + result);
    }
}
