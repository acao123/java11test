package com.rongda.feature;

import org.junit.jupiter.api.Test;

/**
 * @class: StringTest.class
 * @description:
 * @author: acao
 * @create: 2020-11-19 18:57
 **/
public class StringTest {

    @Test
    public void test1() {

        String str1 = "";
        String str2 = null;
        String str3 = "null";

        System.out.println(str1.isBlank());     //是否是空白 true
       // System.out.println(str2.isBlank());   //NullPointerException
        System.out.println(str3.isBlank());

        //去掉收尾空白
        String strip = "Java11  ".strip();
        System.out.println(strip);
        System.out.println(strip.length());

        String trim = "Java11   ".trim();
        System.out.println(trim);
        System.out.println(trim.length());

        // 去除尾部空格
        System.out.println( " Javastack ".stripTrailing());
        // 去除首部空格
        System.out.println(" Javastack ".stripLeading());
        // 复制字符串
        System.out.println(  "Java".repeat(3));

        System.out.println( "A\nB\nC".lines().count());



    }
}
