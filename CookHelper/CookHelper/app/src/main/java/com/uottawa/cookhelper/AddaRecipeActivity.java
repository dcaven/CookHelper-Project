package com.uottawa.cookhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener ;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager ;
import android.content.Context ;

import static com.uottawa.cookhelper.R.id.btnMyRecipe;


public class AddaRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adda_recipe);

        Button btnAdd = (Button) findViewById(btnMyRecipe);
        TextView recipeLabel = (TextView) findViewById(R.id.txtAddRecipe); //Finds the recipeLabel i.e. the top TextEdit
        recipeLabel.setOnEditorActionListener(recipelabelListener);  // Creates and action listner for the top label
    }

    /*
        This ActionListner for the recipeLabel simply hides the keyboard when the user
        triggers an action event by pressing the "ENTER" or "RETURN" after
        Entering their Recipe title
        IMPLEMENTED : NOV 29th : 12:57 AM t
     */
    TextView.OnEditorActionListener recipelabelListener = new TextView.OnEditorActionListener(){
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


