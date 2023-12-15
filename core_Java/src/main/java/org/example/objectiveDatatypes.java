package org.example;

public class objectiveDatatypes {
    static Integer i;
    static Byte b;
    static Long l;
    static Double d;
    static Short s;
    static Character c;
    static Boolean b1;
    static Float f;
    public objectiveDatatypes(Integer i,Byte b,Double d,Short s,Character c,Boolean b1){
        this.i = i;
        this.b = b;
        this.d = d;
        this.s = s;
        this.c = c;
        this.b1 = b1;
    }
    public static void main(String ar[]){
        System.out.println(i);
        System.out.println(b);
        System.out.println(l);
        System.out.println(d);
        System.out.println(s);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(f);
        objectiveDatatypes ob = new objectiveDatatypes(10, (byte) 2,4.5, (short) 786,'J',true);
        System.out.println(ob.i + " " + ob.c + " " + ob.b1);
    }
}
