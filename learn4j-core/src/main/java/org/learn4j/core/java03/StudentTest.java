package org.learn4j.core.java03;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 =
                new Student(StudentNumbers.getNo(), "xiaoming", 12);
        System.out.println(student1.getNo()); // 1
        Student student2 =
                new Student(StudentNumbers.getNo(), "xiaoming", 12);
        System.out.println(student2.getNo()); // 2
    }
}
