package com.example.firstprogrammingassignment;

//import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.EditText;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
 public void namepass(View view)
 {
   EditText etext=findViewById(R.id.name);
        String message=etext.getText().toString();
     Intent intent=new Intent(this,a2.class);
     intent.putExtra("EXTRA_MESSAGE",message);
     startActivity(intent);
 }

}
