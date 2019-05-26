 package com.example.recipeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attaching the Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

     //Calling the SearchActivity
     public void onAddClick(View view) {
         Intent intent = new Intent(this, AddActivity.class);
         startActivity(intent);
     }

     public void onViewClick(View view) {
         Intent intent = new Intent(this, ListActivity.class);
         startActivity(intent);
     }
}
