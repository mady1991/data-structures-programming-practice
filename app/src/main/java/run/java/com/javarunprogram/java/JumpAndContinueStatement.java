package run.java.com.javarunprogram.java;

public class JumpAndContinueStatement {

    static {
        System.out.println("static");
    }

    JumpAndContinueStatement() {
        System.out.println("constructer");
    }

    int speed;


    public void jumpMethod() {


        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);

        }
        System.out.println(speed);
    }

    {
        speed = 100;
        System.out.println(speed);
    }


    public static void main(String[] args) {
        new JumpAndContinueStatement();
    }
}
