package org.example;

public class protectedAcccessSpecifier {
    protected int j = 12;
    public static void main(String sr[]){
        protectedAcccessSpecifier p2 = new protectedAcccessSpecifier();
        System.out.println(p2.j);

        //can access in diff class but can not access in diff package
        //can access in subclass
        // can not access in subclass in diff package
    }
}
