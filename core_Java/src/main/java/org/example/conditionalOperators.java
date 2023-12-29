package org.example;

public class conditionalOperators {
   public static void main(String ar[]){
       // terninary operator
       String university = "svecw uni";
       String sc = (university.equalsIgnoreCase("svecw UNI")) ? "condition is true" :
               "conditon is false";
       System.out.println(sc);

       // arthemetic opeartors
       int a = 5;
       int b = 2;
       int c = 4;
       System.out.println(a + b);
       System.out.println(a - b);
       System.out.println(a * b);
       System.out.println(a / b);
       System.out.println(a % b);

       // concatination

       String name = "jennifer";
       String name1 = "is";
       int height = 160;
       String measure = "cm";
       boolean b1 = true;
       double weight = 45.5;
       String s = "kg";
       System.out.println(name + " " + name1+ " " + height+""+measure + " " + b1 + " " + weight+""+s);

       // logical operators
       int x = 5;
       int y = 10;

       //logical AND
       if(x>5 && y==10){
           System.out.println("true");
       }else{
           System.out.println("false");
       }


       if(x<7 && y==10){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
       // logical OR

       if(x>5 || y==10){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

       // bitwise AND
       if(x>5 & y==10){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

       if(x<7 && y==10){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

       //bitwise OR
       if(x>5 | y==10){
           System.out.println("true");
       }else{
           System.out.println("false");
       }

       int z = x & y;                             // 5 - 0101
       System.out.println(z);                     //10 - 1010
                                                    // ------- AND
                                                  //     0000
       int z1 = x | y;
       System.out.println(z1);                    //     1111 OR  


   }
}
