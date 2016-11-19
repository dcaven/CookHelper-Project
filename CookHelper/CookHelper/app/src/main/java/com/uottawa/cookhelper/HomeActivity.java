package com.uottawa.cookhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        Button btnMyRecipe= (Button) findViewById(R.id.btnMyRecipe);
        Button btnAddRecipe= (Button) findViewById(R.id.btnAddRecipe);
        Button btnFindRecipe= (Button) findViewById(R.id.btnFindRecipe);

        btnMyRecipe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),RecipeDisplayActivity.class));
            }
        });

        btnAddRecipe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),AddaRecipeActivity.class));
            }
        });

        btnFindRecipe.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),SearchRecipeActivity.class));
            }
        });}


    }


