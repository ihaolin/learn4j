package org.learn4j.core.java02;

/**
 * 整数类型测试
 */
public class NumTest {
    
    public static void main(String[] args) {
        long a = 100000L; // long型，带L后缀
        int b = 10;       // int型
        short c = 16;     // short类型
        byte d = 123;     // byte类型
        
        int e = 0x001F;   // 十六进制
        int f = 010;      // 八进制
        int g = 0b010;    // 二进制
        int h = 100_0000; // 下划线分割数字
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
