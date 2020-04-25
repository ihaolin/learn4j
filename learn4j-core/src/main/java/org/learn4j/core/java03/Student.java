package org.learn4j.core.java03;

/**
 * 学生类
 */
public class Student {

    private Integer no;

    private String name;

    private Integer age;

    public Student(Integer no, String name, Integer age) {
        this.no = no;
        this.name = name;
        this.age = age;
    }

    public Integer getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void goToSchool() {
        System.out.println("I will go to school.");
    }

    public Boolean goHome() {
        System.out.println("I will go home.");
        return Boolean.TRUE;
    }
}
