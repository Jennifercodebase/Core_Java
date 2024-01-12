package org.example;

public class defaultAccessSpecifier {
     int a = 13;
     public static void main(String ar[]){
         defaultAccessSpecifier d = new defaultAccessSpecifier();
         System.out.println(d.a);

         // can be accesssble outside the class but cannot access in diff package
         //can access in subclass
     }


}
