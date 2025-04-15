package com.example.riya_slip16;

import android.annotation.SuppressLint;
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

    Button submit;

    EditText user, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.user);
        pwd=findViewById(R.id.pwd);
        submit=(Button) findViewById(R.id.S1);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=user.getText().toString().trim();
                String password=pwd.getText().toString().trim();

                String S1="abc@gmail.com";
                String S2="ABC123";
                if(username.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter Username and Password", Toast.LENGTH_SHORT).show();
                }
                else if(username.equals(S1) && (password.equals(S2)))
                {
                    Toast.makeText(MainActivity.this, "Go to next activity", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Wrong Username and Password", Toast.LENGTH_SHORT).show();
            }
        });
    }
}