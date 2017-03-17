package com.yiser.exercise;

import org.junit.Test;

import static com.yiser.exercise.Utils.Utils.lineToCamel;


public class LinetoCamelTest {

    @Test
    public void linetoCameTest() {
        String str = "all_are_men_who_cares";
        System.out.print(lineToCamel(str));
    }

}
