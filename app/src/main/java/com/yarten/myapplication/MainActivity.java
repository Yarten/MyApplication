package com.yarten.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private TextView helloText;

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
    }
}
