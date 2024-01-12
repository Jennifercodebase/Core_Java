package org.example;

public class publicAccessSpecifier {
    public int value =10;

    public int getspecifier(){
        return value;
    }
    public static void main(String ar[]){
        publicAccessSpecifier p = new publicAccessSpecifier();
        System.out.println(p.value);
        // public access specifier can be accessible within the same class
        // and outside the class and also diff package
        // and can access in sub class
    }
}
