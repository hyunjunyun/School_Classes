package com.example.user.inputtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.);
    }

    public void onClick(View view){
        Toast.makeText(getApplicationContext(),"Clicked Button",Toast.LENGTH_LONG);
    }
}
