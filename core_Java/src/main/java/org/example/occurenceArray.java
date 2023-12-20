package org.example;

import java.util.Arrays;

public class occurenceArray {
    static int[] array = {1, 2, 2, 2, 4};
    static int j = 2;
    static int occurrence = 0;

    public static void main(String ar[]) {
        for (int i = 0; i < array.length; i++) {
                if (array[i] == j) {
                    //array[i]++;
                    occurrence++;
                    //System.out.println(occurrence[i]);
                }
        }

        System.out.println(occurrence);

    }
}

