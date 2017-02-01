package test;

import java.util.Calendar;

/**
 * Created by sbaymanov on 11.10.2016.
 */
public class Test {
    private int a;

    public static void main(String[] args) {
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
        B cb = new B();
        cb.addAll(3);
        System.out.println(cb.getCnt());
    }

    public void go(Long l) {
        System.out.println(l);
    }
}

class A {
    public void add(int i) {
    }

    public void addAll(int t) {
        for (int i = 0; i < t; i++) {
            add(1);
        }
    }
}

class B extends A {
    int cnt = 0;

    @Override
    public void add(int t) {
        cnt = cnt + t;
        super.add(t);
    }

    @Override
    public void addAll(int t) {
        cnt = cnt + t;
        super.addAll(t);
    }

    public int getCnt() {
        return cnt;
    }
}