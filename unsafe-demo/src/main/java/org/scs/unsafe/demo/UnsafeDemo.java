package org.scs.unsafe.demo;

import lombok.extern.slf4j.Slf4j;
import org.scs.temp.common.ClassLoaderUtils;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * TODO scs 20230808 unsafe 等并发的时候再详细研究吧
 */
@Slf4j
public class UnsafeDemo {

    private static void printClassLoaderName() {
        Class<ClassLoaderUtils> caller = ClassLoaderUtils.class;
        System.out.println("name of class: " + caller.getName());

        String className = ClassLoaderUtils.getNameOfClassLoader(caller);
        System.out.println("name of classloader: " + className);

        String parentClassName = ClassLoaderUtils.getNameOfParentClassLoader(caller);
        System.out.println("name of parent classloader: " + parentClassName);

        String parentParentClassName = ClassLoaderUtils.getNameOfParentParentClassLoader(caller);
        System.out.println("name of parent parent classloader: " + parentParentClassName);
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

        // -Xbootclasspath/a:/Users/nick/IdeaProjects/temp-repository/unsafe-demo/target/unsafe-demo-1.0-SNAPSHOT-jar-with-dependencies.jar
        Unsafe unsafe = Unsafe.getUnsafe();
        System.out.println("null != unsafe: " + (null != unsafe));
    }
}
