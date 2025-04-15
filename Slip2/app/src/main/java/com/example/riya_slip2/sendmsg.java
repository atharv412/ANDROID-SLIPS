package com.example.riya_slip2;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class sendmsg extends AppCompatActivity {

    TextView recv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendmsg);
        recv_msg=findViewById(R.id.Message);
        Intent intent=getIntent();
        recv_msg.setText(intent.getStringExtra("message_key"));
    }
}