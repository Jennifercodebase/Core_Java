package org.example;

public class primitive_datatypes {
     static byte B = 15;
     static short s = 234;
     static int i = 999;
     static long l = 2356;
     static float f = 4758;
     static double d = 4.5;
     static char c = 'j';
    // casting
    static byte b1 = (byte)s;
    static byte b2 = (byte)i;
    static byte b3 = (byte)l;
    static byte b4 = (byte)f;
    static byte b5 = (byte)d;
    static byte b6 = (byte)c;
    public static void main(String ar[]){
        primitive_datatypes p = new primitive_datatypes();
        System.out.println(p.B);
        System.out.println(p.b1);
        System.out.println(p.s);
        System.out.println(p.b2);
        System.out.println(p.i);
        System.out.println(p.b3);
        System.out.println(p.l);
        System.out.println(p.b4);
        System.out.println(p.f);
        System.out.println(p.b5);
        System.out.println(p.d);
        System.out.println(p.b6);
        System.out.println(p.s);
    }

}
