package br.com.livroandroid.cap30.densityindependentpixels;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RectViewFullWidthPixels extends View {

    public RectViewFullWidthPixels(Context context) {
        super(context);
    }

    public RectViewFullWidthPixels(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RectViewFullWidthPixels(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.LTGRAY);
        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);
    }
}
