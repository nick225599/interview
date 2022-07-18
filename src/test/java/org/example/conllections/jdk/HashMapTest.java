package org.example.conllections.jdk;

import org.junit.Test;

import java.util.Map;

import static org.example.common.util.MapUtils.getThreshold;

public class HashMapTest {

    @Test
    public void test1() throws NoSuchFieldException, IllegalAccessException {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(1025));
        Map<String, Object> map = new HashMap<>(1025);
        System.out.println(Integer.toBinaryString(getThreshold(map)));
    }


    @Test
    public void test2() {
        int hashCode = 5;
        int size1 = 16;
        int size2 = 16 << 1;
        System.out.println("hashCode: " + hashCode + ", " + Integer.toBinaryString(hashCode));
        System.out.println("size1: " + size1 + ", " + Integer.toBinaryString(size1));
        int index1 = hashCode % size1;
        System.out.println("index1: " + index1 + ", " + Integer.toBinaryString(index1));
        System.out.println();
        System.out.println("size2: " + size2 + ", " + Integer.toBinaryString(size2));
        int index2 = hashCode % size2;
        System.out.println("index2: " + index2 + ", " + Integer.toBinaryString(index2));
        System.out.println();
        int index3 = hashCode & size2;
        System.out.println("index3: " + index3 + ", " + Integer.toBinaryString(index3));
    }


}