package org.example;

public class multiGenerics<W,X,Y> {
    public W employee;
    public X dep;
    public Y salary;

    public W getEmployee(){
        return employee;
    }

    public static void main(String ar[]){
        multiGenerics<String,String,Integer> m = new multiGenerics<String,String,Integer>();
        m.employee="jennifer";
        m.dep="cse";
        m.salary=1000;
        System.out.println(m.dep);
        System.out.println(m.employee);
        System.out.println(m.salary);
        System.out.println(m.getEmployee());
    }

}
