package org.nick.jdk.proxy.demo;

public interface CalculatorService {
    /**
     * 整数加法
     *
     * @param addend 加数
     * @param augend 被加数
     * @return 和
     */
    Integer add(Integer addend, Integer augend);

    /**
     * 整数减法
     *
     * @param subtrahend 减数
     * @param minuend    被减数
     * @return 差
     */
    Integer sub(Integer subtrahend, Integer minuend);
}
