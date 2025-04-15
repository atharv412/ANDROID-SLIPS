package com.example.slip5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);

        String name=getIntent().getStringExtra("sname");
        String surname=getIntent().getStringExtra("surname");
        String sclass=getIntent().getStringExtra("class");
        String gender=getIntent().getStringExtra("gender");
        String hobbies=getIntent().getStringExtra("hobbies");
        String marks=getIntent().getStringExtra("marks");


        TextView sname=findViewById(R.id.namevalue);
        TextView ssurname=findViewById(R.id.surnamevalue);
        TextView ssclass=findViewById(R.id.sclassvalue);
        TextView sgender=findViewById(R.id.sgendervalue);
        TextView shobbies=findViewById(R.id.hobbiesvalue);
        TextView smarks=findViewById(R.id.marksvalue);

        sname.setText(name);
        ssurname.setText(surname);
        ssclass.setText(sclass);
        sgender.setText(gender);
        shobbies.setText(hobbies);
        smarks.setText(marks);

    }
}
