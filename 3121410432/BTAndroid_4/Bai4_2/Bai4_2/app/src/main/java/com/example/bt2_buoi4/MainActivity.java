package com.example.bt2_buoi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("(+49)123456789"));
                //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
                //Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
                /*Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:5551234"));
                intent.putExtra("sms_body","Thu bay nay di choi khong");*/
                /*Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://m.youtube.com/"));*/
                /*Intent intent=new Intent();
                intent.setType("image/pictures/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);*/
                /*String url = "http://maps.google.com/maps?"+
                        "saddr=9.938083,-84.054430&daddr=9.926392,-84.055964";
                Intent intent = new Intent (Intent. ACTION_VIEW, Uri. parse (url)) ;*/
                startActivity(intent);

            }
        });
    }
}