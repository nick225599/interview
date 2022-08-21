package org.example.temp;

public class TempStaticFinal {
    public final String echo(String str){
        return str;
    }

    static final Integer i = new Integer(1);

    public static void main(String[] args) {
        System.out.println(i);

    }
}
