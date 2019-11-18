package run.java.com.javarunprogram.java.facadeDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerUser {

    public static void main(String[] args) throws IOException {
        ShopKeeper shopKeeper = new ShopKeeper();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter input in integer");
        System.out.println("Select 1 for Iphone sale");
        System.out.println("Select 2 for samgsung sale");
        System.out.println("Select 3 for blackberry sale");
        System.out.println("Select 4 for exit");
        int resposne = Integer.parseInt(bufferedReader.readLine());

        switch (resposne) {
            case 1:
                shopKeeper.IPhoneSale();
                break;
            case 2:
                shopKeeper.sumsaungSale();
                break;
            case 3:
                shopKeeper.BalckBerry();
                break;

            case 4:
                System.exit(0);
                break;
        }
    }

}
