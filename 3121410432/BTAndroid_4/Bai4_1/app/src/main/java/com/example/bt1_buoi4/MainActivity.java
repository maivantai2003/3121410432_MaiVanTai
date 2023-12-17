package com.example.bt1_buoi4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName,editEmail,editProject;
    Button btnView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEmail=findViewById(R.id.editEmail);
        editName=findViewById(R.id.editName);
        editProject=findViewById(R.id.editProject);
        btnView=findViewById(R.id.button);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo=new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("nameKey",editName.getText().toString());
                bundle.putString("emailKey",editEmail.getText().toString());
                bundle.putString("projectKey",editProject.getText().toString());
                iGetContactInfo.putExtra("bundle",bundle);
                startActivity(iGetContactInfo);
            }
        });
    }
}