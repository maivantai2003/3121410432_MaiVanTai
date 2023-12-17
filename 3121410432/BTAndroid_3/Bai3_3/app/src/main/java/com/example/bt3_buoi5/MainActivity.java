package com.example.bt3_buoi5;

import static android.graphics.Color.*;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton checkDo,checkXanhLa,checkXanh,checkXam;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkDo=findViewById(R.id.radioButtonDo);
        checkXanhLa=findViewById(R.id.radioButtonXanh);
        checkXanh=findViewById(R.id.radioButtonTim);
        checkXam=findViewById(R.id.radioButtonXam);
        txt=findViewById(R.id.textView2);
        checkDo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkXam.setChecked(false);
                checkXanh.setChecked(false);
                checkXanhLa.setChecked(false);

                txt.setBackgroundColor(RED);
            }
        });
        checkXanhLa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkDo.setChecked(false);
                checkXanh.setChecked(false);
                checkXam.setChecked(false);

                txt.setBackgroundColor(GREEN);
            }
        });
        checkXanh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkDo.setChecked(false);
                checkXam.setChecked(false);
                checkXanhLa.setChecked(false);

                txt.setBackgroundColor(BLUE);
            }
        });
        checkXam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkDo.setChecked(false);
                checkXanh.setChecked(false);
                checkXanhLa.setChecked(false);

                txt.setBackgroundColor(GRAY);
            }
        });
    }
}