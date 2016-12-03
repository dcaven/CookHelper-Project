package com.uottawa.cookhelper;

import android.app.Activity;
import android.widget.AdapterView;
import android.view.View ;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by joseph-lef on 2016-12-03.
 */

public class MeatChoiceSpinner extends Activity implements AdapterView.OnItemSelectedListener {

    Spinner meatChoicespinner = (Spinner) findViewById(R.id.MeatChoice) ;

    ArrayAdapter<CharSequence> adap = ArrayAdapter.createFromResource(this,
            R.array.class_choices, android.R.layout.simple_spinner_item);

    // result from spinner choice ;
    static String result ;


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        result = (String) parent.getItemAtPosition(pos) ;

    }
    static String getSpinnerResult(){
        return result ;
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
