package com.example.riya_slip10;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView text1;

    TextView text2;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        Intent i=getIntent();
        double p;
        p = i.getDoubleExtra("Result",0.0);
        text1.setText("Power is"+ p);
        double avg=i.getDoubleExtra("Average", 0.0);
        text2.setText("Average is"+avg);
    }
}