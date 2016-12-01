package com.uottawa.cookhelper;

import java.util.LinkedList;

/**
 * Created by Odera on 11/29/2016.
 */

public class Recipe {
    private String name;
    private enum _Class{
        Beef, Chicken, Seafood, Veggie ;
    }
    _Class type ;
    private String origin ;  //I made it String because there are approximately 195 countries in the world
    private enum Category {
        mainDish, starter, dessert, appetizer, drink, sauce ;
    }
    Category cat ;
    private LinkedList<Ingredient> ingredientsList ;
    private LinkedList<String> stepsList ;

    //Constructor
    Recipe(String name, String type, String origin, String cat, LinkedList<Ingredient> list, LinkedList<String> steps){
        this.name = name ;
        this.type = _Class.valueOf(type) ;
        this.origin = origin ;
        this.cat = Category.valueOf(cat) ;
        this.ingredientsList = list ;
        this.stepsList = steps ;
    }

    public String getName(){
        return name ;
    }
    public void addIngredient(Ingredient toAdd){
        ingredientsList.add(toAdd) ;
    }

    public void addStep(String toAdd){
      stepsList.add(toAdd) ;
    }
}
