package kamorkaprod.test;

import android.content.Context;
import android.graphics.*;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Vadya on 21.07.17.
 */

public class MainVIew extends View {

    public MainVIew(Context context) {
        super(context);
    }

    public MainVIew(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MainVIew(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onDraw(Canvas canvas) {
        Paint p = new Paint();
        p.setStrokeWidth(30);
        p.setTextSize(100);
        p.setColor(Color.BLUE);
        canvas.drawText("Hello KOMORKE!", 100, 100, p);;
    }

}
