package com.example.bt2_buoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    EditText myText;
    CheckBox checkColor;
    CheckBox checkBold;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkColor = (CheckBox)findViewById(R.id.checkBox1);
        checkBold = (CheckBox)findViewById(R.id.checkBox2);
        myButton = (Button) findViewById (R.id.btnClick);
        myText=(EditText) findViewById(R.id.editText);
        myText.setSingleLine();
        myText. setInputType (InputType.TYPE_NULL);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkColor.isChecked()){
                    myText.setTextColor(Color.BLUE);
                }else{
                    myText.setTextColor(Color.WHITE);
                }
                if(checkBold.isChecked()){
                    myText.setTypeface(Typeface.DEFAULT_BOLD);
                }else{
                    myText.setTypeface(Typeface.DEFAULT);
                }
                myText.setText("You've Click "+ ++count +"times");
            }
        });
    }
}