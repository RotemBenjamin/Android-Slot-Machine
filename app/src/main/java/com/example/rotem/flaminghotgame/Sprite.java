package com.example.rotem.flaminghotgame;

import android.graphics.Bitmap;

/**
 * Created by Rotem on 23/03/2016.
 */
public class Sprite
{
    private int x=0 , y=0 , dx=0 , dy=0 , width=0 , height=0;
    private Bitmap bitmap;

    /**
     * constructor
     */
    public Sprite(int x, int y, int dx, int dy, int width, int height, Bitmap bitmap)
    {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.width = width;
        this.height = height;
        this.bitmap = bitmap;
    }
}
