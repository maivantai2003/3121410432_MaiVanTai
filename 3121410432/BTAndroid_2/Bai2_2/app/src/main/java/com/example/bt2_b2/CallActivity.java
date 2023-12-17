package com.example.bt2_b2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {
    TextView textView;
    Intent callIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        callIntent = CallActivity.this.getIntent();
        String s = callIntent.getStringExtra("PHONE");
        String[] str = s.split("");
        textView = findViewById(R.id.textView);

        textView.setText(str[0] + "-" + str[1] + "" + str[2] + "" + str[3] + "" + str[4] + "" + str[5] + "" + str[6] + "" + str[7] + "" + str[8] + "-" + str[9]);

    }
}