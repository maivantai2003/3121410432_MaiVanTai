package com.example.bt4_buoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText tvreruslt;
    boolean newInput;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btplus,btsub,btmult,btdivi,btresult,btreset;
    int lastvalue=0;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvreruslt=findViewById(R.id.editText);
        btresult = (Button) findViewById(R.id.buttonResult);
        btdivi = (Button)findViewById(R.id.buttonChia);
        btreset=findViewById(R.id.buttonReset);
        btmult = (Button)findViewById(R.id.buttonNhan);
        btsub = (Button)findViewById(R.id.buttonTru);

        btplus = (Button)findViewById(R.id.buttonCong);

        bt9 = (Button)findViewById(R.id.button9);

        bt8 = (Button)findViewById(R.id.button8);

        bt7 = (Button)findViewById(R.id.button7);

        bt6 = (Button)findViewById(R.id.button6);

        bt5 = (Button)findViewById(R.id.button5);

        bt4 = (Button)findViewById(R.id.button4);

        bt3 = (Button)findViewById(R.id.button3);

        bt2 = (Button)findViewById(R.id.button2);

        bt1 = (Button)findViewById(R.id.button1);
        bt0=(Button)findViewById(R.id.button0);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setvalue(tvreruslt,"9");
            }
        });
        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation="+";
                lastvalue = Integer.parseInt(tvreruslt.getText().toString());
                newInput = true;
            }
        });
        btmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation="*";
                lastvalue = Integer.parseInt(tvreruslt.getText().toString());
                resetvalue();
                newInput = true;
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lastvalue=0;
                resetvalue();
                newInput=false;
            }
        });
        btdivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation="/";
                lastvalue = Integer.parseInt(tvreruslt.getText().toString());
                resetvalue();
                newInput = true;

            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation="-";
                lastvalue = Integer.parseInt(tvreruslt.getText().toString());
                resetvalue();
                newInput = true;
            }
        });
        btresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operation != null) {
                    int currentValue = Integer.parseInt(tvreruslt.getText().toString());
                    int result = process(lastvalue, currentValue);
                    tvreruslt.setText(Integer.toString(result));
                    operation = null;
                    newInput = true;
                }
            }
        });
    }
    public void setvalue(EditText a,String b){
        String last=a.getText().toString();
        if(!last.equals("0")){
            last+=b;
            b=last;
        }
        a.setText(b);
    }
    public void resetvalue(){
        tvreruslt.setText("0");
    }
    public  int process(int a,int b){
        int result=0;
        if(operation.equals("+")){
            result=a+b;
        }
        if(operation.equals("-")){
            result=a-b;
        }
        if(operation.equals("*")){
            result=a*b;
        }
        if(operation.equals("/")){
            result=a/b;
        }
        return result;
    }
}