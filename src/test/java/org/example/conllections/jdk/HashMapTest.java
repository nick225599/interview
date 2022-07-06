package org.example.conllections.jdk;

import org.junit.Test;

import java.util.Map;

import static org.example.common.util.MapUtils.getThreshold;
import static org.junit.Assert.*;

public class HashMapTest {

    @Test
    public void test1() throws NoSuchFieldException, IllegalAccessException {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(1025));
        Map<String, Object> map = new HashMap<>(1025);
        System.out.println(Integer.toBinaryString(getThreshold(map)));
    }



}