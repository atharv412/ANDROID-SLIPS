package com.example.riya_slip10;

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

    EditText text1;

    EditText text2;

    Button submit;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        submit=findViewById(R.id.submit);

       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int n1=Integer.parseInt(text1.getText().toString());
               int n2=Integer.parseInt(text2.getText().toString());
               double p;
               p = Math.pow(n1,n2);
               double avg;
               avg=(n1/n2)/2;
               Intent i=new Intent(getApplicationContext(), MainActivity2.class);
               i.putExtra("Result",p);
               i.putExtra("Average",avg);
               startActivity(i);
           }
       });
    }

}