package com.example.riya_slip7;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    Button btnRed,btnGreen,btnBlue,btnPink,btnOrange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.text1);
        btnRed = (Button) findViewById(R.id.b1);
        btnGreen = (Button) findViewById(R.id.b2);
        btnBlue = (Button) findViewById(R.id.b3);
        btnPink = (Button) findViewById(R.id.b4);
        btnOrange = (Button) findViewById(R.id.b5);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(30F);
                tv.setTextColor(Color.parseColor("red"));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(20F);
                tv.setTextColor(Color.parseColor("#00FF00"));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(30F);
                tv.setTextColor(Color.parseColor("#0000FF"));
            }
        });

        btnPink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                tv.setTextSize(20F);
                tv.setTextColor(Color.parseColor("#FFC0CB"));
            }
        });

        btnOrange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setTextSize(30F);
                tv.setTextColor(Color.parseColor("#FFA500"));
            }
        });
    }
}