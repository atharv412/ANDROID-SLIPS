package com.example.slip1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private boolean isProgressVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button downloadBtn=findViewById(R.id.button_1);
        ProgressBar loadingPB = findViewById(R.id.progressBar);


        downloadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isProgressVisible) {
                    // Hide progress bar and update button text
                    downloadBtn.setText("Show Progress Bar");
                    loadingPB.setVisibility(View.GONE);
                    isProgressVisible = false;
                } else {
                    // Show progress bar and update button text
                    downloadBtn.setText("Hide Progress Bar");
                    loadingPB.setVisibility(View.VISIBLE);
                    isProgressVisible = true;
                }
            }
        });
    }
}