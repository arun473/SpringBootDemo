package com.example.arrayoperations;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 50, 20, 20, 30, 30, 40, 50, 50 };
        removeDuplicateElements(arr);

    }
    public static void removeDuplicateElements(int arr[]) {

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 1; k < arr.length - 1; k++) {
                if (arr[i] != arr[k]) {
                    temp[j] = arr[i];
                    j++;
                }
                //temp[j++] = arr[arr.length - 1];
            }
        }

        // Changing original array
        /*
         * for (int i=0; i<j; i++){ arr[i] = temp[i]; }
         */
        for (int i = 0; i < temp.length - 1; i++)
            System.out.print(temp[i] + " ");
    }
}
