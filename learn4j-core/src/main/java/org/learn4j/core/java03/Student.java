package org.learn4j.core.java03;

/**
 * 学生类
 */
public class Student {

    private String name;

    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void goToSchool() {
        System.out.println("I will go to school.");
    }

    public Boolean goHome() {
        System.out.println("I will go home.");
        return Boolean.TRUE;
    }
}
