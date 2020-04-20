package org.learn4j.core.java03;

import java.math.BigInteger;

/**
 * 大整数测试
 */
public class BigIntegerTest {

    public static void main(String[] args) {

        System.out.println(Long.MAX_VALUE); // long最大值：9223372036854775807

        BigInteger b1 = new BigInteger("1234567890");
        BigInteger b2 = b1.pow(5);
        System.out.println(b2);      // 已远远超过long的最大值

        BigInteger b3 = new BigInteger("12");
        BigInteger b4 = new BigInteger("4");

        // BigInteger内置了基本的运算
        System.out.println(b3.add(b4));      // 16
        System.out.println(b3.subtract(b4)); // 8
        System.out.println(b3.multiply(b4)); // 48
        System.out.println(b3.divide(b4));   // 3

        // BigInteger也可以转换为其他基本类型
        System.out.println(b1.intValue());  // 1234567890
        System.out.println(b3.byteValue()); // 12
        System.out.println(new BigInteger("134").byteValue()); // -122， 由于134超出了byte最大值127，会作二机制截取
    }
}
