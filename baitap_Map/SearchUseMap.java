package baitap_Map;

import java.util.Scanner;
import java.util.TreeMap;

public class SearchUseMap {
    public static void main(String[] args) {
        System.out.println("Input a  string: ");
        String str = new Scanner(System.in).nextLine();
        String[] a = str.toLowerCase().split(" ");
        TreeMap<Character, Integer> t = new TreeMap<>();
        int temp = 1;
        for (int i = 0; i < a.length; i++){
            char c = a[i].charAt(0);
            if (!t.containsKey(c)) {
                t.put(c,temp);
            } else
                t.replace(c, temp+1);
        }
        System.out.println(t);
    }
}
