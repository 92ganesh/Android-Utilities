package com.example.patrashome.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent i = new Intent(this,second.class);
        EditText ed = (EditText)findViewById(R.id.textBox1);
        String message = ed.getText().toString();
        i.putExtra("justMessage",message);
        startActivity(i);
    }
}
