package run.java.com.javarunprogram.java;

abstract class abstarctClassHaveFinalMethod {

    // it will give complie error
   /*abstract final void thisWontOverride() {
        System.out.println("as i said eariler");
    }*/
    //also  we have final method as well
    final void thisWontOverride() {
        System.out.println("as i said eariler");
    }
}

public class StaticMehodCallByObject extends abstarctClassHaveFinalMethod {

    static void callByOject() {
        System.out.println("oppsite to code ethics but you can call me ");
    }

    public static void main(String[] args) {
        callByOject();
        abstarctClassHaveFinalMethod abstarctClassHaveFinalMethod = new StaticMehodCallByObject();
        abstarctClassHaveFinalMethod.thisWontOverride();
        ((StaticMehodCallByObject) abstarctClassHaveFinalMethod).callByOject();

    }
}
