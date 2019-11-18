package run.java.com.javarunprogram.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
    ArrayList<String> list = new ArrayList<>();

    public void checkListSize() {
        //System.out.println(list.size());
        for (int i = 0; i < 9; i++) {
            list.add("String" + i);
        }

        //  System.out.println(list.size());
    }

    public void removeElementByObject(String element) {
        list.remove(element);
        System.out.println(list);
    }

    public void removeElementByIndex(int element) {
        list.remove(element);
        System.out.println(list);
    }

    public void listIterateforward() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void listIterateBackward() {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public void byIterator() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void byListIterator() {
        ListIterator iterator = list.listIterator();
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    public void sortList() {
        Collections.sort(list);
        System.out.println(list);
    }

    public void sortDescendingList() {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

    public void subList() {
        System.out.println(list.subList(2, 6));
    }

    public void firstIndexOf() {
        System.out.println(list.indexOf("String6"));
    }

    public void lastIndexOf() {
        System.out.println(list.lastIndexOf("String6"));
    }

    public void compareTwoList() {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add("list" + i);
        }
        for (int i = 0; i < 5; i++) {
            list2.add("list" + i);
        }
        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.contains(list2.get(i)) ? "Yes" : "No");
        }

        System.out.println(list3);
    }

    public void SynchronizedList() {
        Collections.synchronizedList(list);
    }

    public void swapListElement() {
        System.out.println(list);
        Collections.swap(list, 2, 7);
        System.out.println(list);
    }

    public void unModifiedCollection() {
        Collections.unmodifiableCollection(list);
    }


    public static void main(String[] args) {
        ArrayListExample example = new ArrayListExample();
        //example.checkListSize();
        System.out.println(example.list);
        //example.removeElementByObject("String9");
        //example.removeElementByIndex(7);
        /*example.listIterateforward();
        System.out.println();
        example.listIterateBackward();*/
        //example.sortDescendingList();
        //example.subList();

        example.swapListElement();
    }
}
