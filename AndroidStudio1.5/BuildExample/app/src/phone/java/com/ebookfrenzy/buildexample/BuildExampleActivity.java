package com.ebookfrenzy.buildexample;

import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;


public class BuildExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_example);
        RelativeLayout myLayout =
                (RelativeLayout) findViewById(R.id.layout);
        myLayout.setBackgroundColor(Color.RED);
    }
}
