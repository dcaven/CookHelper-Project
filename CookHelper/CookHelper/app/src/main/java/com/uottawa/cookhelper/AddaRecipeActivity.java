package com.uottawa.cookhelper;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener ;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager ;
import android.content.Context ;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.LinkedList;


public class AddaRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adda_recipe);

        Button btnAdd = (Button) findViewById(R.id.btnAddRecipe);
        btnAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Intent addEditIntent = new Intent(context, A)
                makeRecipe();
            }

        });

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

    public void addRecipeClick(View view){
        Button but = (Button) view ;
       makeRecipe() ;
    }

    public void makeRecipe() {
        System.out.println("1") ;
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
            System.out.println(s+i) ;
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


        System.out.println("2") ;
        LinearLayout lay = (LinearLayout)findViewById(R.id.ingrCheckList) ;
        list = new LinkedList<Ingredient>() ;
        System.out.println(2.1);
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
                        System.out.println(c);
                    }else{
                        System.out.println(((CheckBox) u).getText().toString() + " is Empty") ;
                        break;
                    }
                }
                if(u instanceof EditText){
                    e = ((EditText) u).getText().toString() ;
                    if(e.isEmpty()){
                        quantity = 0 ;
                    }else{
                        quantity = Float.valueOf(e) ;
                    }
                    System.out.println(e);
                }
                if(u instanceof Spinner){
                    s = ((Spinner) u).getSelectedItem().toString() ;  //If it does not work then try the ClassChoiceSpinner shit
                    System.out.println(s) ;
                    if (s == "Main Course") {
                        s = "mainDish" ;
                    }
                    Ingredient ing = new Ingredient(c,quantity,s) ;
                    list.add(ing) ;
                }
            }
        }
        System.out.println(3) ;
        Spinner spanCat = (Spinner)findViewById(R.id.dropCategory);
        category = spanCat.getSelectedItem().toString() ;
        System.out.println(4) ;

        Spinner orig = (Spinner)findViewById(R.id.dropType);
        origin = orig.getSelectedItem().toString() ;

        System.out.println(5) ;
        Spinner spanType = (Spinner)findViewById(R.id.ClassChoice);
        type = spanType.getSelectedItem().toString() ;

        System.out.println(6) ;
        Recipe rep = new Recipe(name, type, origin, category,list, steps) ;
        try {
            System.out.println("Sending to JSON") ;
            writeJSON(rep,name);
            System.out.println("JSON worked") ;
        }
        catch (JsonParseException e) { e.printStackTrace();  System.out.println("JSON No Work") ;}
        catch (JsonMappingException e) { e.printStackTrace();System.out.println("JSON No Work") ; }
        catch (IOException e) { e.printStackTrace(); System.out.println("JSON No Work") ;}
        System.out.println("finis") ;

    }
    public void writeJSON(Recipe rep, String name) throws JsonGenerationException, JsonMappingException, IOException{

       // OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput(name + ".json", Context.MODE_PRIVATE));
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(JsonMethod.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.writeValue(new File(name + ".json"), rep);
       // outputStreamWriter.close() ;
    }
    private Recipe readJSON() throws JsonParseException, JsonMappingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        Recipe rep = mapper.readValue(new File("rep.json"), Recipe.class);
        return rep;
    }




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


