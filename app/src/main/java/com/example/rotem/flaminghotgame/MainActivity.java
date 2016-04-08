package com.example.rotem.flaminghotgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * private method that reset all the components
     */
    private void resetThings()
    {

    }

    @Override
    protected void onStart() {
        super.onStart();
        resetThings();
    }

    @Override
    protected void onResume() {
        super.onResume();
        resetThings();
    }

    @Override
    protected void onPause() {
        super.onPause();
        resetThings();
    }

    @Override
    protected void onStop() {
        super.onStop();
        resetThings();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        resetThings();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        resetThings();
    }
}
