package org.learn4j.core.java02;

import java.io.IOException;
import java.util.Scanner;

/**
 * 输入输出测试
 */
public class InputAndOutputTest {
    
    public static void main(String[] args) throws IOException {
        
        // 标准输入
        /*System.out.println("Please input：");
        int ascii = System.in.read();
        System.out.println("The ascii code value is " + ascii);*/
        
        // 使用Scanner对象读取标准输入
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        // 读取一行字符串
        String name = in.nextLine();
        System.out.println("My name is " + name);
        System.out.println("How old are you?");
        // 读取一个整数
        int age = in.nextInt();
        System.out.println("I'm  " + age + " years old.");
        
        // 标准输出
        System.out.print("A,");
        System.out.print("B,");
        System.out.println();
        System.out.println("END");
        
        // 格式化输出
        double d = 3.1415926;
        // 保留两位小数3.14
        System.out.printf("%.2f\n", d);
        // 保留4位小数3.1416
        System.out.printf("%.4f\n", d);
    
        int n = 12345000;
        // 输出十进制和十六进制
        System.out.printf("n=%d, hex=%08x\n", n, n);
        System.out.printf("bool = %b", n);
    }
}
