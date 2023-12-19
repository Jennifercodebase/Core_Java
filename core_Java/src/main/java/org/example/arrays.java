package org.example;

import java.util.Arrays;

public class arrays {
    // 1D array
    static int[] singlearray = {9,2,6,5};
    static int[] array = new int[5];
    // 2D array
    static int[][] mularray = {{1,2,3},{4,5,6}};

    public static void main(String ar[]){
        // for loop
        array[0] = 5;
        array[1] = 4;
        array[2] = 0;
        array[3] = 6;
        System.out.println(array[3]);
        for(int i=0;i<=3;i++)
        {
            System.out.println(array[i]);
        }

        System.out.println("this is a one dimensional array length: " + singlearray.length);
        System.out.println("this is a multidimensional array length: " +  mularray.length);
        //System.out.println(singlearray.clone()); //--
        System.out.println(Arrays.stream(singlearray).max());
        System.out.println(Arrays.stream(singlearray).count());
        System.out.println(Arrays.stream(singlearray).average());
        System.out.println(Arrays.stream(singlearray).min());
        //System.out.println(Arrays.stream(singlearray).sorted()); //--
        System.out.println(Arrays.stream(singlearray).findFirst());
        //System.out.println(Arrays.stream(singlearray).findAny()); //--

        // for each loop
        System.out.println("printing single dimensional array");
        for (int i: singlearray)
        {
            System.out.println(i);
        }

        // for each loop
        System.out.println("printing multidimensional array");
        for( int mul[] : mularray)
        {
            for(int value: mul)
            {
               System.out.println(value);
            }
        }
    }
}
