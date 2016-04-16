package com.example.rotem.flaminghotgame;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

/**
 * Created by Rotem on 16/04/2016.
 */
public class WinningView extends View {

    public WinningView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public WinningView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public WinningView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    /**
     * Initialize all the variables
     */
    private void init(Context context, AttributeSet attrs, int defStyle)
    {

    }

}