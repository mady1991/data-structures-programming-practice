package run.java.com.javarunprogram.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratation {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("chal rha h");
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Narender");
        map.put(1, "Naresh");
        map.put(2, "Sia");
        map.put(3, "toia");
        map.put(4, "JKJ");

//by converting map in set one way to iterate
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry mapenter = (Map.Entry) iterator.next();
            System.out.println("key" + mapenter.getKey() + "value " + mapenter.getValue());

        }


        //another way to iterate
        for (Map.Entry mapentery : map.entrySet()) {
            System.out.println(mapentery.getKey() + " --->" + mapentery.getValue());
        }

        System.out.println(10 + 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 + 20);
        new MapIteratation();
        System.gc();
    }
}
