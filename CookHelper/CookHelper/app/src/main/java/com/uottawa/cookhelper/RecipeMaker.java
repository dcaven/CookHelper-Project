package com.uottawa.cookhelper;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Odera on 12/3/2016.
 */

public class RecipeMaker extends AppCompatActivity {

    public void makeRecipe() {
        String name = "" ;
        String type = "" ;
        String origin = "" ;
        String category = "";
        LinkedList<Ingredient> list;
        LinkedList<String> steps;

        EditText nameField = (EditText) findViewById(R.id.txtAddRecipe);
        name = nameField.getText().toString();

        steps = new LinkedList<String>();
        LinearLayout layStep = (LinearLayout)findViewById(R.id.stepLayout) ;
        for(int i = 0 ; i < layStep.getChildCount(); i++){
            EditText stepsEdit = (EditText) layStep.getChildAt(i) ;
            String s = stepsEdit.getText().toString() ;
            steps.add(s) ;
        }

//        EditText step1 = (EditText) findViewById(R.id.txtStep1); //Finds the step1 i.e. the top TextEdit
//        String s1 = step1.getText().toString() ;
//        steps.add(s1) ;
//        EditText step2 = (EditText) findViewById(R.id.txtStep2); //Finds the step2 i.e. the top TextEdit
//        String s2 = step2.getText().toString() ;
//        steps.add(s2) ;
//        EditText step3 = (EditText) findViewById(R.id.txtStep3); //Finds the step3 i.e. the top TextEdit
//        EditText step4 = (EditText) findViewById(R.id.txtStep4); //Finds the step4 i.e. the top TextEdit
//        EditText step5 = (EditText) findViewById(R.id.txtStep5); //Finds the step5 i.e. the top TextEdit
//        EditText step6 = (EditText) findViewById(R.id.txtStep6); //Finds the step6 i.e. the top TextEdit
//        EditText step7 = (EditText) findViewById(R.id.txtStep7); //Finds the step7 i.e. the top TextEdit
//        EditText step8 = (EditText) findViewById(R.id.txtStep8); //Finds the step8 i.e. the top TextEdit
//        EditText step9 = (EditText) findViewById(R.id.txtStep9); //Finds the step9 i.e. the top TextEdit
//        EditText step10 = (EditText) findViewById(R.id.txtStep10); //Finds the step10 i.e. the top TextEdit

        //step1 = (EditText) findViewById(R.id.txtStep1);


        LinearLayout lay = (LinearLayout)findViewById(R.id.ingrCheckList) ;
        list = new LinkedList<Ingredient>() ;
        //EditText never returns null
        for(int i = 0; i < lay.getChildCount() ; i++){
            LinearLayout v = (LinearLayout) lay.getChildAt(i) ; //Crazy cast
            String c = "" ;
            String e = "" ;
            String s = "" ;
            float quantity = 0 ;
            for(int j = 0 ; j < v.getChildCount() ; j++){
                View u = v.getChildAt(i) ;
                if(u instanceof CheckBox){
                    if(((CheckBox) u).isChecked()){
                         c = ((CheckBox) u).getText().toString();  //not sure
                    }else{
                        break;
                    }
                }
                if(u instanceof EditText){
                    e = ((EditText) u).getText().toString() ;
                    quantity = Float.valueOf(e) ;
                }
                if(u instanceof Spinner){
                    s = ((Spinner) u).getSelectedItem().toString() ;  //If it does not work then try the ClassChoiceSpinner shit
                    Ingredient ing = new Ingredient(c,quantity,s) ;
                    list.add(ing) ;
                }
            }
        }
        Spinner spanCat = (Spinner)findViewById(R.id.dropCategory);
        category = spanCat.getSelectedItem().toString() ;

        Spinner spanType = (Spinner)findViewById(R.id.dropType);
        type = spanType.getSelectedItem().toString() ;
    }

    //Do for origin and category and type

}
