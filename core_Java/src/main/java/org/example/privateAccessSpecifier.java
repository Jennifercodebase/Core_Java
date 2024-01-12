package org.example;

public class privateAccessSpecifier {
    private int i = 11;
    public static void main(String ar[]){
        privateAccessSpecifier p1 = new privateAccessSpecifier();
        System.out.println(p1.i);

        // can only be accessible within the same class
        // can not access in subclass
    }


}
