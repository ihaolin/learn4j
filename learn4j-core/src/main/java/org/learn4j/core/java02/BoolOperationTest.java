package org.learn4j.core.java02;

/**
 * 布尔运算
 */
public class BoolOperationTest {
    
    public static void main(String[] args) {
        // 是否大于，true
        boolean isGt = 5 > 3;
        
        int age = 12;
        // 是否等于，false
        boolean isZero = age == 0;
        
        // 非运算，true
        boolean isGtZero = !isZero;
        
        // 是否大于等于，false
        boolean isAdult = age >= 18;
        
        // 是否大于且小于，true
        boolean isTeen = age > 6 && age < 18;
        
        age = 5;
        // 是否小于或大于，true
        boolean isBabyOrAdult = age < 6 || age > 18;
        
        // 短路运算
        // 若左边表达式为true，则不执行右边表达式
        boolean isTeenOrAdult = isTeen || isAdult;
        // 若左边表达式为false，则不执行右边表达式
        boolean isTeenAndAdult = isTeen && isAdult;
    
        /*
         * 三元操作符：
         * 条件 ? 表达式1 : 表达式2
         * 如果条件为true, 执行表达式1；反之，执行表达式2
         */
        age = isTeen ? 12 : 5;
    }
}
