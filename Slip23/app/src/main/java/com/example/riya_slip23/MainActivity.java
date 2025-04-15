package com.example.riya_slip23;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText text1,text2;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        btn=findViewById(R.id.accept);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(text1.getText().toString());
                int b = Integer.parseInt(text2.getText().toString());

                if((a > 10) || (b > 10)) {
                    text1.getText().clear();
                    text2.getText().clear();
                    Toast.makeText(MainActivity.this,"Both numbers should be less then 10",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"a = "+a+"b = "+b, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}