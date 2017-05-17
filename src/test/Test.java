package test;

import java.util.Calendar;

/**
 * Created by sbaymanov on 11.10.2016.
 */
public class Test {
    private int a;

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total " + rt.totalMemory() / 1024 / 1024 + "MB");
        System.out.println("Free " + rt.freeMemory() / 1024 / 1024 + "MB");
        System.out.println();
        Calendar Cal = Calendar.getInstance();
        System.out.println(Cal.get(Cal.YEAR));
        int b = 10;
        new Test().go((long) b);
        String reverseString = "";
        String s = "abcd";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString += s.charAt(i);
        }
        System.out.println(reverseString);
        System.out.println(new StringBuilder("abcd").reverse());
        B cb = new B();
        cb.addAll(3);
        System.out.println(cb.getCnt());
        System.out.println();

        A1 a1 = new A1();
        System.out.println();
        A1 a2 = new A2();
        System.out.println();
        A1 a3 = new A3();
        System.out.println();

        String s1 = "Abc";
        String s2 = s1;
        s2.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
    }

    public void go(Long l) {
        System.out.println(l);
    }
}

class A {
    public void add(int i) {
        System.out.println(this + " A.add=" + i);
    }

    public void addAll(int t) {
        System.out.println(this + " A.addAll=" + t);
        //for (int i = 0; i < t; i++) {
        add(1);
        // }
    }
}

class B extends A {
    int cnt = 0;

    @Override
    public void add(int t) {
        System.out.println(this + " B.add=" + t);
        cnt = cnt + t;
        super.add(t);
    }

    @Override
    public void addAll(int t) {
        System.out.println(this + " B.addAll=" + t);
        cnt = cnt + t;
        super.addAll(t);
    }

    public int getCnt() {
        return cnt;
    }
}


class A1 {
    {
        System.out.println("init1 A1");
    }

    {
        System.out.println("init2 A1");
    }

    A1() {
        System.out.println("A1");
    }
}

class A2 extends A1 {
    {
        System.out.println("init A2");
    }

    A2() {
        System.out.println("A2");
    }
}

class A3 extends A2 {
    {
        System.out.println("init A3");
    }

    A3() {
        System.out.println("A3");
    }
}