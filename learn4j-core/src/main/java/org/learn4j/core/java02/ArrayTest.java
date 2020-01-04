package org.learn4j.core.java02;

/**
 * 数组类型
 */
public class ArrayTest {
    
    public static void main(String[] args) {
    
        // 声明一个长度为5的整型数组
        int[] ns = new int[3];
        ns[0] = 11;
        ns[1] = 22;
        ns[2] = 33;

        // 打印数组长度为5
        System.out.println(ns.length);

        // 也可以在声明时，定义数组元素
        ns = new int[] {11, 22, 33};

        // 可以这么简写
        int[] ns1 = {11, 22, 33};
        
        // 通过索引访问数组元素
        System.out.println(ns[0]);
        
        // 修改某个元素的值
        ns[1] = 20;
        
        // 索引超出范围，会抛出异常
        System.out.println(ns[4]);
        
    }
}
