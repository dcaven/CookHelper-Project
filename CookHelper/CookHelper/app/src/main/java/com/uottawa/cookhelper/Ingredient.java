package com.uottawa.cookhelper;

/**
 * Created by Odera on 11/29/2016.
 */

public class Ingredient {
    private String name ;
    private float quantity ;
    public enum Units{
        grams, ounce, cup, tsp, tblsp ;
    }
    Units unit ;

    Ingredient(String name, float quantity, String unit){
        this.name = name ;
        this.quantity = quantity ;
        this.unit = Units.valueOf(unit) ;
        System.out.println(name + " Ingredient was made");
    }

}
