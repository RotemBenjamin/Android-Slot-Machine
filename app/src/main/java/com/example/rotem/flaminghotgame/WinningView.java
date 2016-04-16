package com.example.rotem.flaminghotgame;

import android.content.Context;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;

/**
 * Created by Rotem on 16/04/2016.
 */
public class WinningView extends View
{
    private int right = 0, top = 0, width = 0, height = 0, lineStroke1 = 0, lineStroke2 = 1,lineStroke3 = 2, stroke1 = 1, stroke2 = 1, stroke3 = 1, STROKE_1 = 6, STROKE_2 = 8, STROKE_3 = 10;

    private Point[] strokePairs;
    private int[] colors;
    private Paint paint;
    private Random rand;

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
        rand = new Random();
        paint = new Paint();

        strokePairs = new Point[MyStatic.BOARD_ROWS];

        strokePairs[0] = new Point(1,11);
        strokePairs[1] = new Point(2,9);
        strokePairs[2] = new Point(3,5);
        strokePairs[3] = new Point(4,3);

        colors = new int[MyStatic.BOARD_ROWS];

        colors[0] = Color.BLACK;
        colors[1] = Color.WHITE;
        colors[2] = Color.YELLOW;
        colors[3] = Color.MAGENTA;
    }

}