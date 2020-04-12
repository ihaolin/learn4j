package org.learn4j.core.java02;

/**
 * 条件语句测试
 */
public class IfTest {
    
    public static void main(String[] args) {
        
        int n = 70;
        
        // if
        if (n > 60) {
            // 执行
            System.out.println("及格");
        }
        
        // else
        if (n < 60) {
            // 不执行
            System.out.println("不及格");
        } else {
            // 执行
            System.out.println("及格");
        }
        
        // else if
        if (n == 100) {
            // 不执行
            System.out.println("完美");
        } else if (n >= 90) {
            // 不执行
            System.out.println("优秀");
        } else if (n >= 80) {
            // 不执行
            System.out.println("良好");
        } else if (n >= 70) {
            // 执行
            System.out.println("一般");
        } else if (n >= 60) {
            // 不执行
            System.out.println("及格");
        } else {
            // 不执行
            System.out.println("不及格");
        }
        
        // else if覆盖
        n = 80;
        if (n >= 70) {
            // 不执行
            System.out.println("一般");
        } else if (n >= 80) {
            // 条件覆盖，永远无法执行
            System.out.println("良好");
        }
    }
}
