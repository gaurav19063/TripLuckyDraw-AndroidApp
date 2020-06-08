package com.example.firstprogrammingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class a4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE2");
        TextView textView=findViewById(R.id.textView10);
        textView.setText(message);
    }

}
