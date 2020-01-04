package org.learn4j.core.java02;

/**
 * 整数运算
 */
public class NumOperationTest {
    
    public static void main(String[] args) {
        int a = 100 + 200;      // 加法
        int b = 299 - 11;       // 减法
        int c = 12 * 9;         // 乘法
        int d = 12 / 3;         // 除法
        int e = 12 % 7;         // 求余(取模)
        int f = 28 + 32 / 4;    // 计算优先级遵循四则运算
        int h = (28 + 32) / 4;  // 使用()提升优先级
        
        // 二元运算符
        int x = 4;
        System.out.println(x += 5);     // 等价于x = x + 5
        System.out.println(x -= 5);     // 等价于x = x - 5
        System.out.println(x *= 5);     // 等价于x = x * 5
        System.out.println(x /= 2);     // 等价于x = x / 2
        System.out.println(x %= 3);     // 等价于x = x % 3
        
        // 自增和自减
        int y = 3;
        System.out.println(y++);        // 输出3，++在后面表示先引用y值，再执行加1
        System.out.println(++y);        // 输出5，++在前面表示先执行加1，再引用y值
        System.out.println(y--);        // 输出5，--在后面表示先引用y值，再执行减1
        System.out.println(--y);        // 输出3，--在前面表示先执行减1，再引用y值
        
        x++; // 通常，自增/自减操作会单独一行
        
        // 位运算
        
        System.out.println("与运算：");
        /*
         * 0000 0101
         * 0000 0011
         * ---------
         * 0000 0001 = 1
         */
        System.out.println(5 & 3);
    
        System.out.println("或运算：");
        /*
         * 0000 0101
         * 0000 0011
         * ---------
         * 0000 0111 = 7
         */
        System.out.println(5 | 3);
        
        System.out.println("异或运算：");
        /*
         * 0000 0101
         * 0000 0011
         * ---------
         * 0000 0110 = 6
         */
        System.out.println(5 ^ 3);
        
        System.out.println("非运算：");
        /*
         * 00000000 00000000 00000000 00000010
         * 11111111 11111111 11111111 11111101(取反)
         * 11111111 11111111 11111111 11111101(负数求原码，减1取反)
         * 10000000 00000000 00000000 00000011 = -3
         */
        System.out.println(~2);
    
        System.out.println("移位运算：");
        /*
         * 0000 0011
         * 0000 1100(左移2位) = 12
         */
        System.out.println(3<<2);
        
        /* 正数移位，有可能溢出
         * 00000000 00000000 00000000 00000011
         * 11000000 00000000 00000000 00000000(左移30位，溢出为负数) = -1073741824
         */
        System.out.println(3<<30);
    
        /* 负数移位，符号位不变
         * 10000000 00000000 00000000 00000010(原码)
         * 11111111 11111111 11111111 11111110(补码，取反加1)
         * 11111111 11111111 11111111 11111000(左移两位)
         * 10000000 00000000 00000000 00001000(负数求原码，减1取反) = -8
         */
        System.out.println(-2 << 2);
        
        /* 无符号右移，符号位改变
         * 10000000 00000000 00000000 00000010(原码)
         * 11111111 11111111 11111111 11111110(补码，取反加1)
         * 00111111 11111111 11111111 11111111(无符号右移两位) = 1073741823
         */
        System.out.println(-2 >>> 2);
        
        // 数学函数
        System.out.println(Math.abs(-1));           // 求绝对值
        System.out.println(Math.sqrt(4.0d));        // 求平方根
        System.out.println(Math.pow(2, 3));         // 幂运算
        System.out.println(Math.sin(90));           // 三角函数SIN
        System.out.println(Math.log10(100));        // 对数函数
    }
}
