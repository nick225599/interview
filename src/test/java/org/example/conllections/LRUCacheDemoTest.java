package org.example.conllections;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.Assert.*;

public class LRUCacheDemoTest {
    @Test
    public void test() {
        LRUCache<String, Integer> nameAndAgeCache = new LRUCacheDemo<>(3);
        int i = 0;
        nameAndAgeCache.put("Tom", 18);
        System.out.println(++i + ", " + nameAndAgeCache);

        nameAndAgeCache.put("Jerry", 16);
        System.out.println(++i + ", " + nameAndAgeCache);

        nameAndAgeCache.put("Jack", 6);
        System.out.println(++i + ", " + nameAndAgeCache);

        nameAndAgeCache.put("K", 2000);
        System.out.println(++i + ", " + nameAndAgeCache);


        System.out.println("age of Jack:" + nameAndAgeCache.get("Jack") );
        System.out.println(++i + ", " + nameAndAgeCache);

        nameAndAgeCache.put("KOF1998", 1998);
        System.out.println(++i + ", " + nameAndAgeCache);
    }

    @Test
    public  void  testHashcodeAndEquals(){
        LRUCacheDemoTest test1 = null;
        MyHashMapTest test2 = null;
        printEquals(test1, test2);

        Lock lock = new ReentrantLock();

    }
    public static void printEquals(Object obj1,Object obj2){
        boolean b1 = (obj1 == obj2);
        System.out.println("obj1 == obj2 : " + b1);
    }

    public static final String print(){
        return "";
    }

}