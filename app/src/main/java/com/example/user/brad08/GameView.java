package com.example.user.brad08;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class GameView extends View {
    private Resources res;
    private Context context;
    private int viewW, viewH;
    private boolean isInit;
    private Bitmap bmpBall;
    private Matrix matrix;
    private float ballW, ballH;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        res = context.getResources();
        matrix = new Matrix();

    }

    private void init(){
        viewW = getWidth(); viewH = getHeight();
        Log.v("brad", viewW + "x" +viewH);

        bmpBall = BitmapFactory.decodeResource(res,R.drawable.brad);
        ballW = viewW / 12f; ballH = ballW;

        matrix.postScale(ballW/bmpBall.getWidth(), ballH/bmpBall.getHeight());
        bmpBall = Bitmap.createBitmap(bmpBall,0,0,bmpBall.getWidth(),bmpBall.getHeight(),matrix,false);



        isInit = true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInit) init();

        canvas.drawBitmap(bmpBall,0,0,null);
    }
}
