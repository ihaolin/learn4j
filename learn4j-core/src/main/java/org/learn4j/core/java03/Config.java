package org.learn4j.core.java03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={METHOD, TYPE})
public @interface Config {

    /**
     * 配置名称
     */
    String name();

    /**
     * 配置类型，默认为0
     */
    int type() default 0;
}
