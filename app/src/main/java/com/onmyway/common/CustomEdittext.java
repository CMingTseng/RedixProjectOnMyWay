package com.onmyway.common;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by thuyetpham94 on 03/10/2016.
 */
public class CustomEdittext extends EditText {
    public CustomEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/tahoma.ttf"));
    }
}
