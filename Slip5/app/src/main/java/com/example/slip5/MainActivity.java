package com.example.slip5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        EditText name=findViewById(R.id.sname);
        EditText surname=findViewById(R.id.sSurname);
        EditText sclass=findViewById(R.id.sclass);
        EditText gender=findViewById(R.id.sgender);
        EditText hobbies=findViewById(R.id.shobbies);
        EditText marks=findViewById(R.id.smarks);

        Button b1=findViewById(R.id.sbmt);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),activity2.class);
                i.putExtra("sname",name.getText().toString());
                i.putExtra("surname",surname.getText().toString());
                i.putExtra("class",sclass.getText().toString());
                i.putExtra("gender",gender.getText().toString());
                i.putExtra("hobbies",hobbies.getText().toString());
                i.putExtra("marks",marks.getText().toString());
                startActivity(i);
            }
        });
    }
}