package org.example.conllections;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void test1() {
        Map map = new MyHashMap();
        map.put("first", 1);
        map.put("second", 2);
        Assert.assertEquals(1, map.get("first"));
        Assert.assertEquals(2, map.get("second"));
        Assert.assertEquals(null, map.get("three"));

        map.put("second", 2.0);
        Assert.assertEquals(2.0, map.get("second"));

        String str1 = "Aa";
        String str2 = "BB";
        map.put(str1, "Aa");
        map.put(str2, "BB");
        Assert.assertEquals(str1.hashCode(), str2.hashCode());
        Assert.assertEquals("Aa", map.get(str1));
        Assert.assertEquals("BB", map.get(str2));
    }
}