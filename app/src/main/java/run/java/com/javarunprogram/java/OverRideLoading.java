package run.java.com.javarunprogram.java;


public class OverRideLoading {

    void run() {
        System.out.println("we are in Main Class");
    }


}

class BaseClass extends OverRideLoading {


    @Override
    void run() {
        System.out.println("we are in base Class");
    }

    public static void main(String[] args) {
        BaseClass baseClass = new BaseClass();


    }
}
