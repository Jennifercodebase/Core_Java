package org.example;

public class stringClass {
    /*
     * assigning string values
     */
    static String str1 = "jennifer";
    static String str2 = " ratna sree";
    static String str3 = new String("java");
    /**
     * creating a constructor
     */
    stringClass(String str1,String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    /**
     * main method
     * @param ar
     */

    public static void main(String ar[]){
        //str1 = str2;
        if(str1 == str2){
            System.out.println(str1);
        } else {
            System.out.println(str1 + str2);

        }
        if(str1 != str2){
            System.out.println(str3);
        }
        System.out.println(str3);
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str1.hashCode());
        stringClass sc = new stringClass("jvm","jdk");
        System.out.println(sc.str1 + " " + sc.str2);
    }
}
