package run.java.com.javarunprogram.java;

class NonFinal {

   final int nonfinal = 90;
}

public class FinalKaMaza extends NonFinal {

    int nonfinal = 150;
    final int merahaitu;

    /*{
        merahaitu=89;
    }*/

    FinalKaMaza(int terahime) {
        merahaitu = terahime;
    }

    FinalKaMaza() {
        merahaitu = 70;
    }

    public static void main(String[] args) {
        FinalKaMaza nonFinal = new FinalKaMaza();
        System.out.println(nonFinal.nonfinal);

    }


}
