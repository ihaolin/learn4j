package org.learn4j.core.java03;

/**
 * 学生编号生成器
 */
public class StudentNumbers {

    private static Integer no; // 静态字段

    static {
        // 静态域中，初始化静态字段
        no = 0;
    }

    public static Integer getNo() {
        // 静态方法中访问静态字段
        return ++ no;
    }
}
