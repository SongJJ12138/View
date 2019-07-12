package com.example.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class teView extends View {
    public teView(Context context) {
        super(context);
    }

    public teView(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray array=context.getTheme().obtainStyledAttributes(attrs,R.styleable.haha,0,0);
        String text=array.getString(R.styleable.haha_textStr);
        int Color=array.getColor(R.styleable.haha_Mycolor, android.graphics.Color.YELLOW);
        Drawable background=array.getDrawable(R.styleable.haha_myback);
        array.recycle();
    }

    public teView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
