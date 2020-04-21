package org.learn4j.core.java03;

/**
 * 加法计算器
 */
@Config(name = "cal", type = 2)
public class AddCalculator {
    
    /**
     * 左边的数
     */
    private int left;
    
    /**
     * 右边的数
     */
    private int right;
    
    /**
     * 结果
     */
    private int result;
    
    /**
     * 构造函数
     */
    public AddCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    /**
     * 加法实现，外部使用者不用关心
     */
    public void add() {
        result = this.left + this.right;
    }
    
    /**
     * 获取加法结果
     */
    public int getResult() {
        return result;
    }
}
