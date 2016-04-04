package com.example.rotem.flaminghotgame;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Rotem on 04/04/2016.
 */
public class WheelView extends View
{
    public WheelView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public WheelView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public WheelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    /**
     * Initialize all the variables
     */
    private void init(Context context, AttributeSet attrs, int defStyle) {

    }
}
