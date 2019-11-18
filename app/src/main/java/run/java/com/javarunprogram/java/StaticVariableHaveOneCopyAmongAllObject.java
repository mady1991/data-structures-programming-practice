package run.java.com.javarunprogram.java;

public class StaticVariableHaveOneCopyAmongAllObject {
    public static int anInt = 10;


    static {
        System.out.println("it will print only once and while no matter how many objects you creating");
    }

    public static void main(String[] args) {
        StaticVariableHaveOneCopyAmongAllObject st1 = new StaticVariableHaveOneCopyAmongAllObject();
        st1.anInt = anInt + 12;
        StaticVariableHaveOneCopyAmongAllObject st2 = new StaticVariableHaveOneCopyAmongAllObject();
        System.out.println(st2.anInt);
    }

}
