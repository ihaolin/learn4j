package org.learn4j.core.java02;

/**
 * 字符串类型
 */
public class StringTest {
    
    public static final String HELLO = "Hello";
    
    public static void main(String[] args) {
    
        String s = "";          // 空字符串，包含0个字符
        String s1 = "A";        // 包含一个字符
        String s2 = "ABC";      // 包含3个字符
        String s3 = "这是ABC";   // 包含6个字符，其中有一个空格
        
        // 获取子串
        String greeting = "hello";
        s = greeting.substring(0, 3); // hel
        System.out.println(s);
        
        // 拼接
        String hello = "Hello";
        String world = "World";
        String message = hello + " " + world; // Hello World
    
        // 可以和其他数据类型进行拼接
        int age = 12;
        String message2 = message + age;      // Hello World 12
        
        // String也提供了join静态方法来拼接字符串
        String message3 = String.join(" ", hello, world); // Hello World
    
        // 空串和null串
        String s5 = null;   // s1是null
        String s6;          // 没有赋初值值，s2也是null
        String s7 = s1;     // s3也是null
        String s8 = "";     // s4指向空字符串，不是null，通常叫empty
        
        // StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // Hello World
        System.out.println(sb);
        
        // StringBuilder
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World"); // Hello World
        System.out.println(sb1);
    }
}
