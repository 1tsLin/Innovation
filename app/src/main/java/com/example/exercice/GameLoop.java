package com.example.exercice;


import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class GameLoop extends SurfaceView implements SurfaceHolder.Callback {
    //Variables
    Boolean running = true;
    public int years = 0;

    //Setup Year Counter
    TextView textView;
    ImageButton button;

    public GameLoop(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // you set up your views once, after the layout is inflated
        setUpViews();

        // you initialize your buttons functionality
        initClickEvents();

        //Game Loop
        while (running) {
            // do other stuff
        }
    }

    private void setUpViews() {
        textView = (TextView) findViewById(R.id.year_counter);
        button = (ImageButton) findViewById(R.id.advance);
    }

    private void initClickEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                years += 1;
                textView.setText("" + years + "");
            }
        });
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

    }
}




}
