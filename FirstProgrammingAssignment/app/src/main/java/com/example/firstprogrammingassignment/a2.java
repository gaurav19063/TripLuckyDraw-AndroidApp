package com.example.firstprogrammingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class a2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
        Intent intent=getIntent();
        String message=intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView=findViewById(R.id.textView4);
        textView.setText(message);

    }
    public void namepass2(View view)
    {
        TextView etext=findViewById(R.id.textView4);
        String message1=etext.getText().toString();
        Intent intent1=new Intent(this,a3.class);
        intent1.putExtra("EXTRA_MESSAGE1",message1);
        startActivity(intent1);
    }

}
