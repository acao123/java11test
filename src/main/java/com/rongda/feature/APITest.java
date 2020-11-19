package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @class: APITest.class
 * @description: 挨批增强
 * @author: acao
 * @create: 2020-11-19 10:43
 **/
public class APITest {

    @Test
    public void test4() {
      /*  var list = List.of("Java", "Python", "C");
        var copy = List.copyOf(list);
        System.out.println(list == copy); // true*/

        var list = new ArrayList<String>();
        var copy = List.copyOf(list);
        System.out.println(list == copy); // false

    }


    @Test
    public void test3() {
        LocalDate localDate = LocalDate.of(2019, 1, 21);
        // 在添加重复元素时, 不是无法添加, 而是抛出异常
        //Set<Integer> set = Set.of(100, 50, 20, 30, 10, 8, 100, 8);
        Set<Integer> set = Set.of(100, 50, 20, 30, 10, 8);
        System.out.println(set.getClass());

        Stream<Integer> stream = Stream.of(50, 20, 30, 70);
    }

    @Test
    public void test2() {
        List<String> list1 = Arrays.asList("aa", "yyy", "zzz", "123");
        //list1.add("ppp"); // 是一个不可以添加元素的集合

        var aa = List.of("aa", "bb", "cc", "DD");

        System.out.println(aa);
        //aa.add("ee");

        System.out.println(aa);

    }

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bbb");
        list.add("cc");
        list.add("DD");

        System.out.println(list);
    }



}
