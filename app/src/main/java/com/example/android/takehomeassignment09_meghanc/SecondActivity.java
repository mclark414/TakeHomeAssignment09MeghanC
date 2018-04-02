package com.example.android.takehomeassignment09_meghanc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;


/**
 * Created by mclark on 4/1/18.
 */

public class SecondActivity extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference animalRef = database.getReference("animal");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Intent intent = getIntent();
        final TextView dateView = (TextView) findViewById(R.id.date);
        dateView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                String today = (cal.getTime()).toString();
                dateView.setText(today);
            }
        });
    }
    public void set(View view){
        Animal temp;
        EditText name_text = (EditText) findViewById(R.id.name_input);
        String name = (name_text.getText()).toString();
        EditText legs_text = (EditText) findViewById(R.id.legs_input);
        String legs_string = (legs_text.getText()).toString();
        int numLegs = Integer.parseInt(legs_string);
        CheckBox fur_input = (CheckBox) findViewById(R.id.fur_input);
        boolean fur;
        if(fur_input.isChecked()){
            fur = true;
        }
        else{
            fur = false;
        }
        temp = new Animal(name, numLegs, fur);
        animalRef.setValue(temp);
    }
    public void add(View view){
        Animal temp;
        EditText name_text = (EditText) findViewById(R.id.name_input);
        String name = (name_text.getText()).toString();
        EditText legs_text = (EditText) findViewById(R.id.legs_input);
        String legs_string = (legs_text.getText()).toString();
        int numLegs = Integer.parseInt(legs_string);
        CheckBox fur_input = (CheckBox) findViewById(R.id.fur_input);
        boolean fur;
        if(fur_input.isChecked()){
            fur = true;
        }
        else{
            fur = false;
        }
        temp = new Animal(name, numLegs, fur);
        animalRef.push().setValue(temp);
    }
}
