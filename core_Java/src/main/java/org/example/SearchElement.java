package org.example;

public class SearchElement {
    static int[] num = {1,2,3,4,6,7,8,6};
    static int value = 7;
    public static void main(String ar[]){
        for (int i = 0;i<num.length;i++) {
            if(num[i] == value){
                System.out.println("value found: " + " " + num[i]);
            }
        }
    }
}
