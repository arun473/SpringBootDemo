package com.example.batch;

import java.util.ArrayList;

public class BatchArrayListDemo {

    static ArrayList list = new ArrayList();


    public static void main(String args[]){
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);list.add(7);list.add(8);list.add(9);list.add(10);
        list.add(11);list.add(12);list.add(13);list.add(14);list.add(15);list.add(16);list.add(17);list.add(18);list.add(19);list.add(20);
        list.add(21);list.add(22);list.add(23);list.add(24);list.add(25);list.add(26);list.add(27);list.add(28);list.add(29);list.add(30);
        list.add(31);list.add(32);list.add(33);list.add(34);list.add(35);list.add(36);list.add(37);list.add(38);list.add(39);list.add(40);
        list.add(41);list.add(42);list.add(43);list.add(44);list.add(45);list.add(46);list.add(47);list.add(48);list.add(49);list.add(50);
        list.add(51);list.add(52);list.add(53);list.add(54);list.add(55);list.add(56);list.add(57);list.add(58);list.add(59);list.add(60);
        list.add(61);list.add(62);list.add(63);list.add(64);list.add(65);list.add(66);list.add(67);list.add(68);list.add(69);list.add(70);
        list.add(71);list.add(72);list.add(73);list.add(74);list.add(75);list.add(76);list.add(77);list.add(78);list.add(79);list.add(80);
        list.add(81);list.add(82);list.add(83);list.add(84);list.add(85);list.add(86);list.add(87);list.add(88);list.add(89);list.add(90);

        int batchSize = 10;
        int start = 0;
        int end = batchSize;

        int count = list.size() / batchSize;
        int remainder = list.size() % batchSize;
        int counter = 0;
        for(int i = 0 ; i < count ; i ++)
        {
            System.out.println("counter   " + counter);
            for(counter = start ; counter < end ; counter ++)
            {
                //access array as a[counter]
                System.out.println("------->   " + counter);
            }
            start = start + batchSize;
            end = end + batchSize;
        }

        if(remainder != 0)
        {
            end = end - batchSize + remainder;
            for(counter = start ; counter < end ; counter ++)
            {
                //access array as a[counter]
            }
        }
    }
}
