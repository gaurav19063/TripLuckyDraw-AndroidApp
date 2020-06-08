package com.example.firstprogrammingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;
public class a3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
        Intent intent=getIntent();
        String message1=intent.getStringExtra("EXTRA_MESSAGE1");
        TextView textView=findViewById(R.id.textView7);
        textView.setText(message1);
        Toast.makeText(a3.this,
                "Chose only one Trip.", Toast.LENGTH_LONG).show();
    }
    public void trip(View view)
    {
        //EditText etext=findViewById(R.id.checkBox);
        //String message=etext.getText().toString();
        String message="Your Trip to Ladhak has Confirmed!";
        Intent intent=new Intent(this,a4.class);
        intent.putExtra("EXTRA_MESSAGE2",message);
        startActivity(intent);
    }
    public void trip2(View view)
    {
        //EditText etext=findViewById(R.id.checkBox);
        //String message=etext.getText().toString();
        String message="Your Trip to Murthal has Confirmed!";
        Intent intent=new Intent(this,a4.class);
        intent.putExtra("EXTRA_MESSAGE2",message);
        startActivity(intent);
    }
    public void trip3(View view)
    {
        //EditText etext=findViewById(R.id.checkBox);
        //String message=etext.getText().toString();
        String message="Your Trip to Lonavla has Confirmed!";
        Intent intent=new Intent(this,a4.class);
        intent.putExtra("EXTRA_MESSAGE2",message);
        startActivity(intent);
    }

}
