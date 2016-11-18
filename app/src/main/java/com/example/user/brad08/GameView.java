package com.example.user.brad08;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {
    private Resources res;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        res = context.getResources();
        //setBackgroundColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap ball = BitmapFactory.decodeResource(res,R.drawable.brad);
        canvas.drawBitmap(ball,0,0,null);
    }
}
