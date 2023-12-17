package com.example.bt2_b2;

import static android.provider.Contacts.SettingsColumns.KEY;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText PhoneNumber;
    Button callButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhoneNumber=findViewById(R.id.phoneNumber);
        callButton=findViewById(R.id.callButton);
        callButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+PhoneNumber.getText()));
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent);
//                Intent callIntent=new Intent();
//                callIntent.setClass(MainActivity.this,CallActivity.class);
//                callIntent.putExtra("PHONE",PhoneNumber.getText().toString());
//                startActivity(callIntent);

            }
        });
    }
}