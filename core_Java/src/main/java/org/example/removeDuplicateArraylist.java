package org.example;

import java.util.ArrayList;
import java.util.function.Predicate;

public class removeDuplicateArraylist {
    public static  void main(String ar[]){
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("jennifer");
        list.add(89.6);
        list.add(1);
        list.removeIf(Predicate.isEqual(1));
            System.out.println(list);

    }
}
