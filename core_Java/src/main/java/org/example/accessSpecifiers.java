package org.example;

public class accessSpecifiers{
    public static void main(String ar[]){

        //public access specifier
        publicAccessSpecifier p = new publicAccessSpecifier();
        System.out.println(p.value);
        System.out.println(p.getspecifier());

        //private access specifier
        //privateAccessSpecifier p1 = new privateAccessSpecifier();
        //System.out.println(p1.)

        //protected access specifier
        protectedAcccessSpecifier p2 = new protectedAcccessSpecifier();
        System.out.println(p2.j);

        //default access specifier
        defaultAccessSpecifier d = new defaultAccessSpecifier();
        System.out.println(d.a);
    }
}


