package com.uottawa.cookhelper;

import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
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
        EditText step1 = (EditText) findViewById(R.id.txtStep1); //Finds the step1 i.e. the top TextEdit
        String s1 = step1.getText().toString() ;
        steps.add(s1) ;
        EditText step2 = (EditText) findViewById(R.id.txtStep2); //Finds the step2 i.e. the top TextEdit
        String s2 = step2.getText().toString() ;
        steps.add(s2) ;
        EditText step3 = (EditText) findViewById(R.id.txtStep3); //Finds the step3 i.e. the top TextEdit
        EditText step4 = (EditText) findViewById(R.id.txtStep4); //Finds the step4 i.e. the top TextEdit
        EditText step5 = (EditText) findViewById(R.id.txtStep5); //Finds the step5 i.e. the top TextEdit
        EditText step6 = (EditText) findViewById(R.id.txtStep6); //Finds the step6 i.e. the top TextEdit
        EditText step7 = (EditText) findViewById(R.id.txtStep7); //Finds the step7 i.e. the top TextEdit
        EditText step8 = (EditText) findViewById(R.id.txtStep8); //Finds the step8 i.e. the top TextEdit
        EditText step9 = (EditText) findViewById(R.id.txtStep9); //Finds the step9 i.e. the top TextEdit
        EditText step10 = (EditText) findViewById(R.id.txtStep10); //Finds the step10 i.e. the top TextEdit

        String s ;
        for(int i = 1 ; i <= 10 ; i++) {
            s = "step"+i  ;
           // steps.add()
        }

    }

}
