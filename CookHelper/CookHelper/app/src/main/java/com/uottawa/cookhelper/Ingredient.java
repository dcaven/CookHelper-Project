package com.uottawa.cookhelper;

/**
 * Created by Odera on 11/29/2016.
 */

public class Ingredient {
    private String name ;
    private float quantity ;
    private enum Units{
        grams, ounce, cup, teaSpoon, tableSpoon ;
    }
    Units unit ;

    Ingredient(String name, float quantity, Units unit){
        this.name = name ;
        this.quantity = quantity ;
        this.unit = unit ;
    }
}
