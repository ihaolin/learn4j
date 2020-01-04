package org.learn4j.core.java02;

/**
 * 浮点数运算
 */
public class FloatOperationTest {
    
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        // 会有误差
        System.out.println(x);
        System.out.println(y);
        System.out.println(x == y); // false
    }
}
