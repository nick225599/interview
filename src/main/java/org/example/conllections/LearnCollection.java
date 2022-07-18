//package org.example.conllections;
//
//import org.example.App;
//import org.example.jvm.runtime.area.ClassA;
//import org.example.jvm.runtime.area.ClassB;
//import org.example.jvm.runtime.area.ClassC;
//import org.example.jvm.runtime.area.JavaBeanA;
//import org.example.jvm.runtime.area.JavaBeanB;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Deque;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class LearnCollection {
//
//
//    private static <T> void test() {
//        Collection<T> collection;
//
//        List<T> list;
//        ArrayList<T> arrayList;
//        LinkedList<T> linkedList;
//
//        Set<T> set;
//        HashSet<T> hashSet;
//        LinkedHashSet<T> linkedHashSet;
//        TreeSet<T> treeSet;
//
//        Queue<T> queue;
//
//        Deque<T> deque;
//
//
//    }
//
//    <T extends List<?>> void testExtends(T t) {
//        ClassA classA = new ClassA();
//        ClassB classB = new ClassB();
//        ClassC classC = new ClassC();
//
//        List<? extends ClassB> list1 = new ArrayList<>();
//        list1.add(null);
////        list1.add(classA);
//        classA = list1.get(0);
//
////        list1.add(classB);
//        classB = list1.get(1);
//
//        list1.add(classC);
//        classC = (ClassC) list1.get(2);
//
//
//        List<? super ClassB> list2 = new ArrayList<>();
//        list2.add(null);
//        list2.add(classA);
//        list2.add(classB);
//        list2.add(classC);
//
//    }
//
//    <T extends ClassB> void testE(T t){
//        System.out.println(t.getClass().getName());
//    }
//
//    <T super ClassB> void testS(T t){
//        System.out.println(t.getClass().getName());
//    }
//
//
//
//}
