package run.java.com.javarunprogram.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerillazationNDeserillazation {

    void serillazation(ArrayList<String> col, String fileName) throws IOException {

        FileOutputStream fis = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fis);
        oos.writeObject(col);
        fis.close();
        oos.close();
    }

    ArrayList<String> deserillaztion(String fileName) throws IOException, Exception {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        return (ArrayList<String>) ois.readObject();

    }


    public static void main(String[] args) throws Exception {
        SerillazationNDeserillazation seril = new SerillazationNDeserillazation();

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Ram");
        arrayList.add("dam");
        arrayList.add("sam");
        arrayList.add("aam");
        arrayList.add("cam");
        arrayList.add("2am");

        seril.serillazation(arrayList, "MyFile");

        arrayList = seril.deserillaztion("MyFile");

        for (String data : arrayList) {
            System.out.println(data + " ");
        }


    }

}
