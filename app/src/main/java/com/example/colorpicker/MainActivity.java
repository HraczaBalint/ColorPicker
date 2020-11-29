package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewSzin;
    private TextView textViewPiros;
    private TextView textViewZold;
    private TextView textViewKek;

    private SeekBar seekBarPiros;
    private SeekBar seekBarZold;
    private SeekBar seekBarKek;

    private void init()
    {
        textViewSzin = findViewById(R.id.textViewSzin);
        textViewPiros = findViewById(R.id.textViewPiros);
        textViewZold = findViewById(R.id.textViewZold);
        textViewKek = findViewById(R.id.textViewKek);

        seekBarPiros = findViewById(R.id.seekBarPiros);
        seekBarZold = findViewById(R.id.seekBarZold);
        seekBarKek = findViewById(R.id.seekBarKek);
    }

    public  int redVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        seekBarPiros.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewPiros.setText("Red: " + progress);
                textViewSzin.setText(String.format("(%d,%d,%d)", seekBarPiros.getProgress(), seekBarZold.getProgress(), seekBarKek.getProgress()));
                textViewSzin.setBackgroundColor(Color.rgb(seekBarPiros.getProgress(), seekBarZold.getProgress(), seekBarKek.getProgress()));
                if (seekBarPiros.getProgress() + seekBarZold.getProgress() + seekBarKek.getProgress() >= 383)
                {
                    textViewSzin.setTextColor(Color.BLACK);
                }
                else
                {
                    textViewSzin.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarZold.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewZold.setText("Green: " + progress);
                textViewSzin.setText(String.format("(%d,%d,%d)", seekBarPiros.getProgress(), seekBarZold.getProgress(), seekBarKek.getProgress()));
                textViewSzin.setBackgroundColor(Color.rgb(seekBarPiros.getProgress(), seekBarZold.getProgress(), seekBarKek.getProgress()));
                if (seekBarPiros.getProgress() + seekBarZold.getProgress() + seekBarKek.getProgress() >= 383)
                {
                    textViewSzin.setTextColor(Color.BLACK);
                }
                else
                {
                    textViewSzin.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBarKek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewKek.setText("Blue: " + progress);
                textViewSzin.setText(String.format("(%d,%d,%d)", seekBarPiros.getProgress(), seekBarZold.getProgress(), seekBarKek.getProgress()));
                textViewSzin.setBackgroundColor(Color.rgb(seekBarPiros.getProgress(), seekBarZold.getProgress(), seekBarKek.getProgress()));
                if (seekBarPiros.getProgress() + seekBarZold.getProgress() + seekBarKek.getProgress() >= 383)
                {
                    textViewSzin.setTextColor(Color.BLACK);
                }
                else
                {
                    textViewSzin.setTextColor(Color.WHITE);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }


}