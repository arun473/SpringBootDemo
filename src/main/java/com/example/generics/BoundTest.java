package com.example.generics;

import java.util.ArrayList;
import java.util.List;
public class BoundTest <T extends List<String>> {
    T myList;
    void initializeList(T myList) {
        this.myList = myList;
        this.myList.add("java"); // add can be invoked due to the List<String> bound
    }
    public static void main(String[] args) {
        BoundTest<List<String>> bt = new BoundTest<>();
        bt.initializeList(new ArrayList<String>());
    }
}