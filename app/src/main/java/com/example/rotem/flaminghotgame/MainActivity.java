package com.example.rotem.flaminghotgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private boolean winFiveInARow[] = getResetWinningsArray();
    private boolean winFourInARow[] = getResetWinningsArray();
    private boolean winThreeInARow[]= getResetWinningsArray();

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

    /**
     * returns empty boolean array in size MyStatic.BOARD_ROWS
     * @return
     */
    private boolean[] getResetWinningsArray()
    {
        boolean[] arr = new boolean[MyStatic.BOARD_ROWS];

        for (int i = 0; i < MyStatic.BOARD_ROWS; i++)
            arr[i] = false;

        return arr;
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
