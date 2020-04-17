package org.learn4j.core.java03;

/**
 * Integer包装类测试
 */
public class IntegerTest {

    public static void main(String[] args) {

        Integer wrapNum = null;  // 包装类型默认值为null
        int num = 0;             // 基本类型默认值为0

        System.out.println(wrapNum);
        System.out.println(num);

        // 包装类型提供了一些常用的静态方法
        System.out.println(Integer.parseInt("123"));    // 解析字符串为int
        System.out.println(Integer.valueOf("456"));     // 解析字符串为Integer
        System.out.println(Integer.MAX_VALUE);          // 整型最大值常量
        System.out.println(Integer.MIN_VALUE);          // 整型最小值常量

        Integer num1 = 125;
        Integer num2 = 125;
        // Integer内部默认对[-128, 127]以内的数作了缓存
        System.out.println(num1 == num2);    // true

        Integer num3 = 265;
        Integer num4 = 265;
        System.out.println(num3 == num4);   // false

        Integer num5 = 100;     // java支持自动装箱
        int num6 = num3;        // java支持自动拆箱
    }
}
