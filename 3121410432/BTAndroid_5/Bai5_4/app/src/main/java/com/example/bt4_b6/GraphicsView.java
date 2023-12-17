package com.example.bt4_b6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.View;

public class GraphicsView extends View{
    Bitmap[] frames=new Bitmap[4];
    int i=0;
    long last_tick=0;
    long period=200;
    Context ctext;
    MediaPlayer mPlayer;
    public GraphicsView(Context context){
        super(context);
        ctext = context;
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
    }

    @Override
    protected  void onDraw(Canvas canvas){
        if(i<4){
            long time=(System.currentTimeMillis()-last_tick);
            if(time>=period){
                last_tick=System.currentTimeMillis();
                canvas.drawBitmap(frames[i],40,40,new Paint());
                i++;
                postInvalidate();

            }else {
                canvas.drawBitmap(frames[i], 40, 40, new Paint());
                postInvalidate();
            }
        }else{
            i=0;
            postInvalidate();
        }

    }
}