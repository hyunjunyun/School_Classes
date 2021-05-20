package com.example.user.linearpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button = (Button) findViewById(R.id.ok_action);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("good");
            }
        });
    }


}
