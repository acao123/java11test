package com.rongda.feature;

import java.util.function.Consumer;

/**
 * @class: LocalVariable.class
 * @description: Local-Variable Syntax for Lambda Parameters 类型推断
 * @author: acao
 * @create: 2020-11-19 10:37
 **/
public class LocalVariable {

    public static void main(String[] args) {
        var a = "abcde";

        System.out.println(a);
        System.out.println(a.getClass());


        // 错误的形式: 必须要有类型, 可以加上var
        // Consumer<String> consumer = (@Deprecated t) -> System.out.println(t.toUpperCase());
        //正确的形式:
        Consumer<String> consumer = (@Deprecated var t) -> System.out.println(t.toUpperCase());

        consumer.accept("tomCat汉字");

    }
}
