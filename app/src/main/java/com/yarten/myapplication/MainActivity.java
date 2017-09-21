package com.yarten.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private TextView helloText;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView)findViewById(R.id.textView);
        startButton = (Button)findViewById(R.id.start_button);
        startButton.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if (helloText.getVisibility() == View.VISIBLE) {
                    helloText.setVisibility(View.INVISIBLE);
                }
                else helloText.setVisibility(View.VISIBLE);
            }
        });

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                helloText.setText(String.format("Bar %d", progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                helloText.setText("Bar Touch");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
