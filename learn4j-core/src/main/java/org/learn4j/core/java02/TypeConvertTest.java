package org.learn4j.core.java02;

/**
 * 类型转换测试
 */
public class TypeConvertTest {
    
    public static void main(String[] args) {
        double x = 9.997;
        int nx = (int) x;       // 强制类型转换后，小数部分被截掉
        System.out.println(nx); // 9
    }
}
