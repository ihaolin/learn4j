package org.learn4j.core.java03;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 大浮点数测试
 */
public class BigDecimalTest {

    public static void main(String[] args) {

        double d1 = 0.10f;
        double d2 = 0.01f;
        double d3 = d2 * 10;
        System.out.println(d1 == d3); // false，肉眼易认为f1=f3
        System.out.println(d1);       // 0.10000000149011612
        System.out.println(d3);       // 0.09999999776482582

        // BigDecimal比double精度更高
        BigDecimal b1 = new BigDecimal(d3);
        System.out.println(b1);       // 0.0999999977648258209228515625

        // BigDecimal支持多种精度控制，这里保留两位小数(scale=2)]
        System.out.println(b1.setScale(2, RoundingMode.CEILING));   // 0.10 直接进位
        System.out.println(b1.setScale(2, RoundingMode.FLOOR));     // 0.09 直接舍位
        System.out.println(b1.setScale(2, RoundingMode.UP));        // 0.10 向远离零的方向舍入，舍弃非零部分，并将非零舍弃部分相邻的一位数字加一
        System.out.println(b1.setScale(2, RoundingMode.DOWN));      // 0.09 向接近零的方向舍入，舍弃非零部分
        System.out.println(b1.setScale(2, RoundingMode.HALF_UP));   // 0.10 四舍五入
        System.out.println(b1.setScale(2, RoundingMode.HALF_DOWN)); // 0.10 五舍六入

        // BigDecimal也支持基本运算
        BigDecimal b2 = new BigDecimal("0.25");
        BigDecimal b3 = new BigDecimal("0.55");
        System.out.println(b2.multiply(b3).setScale(4, RoundingMode.HALF_UP));  // 0。1375 乘法，保留4位小数，并四舍五入
        System.out.println(b2.multiply(b3).setScale(3, RoundingMode.HALF_UP));  // 0。138 乘法，保留3位小数，并四舍五入
    }
}
