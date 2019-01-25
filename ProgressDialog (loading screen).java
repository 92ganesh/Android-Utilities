package com.example.exam.test;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void check(View view){
        ProgressDialog dialog=new ProgressDialog(this);
        dialog.setMessage("message");
        dialog.setCancelable(false);
        dialog.setInverseBackgroundForced(false);
        dialog.show();

        dialog.hide();
        //dialog.dismiss();
    }
}
