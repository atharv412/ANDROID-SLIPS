package com.example.slip9;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
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

        EditText value=findViewById(R.id.value1);
        Button b1=findViewById(R.id.getvalue);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(value.getText().toString());
                int sum=1;
                for (int i = 1; i <=num; i++) {
                    sum*=i;
                }
                final int sendValue=sum;

                AlertDialog.Builder alertBox=new AlertDialog.Builder(MainActivity.this);

                alertBox.setTitle("The factorial of the given value is ");
                alertBox.setMessage(String.valueOf(sum));
                alertBox.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });

                AlertDialog alertDialog= alertBox.create();
                alertDialog.show();
            }
        });
    }
}