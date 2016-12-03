package com.uottawa.cookhelper;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Odera on 12/3/2016.
 */

public class RecipeMaker extends AppCompatActivity {
    String name = "" ;
    String type = "" ;
    String origin = "";
    String cat = "" ;
    LinkedList<Ingredient> list ;
    LinkedList<String> steps ;

    public void makeRecipe(){
        EditText nameField = (EditText)findViewById(R.id.txtAddRecipe) ;
        name = nameField.getText().toString() ;
        steps =  new LinkedList<String>() ;
        for(int i = 0 ; i < 10 ; i++){
            //steps.add
        }

}
