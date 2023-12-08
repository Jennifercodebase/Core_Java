package org.example;

public class accessingDatatypesWithConstructor {
    public static void main(String ar[]){
        datatypesInConstructors da = new datatypesInConstructors((byte) 2,(int)45,(short)58,(long)453,
                (float)65,(double)14.5);
        System.out.println(da.lo + " " + da.by);

    }
}
