package org.example.temp;

import java.util.zip.CheckedOutputStream;

public class Temp1 {

    // 看看基础类型是值传递还是引用传递
    public static void main(String[] args) {
        int i = 3;
        int i2 = Temp1.addOne(i);
        System.out.println("i:" + i);
        System.out.println("i2: " + i2);
        System.out.println("");

        Integer i3 = new Integer(13);
        Integer i4 = Temp1.addOne2(i3);
        System.out.println("i3: " + i3);
        System.out.printf("i4: " + i4);
        System.out.println("");

        Integer i5 = 23;
        IntegerHolder holder5 = new IntegerHolder(i5);
        System.out.println(holder5.getI());
        IntegerHolder holder6 = Temp1.addOne(holder5);
        System.out.println(holder5.getI());
        System.out.println(holder6.getI());

    }

    public static int addOne(int i) {
        i = i + 1;
        return i;
    }

    public static Integer addOne2(Integer i) {
        i = new Integer(i + 1);
        return i;
    }

    public static IntegerHolder addOne(IntegerHolder holder){
        Integer i = holder.getI();
        i = new Integer(i + 1);
        holder.setI(i);
        return holder;
    }


    static class IntegerHolder{
        private Integer i;

        public IntegerHolder(final Integer i) {
            this.i = i;
        }

        public Integer getI() {
            return this.i;
        }

        public void setI(final Integer i) {
            this.i = i;
        }
    }
}
