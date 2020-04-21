package org.learn4j.core.java03;

/**
 * Hello实现类
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return HELLO;
    }

    // 可以不实现，则使用接口中的默认实现
    @Override
    public String howAreYou() {
        return "I'm ok";
    }
}
