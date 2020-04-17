package org.learn4j.core.java03;

/**
 * 字符串类测试
 */
public class StringTest {

    public static void main(String[] args) {

        String hello = "hello";
        String world = " world";
        StringBuilder hello1 = new StringBuilder("hello");
        StringBuffer hello2 = new StringBuffer("hello");

        // 字符串拼接，输出hello world
        System.out.println(hello + world);
        System.out.println(hello1.append(world));
        System.out.println(hello2.append(world));

        // 字符串截取，输出hello，原字符串不变
        System.out.println(hello.substring(0, 5));
        System.out.println(hello1.substring(0, 5));
        System.out.println(hello2.substring(0, 5));

        // 字符串删除，输出world，原字符串改变
        System.out.println(hello1.delete(0, 6));
        System.out.println(hello2.delete(0, 6));
    }
}
