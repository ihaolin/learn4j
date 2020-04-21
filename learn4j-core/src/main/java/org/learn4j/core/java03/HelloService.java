package org.learn4j.core.java03;

public interface HelloService {

    String HELLO = "hello";

    /**
     * 定义接口
     * @return 返回你好
     */
    String hello();

    /**
     * 你还好吗
     * @return 默认返回true
     */
    default String howAreYou(){
        return "I'm fine.";
    }
}
