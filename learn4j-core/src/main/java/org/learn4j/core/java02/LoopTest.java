package org.learn4j.core.java02;

/**
 * 循环语句使用
 */
public class LoopTest {
    
    public static void main(String[] args) {
        
        // while
        int sum = 0;             // 累加的和，初始化为0
        int n = 1;
        while (n <= 100) {       // 循环条件是n <= 100
            sum = sum + n;       // 把n累加到sum中
            n++;                 // n自身加1
        }
        System.out.println(sum); // 5050
        
        // do while
        int sum1 = 0;
        int n1 = 1;
        do {
            sum1 = sum1 + n1;
            n1++;
        } while (n1 <= 100);
        System.out.println(sum1);
        
        // for
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) { // 初始化条件变量；循环条件；更新条件变量
            sum2 = sum2 + i;
        }
        System.out.println(sum2);        // 5050
    
        // 循环遍历数组每个元素，直到最后一个元素结束
        int[] nums = {1, 3, 5, 7, 9};
        for (int num : nums) {
            System.out.println(num);
        }
    
        
        int sum3 = 0;
        for (int i=1; ; i++) {
            sum3 = sum3 + i;
            if (i == 100) {
                // 中断整个循环
                break;
            }
        }
        System.out.println(sum3);
    
        int sum4 = 0;
        for (int i=1; i<=10; i++) {
            if (i % 2 == 0) {
                // continue语句会结束本次循环
                continue;
            }
            sum4 = sum4 + i;
        }
        System.out.println(sum4); // 1 + 3 + 5 + 7 + 9 = 25
    }
}
