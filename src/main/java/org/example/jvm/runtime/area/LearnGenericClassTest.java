package org.example.jvm.runtime.area;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnGenericClassTest {

    @Test
    public void test() throws FileNotFoundException {
        List<? extends ClassB> classBExtendsList;

//     classBExtendsList = new ArrayList<ClassA>(); // 报错
        classBExtendsList = new ArrayList<ClassB>(); // 同义
        classBExtendsList = new ArrayList<ClassC>(); // 限制更深

//        classBExtendsList.add(new ClassA()); // 无法存
//        classBExtendsList.add(new ClassB()); // 无法存
//        classBExtendsList.add(new ClassC()); // 无法存

        ClassA a1 = classBExtendsList.get(0);
        ClassB b1 = classBExtendsList.get(0);
//        ClassC c1 = classBExtendsList.get(0); // 无法自动转型
        ClassC c1 = (ClassC) classBExtendsList.get(0); // 可强转


        List<? super ClassB> classBSuperList;

        classBSuperList = new ArrayList<ClassA>(); // 限制更深
        classBSuperList = new ArrayList<ClassB>(); // 同义
//        classBSuperList = new ArrayList<ClassC>(); // 报错

//        classBSuperList.add(new ClassA()); // 无法存
        classBSuperList.add(new ClassB()); // 可存
        classBSuperList.add(new ClassC()); // 可存

//        ClassA a2 = classBSuperList.get(0); // 无法取
//        ClassB b2 = classBSuperList.get(0); // 无法取
//        ClassC c2 = classBSuperList.get(0); // 无法取
        ClassA a2 = (ClassA)classBSuperList.get(0); // 无法取
        ClassB b2 = (ClassB)classBSuperList.get(0); // 无法取
        ClassC c2 = (ClassC)classBSuperList.get(0); // 无法取
        Food d2 = (Food)classBSuperList.get(0); // 无法取

    }
}
