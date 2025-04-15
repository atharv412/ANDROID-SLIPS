package com.example.slip13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText f_name = findViewById(R.id.f_name);
        EditText l_name = findViewById(R.id.l_name);
        EditText address = findViewById(R.id.address);
        EditText ph_no = findViewById(R.id.ph_no);
        EditText email = findViewById(R.id.email);

        Button submit = findViewById(R.id.btn_submit);
        Button clear = findViewById(R.id.btn_clear);

        RadioButton male = findViewById(R.id.M);
        RadioButton female = findViewById(R.id.F);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = f_name.getText().toString();
                String str1 = l_name.getText().toString();
                String str2 = address.getText().toString();
                String str3 = ph_no.getText().toString();
                String str4 = email.getText().toString();

                // Checking if Male or Female radio button is selected
                String gender = "";
                if (male.isChecked()) {
                    gender = "Male";
                } else if (female.isChecked()) {
                    gender = "Female";
                }

                String result = "First Name: " + str + "\nLast Name: " + str1 +
                        "\nAddress: " + str2 + "\nPhone No: " + str3 + "\nEmail: " + str4 +
                        "\nGender: " + gender;

                // Show the information in a toast
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear all fields when the clear button is clicked
                f_name.setText("");
                l_name.setText("");
                address.setText("");
                ph_no.setText("");
                email.setText("");
                male.setChecked(false);
                female.setChecked(false);
            }
        });
    }
}
