package org.example.temp;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TempString {

    public static void main(String[] args) {
        String str = "xyz";

        String str2 = new String("xyz");


        System.out.println(str == str2); //false

        System.out.println(str.equals(str2));    //true

        //
        char c1 = 'a';
        String s1 = String.valueOf(c1);
        System.out.println(s1);
        char c2 = s1.charAt(0);
        System.out.println(c1== c2);
        System.out.println(new Character(c1) == new Character(c2));
        System.out.println(new Character(c1).equals(new Character(c2)));

        String str3 = "张3";
        byte[] strBytes3 = str3.getBytes(StandardCharsets.UTF_8);
        byte[] strBytes4 = str3.getBytes(StandardCharsets.UTF_16);
        char[] strChars3 = str3.toCharArray();
        System.out.println("bytes of str: " + Arrays.toString(strBytes3));
        System.out.println("bytes of str: " + Arrays.toString(strBytes4));
        System.out.println("chars of str: " + Arrays.toString(strChars3));
    }
}
