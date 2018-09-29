package com.example.patrashome.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bs = getIntent().getExtras();
        if(bs==null){
            String message = "did not get the message yet";
            TextView text = (TextView)findViewById(R.id.textView);
            text.setText(message);
        }else{
            String message = bs.getString("justMessage");
            TextView text = (TextView)findViewById(R.id.textView);
            text.setText(message);
        }
    }

    public void onClick(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
