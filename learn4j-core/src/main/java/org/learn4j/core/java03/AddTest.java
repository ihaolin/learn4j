package org.learn4j.core.java03;

public class AddTest {
    
    public static void main(String[] args) {
        AddCalculator adder = new AddCalculator(1, 2);
        adder.add();
        System.out.println(adder.getResult());
    }
}
