package org.example;

public class singletonClass {
    private static singletonClass obj;
    String name;
    int num;

    private singletonClass(String name, int num){
        this.name=name;
        this.num=num;
    }

    public static singletonClass getsingletonClass() {
        if(obj == null) {
            return obj = new singletonClass("avengers", 2024);
        }
        return obj;
    }

    public static void main(String ar[]){
        // new objection
        singletonClass obj1 = new singletonClass("java",2003);
        System.out.println(obj1.name.hashCode() + " " + obj1.num);
        System.out.println(singletonClass.getsingletonClass().name.hashCode());

        singletonClass obj = singletonClass.getsingletonClass();
        System.out.println(obj.name.hashCode() + " " + obj.num);

        System.out.println(singletonClass.getsingletonClass().name.hashCode());
        System.out.println(singletonClass.getsingletonClass().num);
    }
}
