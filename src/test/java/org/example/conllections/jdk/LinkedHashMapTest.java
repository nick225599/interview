package org.example.conllections.jdk;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

    @Test
    public void test() {
        HashMap<String, String> map1 = new HashMap<>(4);
        this.assembleMap(map1);
        this.printMap(map1);

        System.out.println();

        LinkedHashMap<String, String> map2 = new LinkedHashMap<>(4);
        this.assembleMap(map2);
        this.printMap(map2);
    }

    private void assembleMap(Map<String, String> map) {
        map.put("A1", "a");
        map.put("B1", "b");
        map.put("C1", "c");
        map.put("D1", "d");
        map.put("E1", "e");
        map.put("A2", "a");
        map.put("B2", "b");
        map.put("C2", "c");
        map.put("D2", "d");
        map.put("E2", "e");
        map.put("A3", "a");
        map.put("B3", "b");
        map.put("C3", "c");
        map.put("D3", "d");
        map.put("E3", "e");
    }

    private void printMap(Map<String, String> map) {
        System.out.println("print map start: " + map.getClass().getName());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("print map over.\r\n");
    }

}
