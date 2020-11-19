package com.rongda.feature;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @class: InputStreamTest.class
 * @description: InputStream  增强
 * @author: acao
 * @create: 2020-11-19 19:30
 **/
public class InputStreamTest {

    @Test
    public void test() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        try (var is = classLoader.getResourceAsStream("file"); var os = new FileOutputStream("file2")) {
            is.transferTo(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
