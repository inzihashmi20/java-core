package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> studentMap = new HashMap<>();

        studentMap.put(101, "Inzi");
        studentMap.put(102, "Tabish");
        studentMap.put(103, "Sonu");
        studentMap.put(104, "Pitter");

        System.out.println("Student with Roll 101 : " + studentMap.get(101));

        System.out.println("Contains Roll 101 : " + studentMap.containsKey(101));

        studentMap.remove(104);

        System.out.println("Keys : " + studentMap.keySet());

        System.out.println("Values : " + studentMap.values());

        System.out.println();
        System.out.println("All Entries");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number : " + entry.getKey());
            System.out.println("Name        : " + entry.getValue());
            System.out.println("-------------------------");
        }
    }
}
/*
 * HashMap<Integer, String> studentMap = new HashMap<>();
 * 
 * Here is 9 important methods of HashMap:
 * studentMap.put();
 * studentMap.get();
 * studentMap.containsKey();
 * studentMap.remove();
 * 
 * studentMap.keySet();
 * studentMap.values();
 * studentMap.entrySet();
 * 
 * entry.getKey();
 * entry.getValue();
 */