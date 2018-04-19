package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String args[]) {

        String str = "aaaabbbaabbcccccccccdddddddddddeeeeeeeeeeffffffffaaaaaaaaaaaaaa";
        Map<String, String> mp = new HashMap<String, String>();
        String arr[] = str.split("");
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], arr[i]);
        }
        //System.out.println("--->" + mp.keySet());

        String key = "";
        String value = "";
        for (Map.Entry<String, String> entry : mp.entrySet()) {
            key = key+","+entry.getKey();
            value = value+","+entry.getValue();
        }
        System.out.println("keys ->>>>>>>>>>"+key);
        System.out.println("values ->>>>>>>>>>"+key);
    }
}
