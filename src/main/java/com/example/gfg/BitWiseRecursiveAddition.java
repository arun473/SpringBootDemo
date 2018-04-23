package com.example.gfg;

// Java program to do recursive addition
// of two integers
import java.io.*;

public class BitWiseRecursiveAddition {

    static int add(int x, int y)
    {
        int keep = (x & y) << 1;
        int res = x^y;

        // If bitwise & is 0, then there
        // is not going to be any carry.
        // Hence result of XOR is addition.
        if (keep == 0)
            return res;

        return add(keep, res);
    }

    // Driver code
    public static void main (String[] args)
    {
        System.out.println(add(15, 38));
    }
}

class BitWiseOperators {

    public static void bitOperations(){
        int a = 60;	/* 60 = 0011 1100 */
        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        c = ~a;           /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        c = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        c = a >> 2;       /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );

        c = a >>> 2;      /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
}
// This code is contributed by Ajit.
