package org.learn4j.core.java03;


/**
 * 性别
 */
public enum Gender {

    MALE(1, "男性"),
    FEMALE(2, "女性");

    private int value;

    private String description;

    Gender(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
