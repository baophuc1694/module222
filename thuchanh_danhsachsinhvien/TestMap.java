package thuchanh_danhsachsinhvien;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Phuc", 27);
        hashMap.put("Phuong", 25);
        hashMap.put("Bao", 25);
        hashMap.put("Van", 26);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");


        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries is ascending oder of key");
        System.out.println(treeMap);


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Phuc", 27);
        linkedHashMap.put("Phuong", 25);
        linkedHashMap.put("Bao", 25);
        linkedHashMap.put("Van", 26);
        System.out.println("\nThe age for" + "Lewis is" + linkedHashMap.get("Lewis"));
    }
}
