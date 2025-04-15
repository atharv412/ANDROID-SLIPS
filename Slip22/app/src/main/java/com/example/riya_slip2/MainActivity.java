package com.example.riya_slip2;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button send_button;

    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_button = findViewById(R.id.send_id);
        send_text = findViewById(R.id.send_text_id);

        send_button.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               String str = send_text.getText().toString();
               Intent intent=new Intent(getApplicationContext(),SendMessage.class);
               intent.putExtra("messge_key",str);
               startActivity(intent);

           }
        });
    }
}