package com.example.rahul.deltatask1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int red = 0;
    int blue = 0;
    int green = 0;

    public void onclickred(View v) {

        red=red+5;
        TextView tr = (TextView) findViewById(R.id.textViewr);
        tr.setText(Integer.toString(red));
        RelativeLayout layoutmain = (RelativeLayout) findViewById(R.id.activity_main);
        layoutmain.setBackgroundColor(Color.argb(255,red,green,blue));
    }
    public void onclickgreen(View v) {

        green=green+5;
        RelativeLayout layoutmain = (RelativeLayout) findViewById(R.id.activity_main);
        TextView tg = (TextView) findViewById(R.id.textViewg);
        tg.setText(Integer.toString(green));
        layoutmain.setBackgroundColor(Color.argb(255,red,green,blue));
    }
    public void onclickblue(View v) {

        blue=blue+5;
        RelativeLayout layoutmain = (RelativeLayout) findViewById(R.id.activity_main);
        TextView tb = (TextView) findViewById(R.id.textViewb);
        tb.setText(Integer.toString(blue));
        layoutmain.setBackgroundColor(Color.argb(255,red,green,blue));
    }
}
