package com.example.roughactivitytracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class EnterActivity extends AppCompatActivity {
    //get the spinner from the xml.
    //Spinner dropdown = findViewById(R.id.spinner1);
    //create a list of items for the spinner.
   // String[] items = new String[]{"Academic", "Professional", "Personal"};
    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
    //ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
    //dropdown.SetAdapter(adapter);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
    }
}
