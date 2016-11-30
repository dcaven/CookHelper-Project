package com.uottawa.cookhelper;

import java.util.LinkedList;

/**
 * Created by Odera on 11/30/2016.
 */

public class CookBook {
    LinkedList<Recipe> recipeList ;

    void addRecipe(Recipe toAdd){
        recipeList.add(toAdd)  ;
    }


}
