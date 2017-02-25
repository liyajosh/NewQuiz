package com.example.liya.newquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class finalactivity extends AppCompatActivity {


quespage q= new quespage();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalactivity);
        Intent mIntent = getIntent();
        String intValue = mIntent.getString(quizScore);

        TextView tv = (TextView) findViewById(R.id.textView2);
        Typeface face = Typeface.createFromAsset(getAssets(),
                "fonts/diamonddust.ttf");
        tv.setTypeface(face);

        TextView res = (TextView) findViewById(R.id.textView4);
        res.setText(intValue);

    }
}
