package com.example.slip15;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1, radioGroup2;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        radioGroup1=findViewById(R.id.radioGroup1);
        radioGroup2=findViewById(R.id.radioGroup2);
        RadioButton Male=findViewById(R.id.radioGroup1_1);
        RadioButton Female=findViewById(R.id.radioGroup1_2);
        RadioButton Yes=findViewById(R.id.radioGroup2_1);
        RadioButton No=findViewById(R.id.radioGroup2_2);
        submitButton =findViewById(R.id.submitButton);
        TextView textView=findViewById(R.id.textview);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                int selectedId2 = radioGroup2.getCheckedRadioButtonId();

                if(selectedId1 != -1 && selectedId2 != -1){
                    String str="Male: "+Male.isChecked()+"\n Female: "+Female.isChecked();
                    str =  str+"\n Yes: "+Yes.isChecked()+"\n No: "+Female.isChecked();
                    textView.setText(str);
                }else{
                    Toast.makeText(MainActivity.this, "Please Select option in both groups", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}