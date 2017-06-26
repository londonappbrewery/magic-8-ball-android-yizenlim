package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton = (Button) findViewById(R.id.button);
        final ImageView eightBall = (ImageView) findViewById(R.id.eightBallimage);
        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                                R.drawable.ball4, R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("ball","asked");
                Random randomNumber = new Random ();
                int number = randomNumber.nextInt(5);
                eightBall.setImageResource(ballArray[number]);

            }
        });

    }
}
