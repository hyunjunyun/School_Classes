package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView _num1 = (TextView) findViewById(R.id.txt_n1);
    TextView _num2 = (TextView) findViewById(R.id.txt_n1);
    TextView _result = (TextView) findViewById(R.id.Result);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button _btnPlusAction = (Button) findViewById(R.id.plus_action);
        _btnPlusAction.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(_num1.getText().toString()) + Integer.parseInt(_num2.getText().toString());
                _result.setText(result);
            }
        });
    }


}
