package com.uottawa.cookhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener ;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager ;
import android.content.Context ;

import java.util.LinkedList;


public class AddaRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adda_recipe);

        Button btnAdd = (Button) findViewById(R.id.btnMyRecipe);
<<<<<<< HEAD
        EditText recipeLabel, step1, step2, step3, step4,step5,step6,step7,step8,step9,step10;
         recipeLabel = (EditText) findViewById(R.id.txtAddRecipe); //Finds the recipeLabel i.e. the top TextEdit
        step1 = (EditText) findViewById(R.id.txtStep1); //Finds the step1 i.e. the top TextEdit
        step2 = (EditText) findViewById(R.id.txtStep2); //Finds the step2 i.e. the top TextEdit
        step3 = (EditText) findViewById(R.id.txtStep3); //Finds the step3 i.e. the top TextEdit
        step4 = (EditText) findViewById(R.id.txtStep4); //Finds the step4 i.e. the top TextEdit
        step5 = (EditText) findViewById(R.id.txtStep5); //Finds the step5 i.e. the top TextEdit
        step6 = (EditText) findViewById(R.id.txtStep6); //Finds the step6 i.e. the top TextEdit
        step7 = (EditText) findViewById(R.id.txtStep7); //Finds the step7 i.e. the top TextEdit
        step8 = (EditText) findViewById(R.id.txtStep8); //Finds the step8 i.e. the top TextEdit
        step9 = (EditText) findViewById(R.id.txtStep9); //Finds the step9 i.e. the top TextEdit
        step10 = (EditText) findViewById(R.id.txtStep10); //Finds the step10 i.e. the top TextEdit
=======

        TextView recipeLabel, step1, step2, step3, step4,step5,step6,step7,step8,step9,step10;
         recipeLabel = (TextView) findViewById(R.id.txtAddRecipe); //Finds the recipeLabel i.e. the top TextEdit
        step1 = (TextView) findViewById(R.id.txtStep1); //Finds the step1 i.e. the top TextEdit
        step2 = (TextView) findViewById(R.id.txtStep2); //Finds the step2 i.e. the top TextEdit
        step3 = (TextView) findViewById(R.id.txtStep3); //Finds the step3 i.e. the top TextEdit
        step4 = (TextView) findViewById(R.id.txtStep4); //Finds the step4 i.e. the top TextEdit
        step5 = (TextView) findViewById(R.id.txtStep5); //Finds the step5 i.e. the top TextEdit
        step6 = (TextView) findViewById(R.id.txtStep6); //Finds the step6 i.e. the top TextEdit
        step7 = (TextView) findViewById(R.id.txtStep7); //Finds the step7 i.e. the top TextEdit
        step8 = (TextView) findViewById(R.id.txtStep8); //Finds the step8 i.e. the top TextEdit
        step9 = (TextView) findViewById(R.id.txtStep9); //Finds the step9 i.e. the top TextEdit
        step10 = (TextView) findViewById(R.id.txtStep10); //Finds the step10 i.e. the top TextEdit
>>>>>>> master


        recipeLabel.setOnEditorActionListener(textEditListener);// Creates and action listner for the top label
        step3.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step1.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step2.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step4.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step5.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step6.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step7.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step8.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step9.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label
        step10.setOnEditorActionListener(textEditListener);// Creates and action listner for the step label

        Spinner meatChoicespinner = (Spinner) findViewById(R.id.MeatChoice) ;

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.class_choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        meatChoicespinner.setAdapter(adapter);


    }

    /*
        This ActionListner for the recipeLabel simply hides the keyboard when the user
        triggers an action event by pressing the "ENTER" or "RETURN" after
        Entering their Recipe title
        IMPLEMENTED : NOV 29th : 12:57 AM t
     */

    TextView.OnEditorActionListener textEditListener = new TextView.OnEditorActionListener(){
        public boolean onEditorAction(TextView recipeLabel, int actionId, KeyEvent event) {
            if (actionId == EditorInfo.IME_NULL
                    && event.getAction() == KeyEvent.ACTION_DOWN) {
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.
                        INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);

            }
            return true;
        }
    } ;

//    EditText.setOnKeyListener(new OnKeyListener() {
//            public boolean onKey(View , int keyCode, KeyEvent keyevent) {
//            //If the keyevent is a key-down event on the "enter" button
//            if ((keyevent.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                //...
//                // Perform your action on key press here
//                // ...
//                return true;
//            }
//            return false;
//        }
//    });

}


