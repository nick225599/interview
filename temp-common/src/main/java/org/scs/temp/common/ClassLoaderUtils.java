package org.scs.temp.common;

public class ClassLoaderUtils {

    public static <T> String getNameOfClassLoader(Class<T> aClass) {
        ClassLoader classLoader = aClass.getClassLoader();
        if (null == classLoader) {
            return "bootstrap";
        } else {
            return classLoader.getName();
        }
    }
    public static <T> String getNameOfParentClassLoader(Class<T> aClass) {
        ClassLoader classLoader = aClass.getClassLoader();
        if (null == classLoader) {
            return null;
        }
        ClassLoader parentClassLoader = classLoader.getParent();
        if (null == parentClassLoader) {
            return "bootstrap";
        } else {
            return parentClassLoader.getName();
        }
    }
    public static <T> String getNameOfParentParentClassLoader(Class<T> aClass) {
        ClassLoader classLoader = aClass.getClassLoader();
        if (null == classLoader) {
            return null;
        }

        ClassLoader parentClassLoader = classLoader.getParent();
        if (null == parentClassLoader) {
            return null;
        }
        ClassLoader parentParentClassLoader = parentClassLoader.getParent();
        if (null == parentParentClassLoader) {
            return "bootstrap";
        } else {
            return parentParentClassLoader.getName();
        }
    }

}
