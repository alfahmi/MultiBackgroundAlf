package com.multibg;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextView extends TextView {

    public TextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                                               "alfahmi/foughtknight.ttf");
        setTypeface(tf);
    }

}
