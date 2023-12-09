package org.example;

public class biryaniOrder {
    public int orderid;
    public String ordername;
    public String ordertype;
    public String orderplace;
    public String ingredients;
    public int ordercount;
    public biryaniOrder(int orderid,String ordername,String ordertype,String orderplace,String ingredients){
        this.orderid=orderid;
        this.ordername=ordername;
        this.ordertype=ordertype;
        this.orderplace=orderplace;
        this.ingredients=ingredients;
        ordercount++;

    }
    public String getIngredients(String ingredients){
        if(ingredients == "masala"){
            return "masala is included";
        }else if(ingredients == "spicies"){
            return "spicies are included";
        }else if( ingredients == "basmathi rice"){
            return "basmathi rice is  included";
        }else if( ingredients == "chicken"){
            return "chicken is included";
        }else{
            return "This is not included";
        }
    }
    public int getOrdercount(){
        return ordercount;
    }
    public String getOrderplace(){
        return orderplace;
    }

    public static void main(String ar[]){
        biryaniOrder bi = new biryaniOrder(1,"chicken","non veg","hyd","masala");
        System.out.println(bi.ingredients);
        System.out.println(bi.getIngredients("masala"));
        System.out.println(bi.orderid);
        System.out.println(bi.getOrdercount());
        System.out.println(bi.getOrderplace());


    }

}
