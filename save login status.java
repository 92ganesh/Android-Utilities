package edu.somaiya.app.test;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkLogin();
    }

    public void logout(View view){
        // save login status to false
        SharedPreferences sp=getSharedPreferences("Login", MODE_PRIVATE);
        SharedPreferences.Editor Ed=sp.edit();
        Ed.putBoolean("isLoggedIn",false);
        Ed.commit();
        checkLogin();
    }

    public void login(View view){
        // save login status to true
        SharedPreferences sp=getSharedPreferences("Login", MODE_PRIVATE);
        SharedPreferences.Editor Ed=sp.edit();
        Ed.putBoolean("isLoggedIn",true);
        Ed.commit();
        checkLogin();
    }

    public void checkLogin(){
        // check if user is logged in
        SharedPreferences sp1=this.getSharedPreferences("Login", MODE_PRIVATE);
        boolean isLoggedIn=sp1.getBoolean("isLoggedIn",false);
        if(isLoggedIn){
            TextView tx = findViewById(R.id.textView);
            tx.setText("logged in");
        }else{
            TextView tx = findViewById(R.id.textView);
            tx.setText("logged out");
        }
    }


}

