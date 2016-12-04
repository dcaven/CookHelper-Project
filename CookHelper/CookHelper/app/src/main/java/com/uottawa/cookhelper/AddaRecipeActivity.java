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

        Spinner classChoiceSpinner = (Spinner) findViewById(R.id.ClassChoice) ;
        Spinner spinIngre1,spinIngre2,spinIngre3,spinIngre4,spinIngre5,spinIngre6,spinIngre7,spinIngre8,spinIngre9 ;
        Spinner spinIngre10,spinIngre11,spinIngre12,spinIngre13;
        spinIngre1 = (Spinner) findViewById(R.id.spinIngre1);
        spinIngre2 = (Spinner) findViewById(R.id.spinIngre2);
        spinIngre3 = (Spinner) findViewById(R.id.spinIngre3);
        spinIngre4 = (Spinner) findViewById(R.id.spinIngre4);
        spinIngre5 = (Spinner) findViewById(R.id.spinIngre5);
        spinIngre6 = (Spinner) findViewById(R.id.spinIngre6);
        spinIngre7 = (Spinner) findViewById(R.id.spinIngre7);
        spinIngre8 = (Spinner) findViewById(R.id.spinIngre8);
        spinIngre9 = (Spinner) findViewById(R.id.spinIngre9);
        spinIngre10 = (Spinner) findViewById(R.id.spinIngre10);
        spinIngre11 = (Spinner) findViewById(R.id.spinIngre11);
        spinIngre12 = (Spinner) findViewById(R.id.spinIngre12);
        spinIngre13= (Spinner) findViewById(R.id.spinIngre13);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.class_choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence> adapterUnits = ArrayAdapter.createFromResource(this,
                R.array.unit_choices, android.R.layout.simple_spinner_item);
        classChoiceSpinner.setAdapter(adapter);
        spinIngre1.setAdapter(adapterUnits);
        spinIngre2.setAdapter(adapterUnits);
        spinIngre3.setAdapter(adapterUnits);
        spinIngre4.setAdapter(adapterUnits);
        spinIngre5.setAdapter(adapterUnits);
        spinIngre6.setAdapter(adapterUnits);
        spinIngre7.setAdapter(adapterUnits);
        spinIngre8.setAdapter(adapterUnits);
        spinIngre9.setAdapter(adapterUnits);
        spinIngre10.setAdapter(adapterUnits);
        spinIngre11.setAdapter(adapterUnits);
        spinIngre12.setAdapter(adapterUnits);
        spinIngre13.setAdapter(adapterUnits);

        Spinner CategorySpinner = (Spinner) findViewById(R.id.dropCategory) ;

        ArrayAdapter<CharSequence> adapterCategory = ArrayAdapter.createFromResource(this, R.array.category_choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CategorySpinner.setAdapter(adapterCategory);

        Spinner TypeSpinner = (Spinner) findViewById(R.id.dropType) ;

        ArrayAdapter<CharSequence> adapterTypeSpinner = ArrayAdapter.createFromResource(this, R.array.type_choices, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        TypeSpinner.setAdapter(adapterTypeSpinner);



    }

    /*
        This ActionListner for the recipeLabel simply hides the keyboard when the user
        triggers an action event by pressing the "ENTER" or "RETURN" after
        Entering their Recipe title
        IMPLEMENTED : NOV 29th : 12:57 AM t
     */

    EditText.OnEditorActionListener textEditListener = new TextView.OnEditorActionListener(){
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


