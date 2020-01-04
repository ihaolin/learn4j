package org.learn4j.core.java02;

/**
 * Switch使用测试
 */
public class SwitchTest {
    
    public static void main(String[] args) {
    
        int option = 1;
        switch (option) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("未匹配");
                break;
        }
    
        // case穿透，输出2 3 未匹配
        option = 2;
        switch (option) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            default:
                System.out.println("未匹配");
        }
        
        // case合并，输出3
        option = 2;
        switch (option) {
            case 1:
            case 2:
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("未匹配");
        }
        
    }
}
