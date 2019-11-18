package run.java.com.javarunprogram.java.facadeDesignPattern;

public class ShopKeeper {

    void IPhoneSale() {
        Iphone iphone = new Iphone();
        System.out.println(iphone.mobile());
        System.out.println(iphone.price());
    }

    void sumsaungSale() {
        Samsung samsung = new Samsung();
        System.out.println(samsung.mobile());
        System.out.println(samsung.price());
    }

    void BalckBerry() {
        BalckBerry balckBerry = new BalckBerry();
        System.out.println(balckBerry.mobile());
        System.out.println(balckBerry.price());
    }
}
