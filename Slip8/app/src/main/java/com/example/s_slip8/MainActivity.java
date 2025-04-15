package com.example.s_slip8;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n;
    Button Cal;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n = findViewById(R.id.Fact);
        Cal = findViewById(R.id.cal);
        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {fact();}
        });

    }
    public void fact()
    {
        int num = Integer.parseInt(n.getText().toString());
        long f=1;
        int i;
        for (i = num; i > 0; i--) {
            f = f * i;
        }
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Factorial number")
                .setMessage("Factorial is"+f)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .show();
    }
}