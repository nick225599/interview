package org.nick.jdk.proxy.demo;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer add(Integer addend, Integer augend) {
        return addend + augend;
    }

    @Override
    public Integer sub(Integer subtrahend, Integer minuend) {
        return subtrahend - minuend;
    }
}
