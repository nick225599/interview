package org.scs.unsafe.demo;

import lombok.extern.slf4j.Slf4j;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * TODO scs 20230808 unsafe 等并发的时候再详细研究吧
 */
@Slf4j
public class UnsafeDemo {

    private static void printClassLoaderName() {
        Class<UnsafeDemo> caller = UnsafeDemo.class;
        System.out.println("name of class: " + caller.getName());

        ClassLoader classLoader = caller.getClassLoader();
        System.out.println("name of classloader: " + classLoader.getName());

        ClassLoader parentClassLoader = classLoader.getParent();
        System.out.println("name of parent classloader: " + parentClassLoader.getName());

        // This method will return null in such implementations
        // if this class loader's parent is the bootstrap class loader.
        ClassLoader parentParentClassLoader = parentClassLoader.getParent();
        if (null == parentParentClassLoader) {
            System.out.println("name of parent parent classloader: bootstrap");
        } else {
            System.out.println(parentParentClassLoader.getName());
        }
    }

    private static Unsafe reflectGetUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    public static void main(String[] args) {
        printClassLoaderName();

        Unsafe unsafeInstance = UnsafeDemo.reflectGetUnsafe();
        System.out.println("null != unsafeInstance: " + (null != unsafeInstance));

    }
}
