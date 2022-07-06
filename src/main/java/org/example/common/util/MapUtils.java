package org.example.common.util;

import java.lang.reflect.Field;
import java.util.Map;

public class MapUtils {
    public static final int getThreshold(Map<?,?> map) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = map.getClass();
        Field threshold = clazz.getDeclaredField("threshold");
        threshold.setAccessible(true);
        return (int)threshold.get(map);
    }
}
