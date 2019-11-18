package run.java.com.javarunprogram.java;
//static method and variable always associated with the refernce so calling
//A a=new B();
//a.fun()->will print A metod
/*class A {
    public static void fun() {
        System.out.println("A");
    }

    A() {
        System.out.println("constructer A");
    }
}

class B extends A {
    public static void fun() {
        System.out.println("B");
    }

    B() {
        System.out.println("constructer B");
    }
}*/

class CommonResourse {
    public static String resourse = "Name";
    public static String resourse1 = "Name2";

}

class Thread1 extends Thread {
    public Thread1(String thread1) {
        super(thread1);
    }

    @Override
    public void run() {
        super.run();
        synchronized (CommonResourse.resourse) {
            try {
                Thread.sleep(300);
                System.out.println(getName() + "locked resoucse");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (CommonResourse.resourse1) {
            System.out.println(getName() + "using resoucse 1");
        }
    }
}

class Thread2 extends Thread {
    public Thread2(String thread2) {
        super(thread2);
    }

    @Override
    public void run() {
        super.run();
        synchronized (CommonResourse.resourse1) {
            try {
                Thread.sleep(300);
                System.out.println(getName() + "locked resoucse1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (CommonResourse.resourse) {
            System.out.println(getName() + "using resoucse");
        }
    }
}


public class MyJava {


    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1("Thread1");
        Thread2 thread2 = new Thread2("Thread2");
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
