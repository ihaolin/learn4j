package org.learn4j.core.java03;


public class Employee {

    // 姓名
    private String name;

    // 薪水
    private double salary;

    /**
     *  默认构造函数
     */
    public Employee() {
        // 调用其他构造函数
        this("未知", 0.0d);
    }

    /**
     * 构造函数重载
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
