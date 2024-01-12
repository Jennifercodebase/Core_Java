package org.example;

public class Generics<T> {
    public T clg;

    public static void main(String ar[]){
        Generics<String> g = new Generics<String>();
        g.clg = "svecw";
        System.out.println(g.clg);
    }
}
