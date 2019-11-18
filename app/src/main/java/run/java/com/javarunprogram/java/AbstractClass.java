package run.java.com.javarunprogram.java;

import java.util.StringTokenizer;

interface MyInterface {
    void A();

}

interface MyInterfaceC extends MyInterface {
    void A();
}


abstract class MyClass implements MyInterfaceC {
    MyClass(String a) {
        System.out.println(a);
    }


    abstract void summ();

    void myCaual() {
        System.out.println("hhhhhhh");
    }

}


public class AbstractClass extends MyClass {


    AbstractClass(String a) {
        super(a);
    }

    @Override
    void summ() {
        System.out.println("abstarc");
    }


    public static void main(String[] args) {

        MyInterface aa = new AbstractClass("Hey Bro....");
        ((AbstractClass) aa).myCaual();
        aa.A();
        String s = "sachin thendularkar is give me a bat";
        String s1 = "sachin";
        String s2 = new String(s);

        StringTokenizer stringTokenizer = new StringTokenizer(s);
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }


    }

    @Override
    public void A() {
        System.out.println("This is aaaaa");
    }
}
