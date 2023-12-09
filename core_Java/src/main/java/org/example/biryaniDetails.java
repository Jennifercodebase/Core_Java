package org.example;

public class biryaniDetails {
    public static void main(String ar[]){
        biryaniOrder biryani = new biryaniOrder(1,"biryani","non veg","hyd","masala");
        //String ingredients = biryani.getIngredients("masala");
        //String ingredients1 = biryani.getIngredients("basmati rice");
        //String ingredients2 = biryani.getIngredients("mutton");
        //System.out.println(ingredients);
        System.out.println(biryani.getIngredients("masala") + " "+ biryani.getIngredients("mutton"));
        System.out.println(biryani.getOrdercount());
        System.out.println(biryani.getOrderplace());
    }
}
