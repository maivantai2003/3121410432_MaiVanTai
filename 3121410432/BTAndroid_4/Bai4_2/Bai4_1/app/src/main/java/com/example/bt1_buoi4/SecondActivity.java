package com.example.bt1_buoi4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txtEmail,txtName,txtProject;
    Button btnFinish;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txtEmail=findViewById(R.id.txtEmail);
        txtName=findViewById(R.id.txtName);
        txtProject=findViewById(R.id.txtProject);
        btnFinish=findViewById(R.id.btnFinish);
        Bundle  bundel=getIntent().getBundleExtra("bundle");
        String name=bundel.getString("nameKey");
        String email=bundel.getString("emailKey");
        String project=bundel.getString("projectKey");
        txtName.setText(name);
        txtEmail.setText(email);
        txtProject.setText(project);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}