package org.pltw.examples.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {

    private final int WHOLE_NOTE = 1000;
    private static final String TAG = SynthesizerActivity.class.getName();

    private Button button1;
    private Button button2;
    private Button button6;
    private Button button10;



    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpBB;
    private MediaPlayer mpC;
    private MediaPlayer mpD;
    private MediaPlayer mpDs;
    private MediaPlayer mpFs;
    private MediaPlayer mpGs;
    private MediaPlayer mpHighE;
    private MediaPlayer mpHighF;
    private MediaPlayer mpHighFs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpBB = MediaPlayer.create(this, R.raw.scalebb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpDs = MediaPlayer.create(this, R.raw.scaleds);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpGs = MediaPlayer.create(this, R.raw.scalegs);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpHighF = MediaPlayer.create(this, R.raw.scalehighf);
        mpHighFs = MediaPlayer.create(this, R.raw.scalehighfs);

//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i(TAG, "Button 1 Clicked");
//            }
//        });
    }
    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }


//    private void onButton1Click(View v){
//        mpE.seekTo(0);
//        Log.i(TAG, "Button 1 Clicked");
//        mpE.start();
//    }

    public void onButton1Click(View v) { //Challenge 1
        mpE.seekTo(0);
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
        Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpFs.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpG.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpC.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpE.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public void onButton6Click(View v){ //Challenge 6
            mpE.seekTo(0);
            Log.i(TAG, "Button 6 Clicked");
            mpE.start();
            Log.e("SynthesizerActivity", "Challenge 6 Button clicked");
            try {
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighFs.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHighE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpD.start();
                delayPlaying(WHOLE_NOTE/2);
                mpC.start();
                delayPlaying(WHOLE_NOTE/2);
                mpC.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.start();
               delayPlaying(WHOLE_NOTE/2);
                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onButton2Click(View v){
        mpF.seekTo(0);
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }

    public void onButton10Click(View v){ //Challenge 10
        mpF.seekTo(0);
        Log.i(TAG, "Button 10 Clicked");
        mpE.start();
        Log.e("SynthesizerActivity", "Challenge 6 Button clicked");
        try {
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighFs.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpC.start();
            delayPlaying(WHOLE_NOTE/2);
            mpC.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
            delayPlaying(WHOLE_NOTE/2);
            mpA.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpD.start();
            delayPlaying(WHOLE_NOTE/2);
            mpC.start();
            delayPlaying(WHOLE_NOTE/2);
            mpC.start();
            delayPlaying(WHOLE_NOTE/2);
            mpB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}









