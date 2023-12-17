package com.example.bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView MyImageView = new ImageView(this);
        MyImageView.setImageResource(R.drawable.android);
        setContentView(MyImageView);
    }
}