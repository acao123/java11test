package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * @class: OptionalTest.class
 * @description: Optional api增强
 * @author: acao
 * @create: 2020-11-19 19:21
 **/
public class OptionalTest {

    @Test
    public void test1() {
        // of方法中如果传入的参数是null, 会抛出空指针异常
        //Optional<String> optional = Optional.of(null);
        // ofNullable可以兼容空指针, 但是实际传入null后要小心
        Optional<Object> optional = Optional.ofNullable(null);
        Object object = optional.orElse("abc");
        System.out.println(object);

        Object object2 = optional.orElseThrow();
        System.out.println(object2);


    }
}
