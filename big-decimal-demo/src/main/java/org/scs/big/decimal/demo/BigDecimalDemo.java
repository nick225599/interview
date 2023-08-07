package org.scs.big.decimal.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");

        // java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
//        System.out.println(bd1.divide(bd2));

        // 1.1
        System.out.println(bd1.divide(bd2,  RoundingMode.HALF_UP));

        // 1.11111
        System.out.println(bd1.divide(bd2, 5, RoundingMode.HALF_UP));

        // compareTo: true, equals: false
        BigDecimal bd3 = new BigDecimal("1.000");
        System.out.println(bd1.compareTo(bd3) == 0);
        System.out.println(bd1.equals(bd3));
    }
}
