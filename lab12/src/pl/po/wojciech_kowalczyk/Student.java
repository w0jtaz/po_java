package pl.po.wojciech_kowalczyk;

import java.util.*;

public class Student {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Carl", "db+");
        mapa.put("Joe", "db");
        mapa.put("Susan", "bdb");
        System.out.println(mapa);

        Map<String, String> treeMap = new TreeMap<>(mapa);
        for (String str : treeMap.keySet()) {
            for (String str1 : treeMap.values()) {
                System.out.println(str+" "+str1);
            }
        }

    }
}
