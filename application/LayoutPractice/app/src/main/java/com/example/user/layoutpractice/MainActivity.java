package com.example.user.layoutpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   /* TextView _TxtID = findViewById(R.id.txt_id);
    TextView _TxtPW = findViewById(R.id.txt_pw);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final Button button = findViewById(R.id.confirm_action);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                if (_TxtID.getText().equals("윤현준") && _TxtPW.getText().equals("1234")){
////                    Toast.makeText(, "", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }


}