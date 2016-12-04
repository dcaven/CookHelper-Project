package com.uottawa.cookhelper;

import android.app.Activity;
import android.widget.AdapterView;
import android.view.View ;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by joseph-lef on 2016-12-03.
 */

public class ClassChoiceSpinner extends Activity implements AdapterView.OnItemSelectedListener {



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
