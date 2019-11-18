package run.java.com.javarunprogram.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HowManyWaysWeCanIterateCollection {

    void viaForLoop(ArrayList<String> collection) {
        for (int i = 0; i < collection.size(); i++) {
            System.out.print(collection.get(i) + " ");
        }
    }

    void viaForEachLoop(ArrayList<String> collection) {
        for (String i : collection) {
            System.out.print(i + " ");
        }
    }

    void viaIterattor(ArrayList<String> collection) {

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    void viaListIterattor(ArrayList<String> collection) {

        ListIterator iterator = collection.listIterator(collection.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
    }


    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("Ram");
        collection.add("Ramu");
        collection.add("Sam");
        collection.add("Shaymuam");
        collection.add("Narender");
        collection.add("Ashish");
        collection.add("Mangal");
        collection.add("Ajajay");
        collection.add("Himanshu");

        new HowManyWaysWeCanIterateCollection().viaListIterattor(collection);

    }


}
