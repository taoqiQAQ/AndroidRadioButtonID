package com.example.android.androidradiobuttonid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    RadioButton rb1, rb2, rb3;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.TextView01);
        rb1 = (RadioButton) findViewById(R.id.RadioButton01);
        rb2 = (RadioButton) findViewById(R.id.RadioButton02);
        rb3 = (RadioButton) findViewById(R.id.RadioButton03);
        rg = (RadioGroup) findViewById(R.id.RadioGroup01);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == rb1.getId()) {
                    tv.setText("您喜欢的玩家：" + rb1.getText());
                } else if (i == rb2.getId()) {
                    tv.setText("您喜欢的玩家:" + rb2.getText());
                } else if (i == rb3.getId()) {
                    tv.setText("您喜欢的玩家:" + rb3.getText());
                }
            }
        });
    }
}
