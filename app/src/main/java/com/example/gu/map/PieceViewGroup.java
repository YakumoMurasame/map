package com.example.gu.map;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Created by FengHuiHuang on 2018/5/20.
 */
public class PieceViewGroup extends FrameLayout {
    float moveX;
    float moveY;
    float X;
    float Y;

    public PieceViewGroup(Context context) {
        super(context);
    }

    public PieceViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setXY(float X,float Y){
        this.X=X;
        this.Y=Y;
        Log.d("DragViewGrout",""+X+" "+Y);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                moveX = event.getX();
                moveY = event.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float newX=getX() + (event.getX() - moveX);
                float newY=getY() + (event.getY() - moveY);
                if (Math.pow(X-newX,2)+Math.pow(Y-newY,2)<=2500){
                    newX=X;
                    newY=Y;
                }
                setTranslationX(newX);
                setTranslationY(newY);
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_CANCEL:
                break;
        }
        return true;
    }
}
