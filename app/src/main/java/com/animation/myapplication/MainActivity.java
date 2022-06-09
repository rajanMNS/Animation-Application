package com.animation.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    boolean isAnimCalled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.constraintLayout);

        ImageButton imageview = findViewById(R.id.button);

        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isAnimCalled) {
                    constraintLayout.animate().rotation(220.0f).setDuration(500);
                    isAnimCalled = true;
                } else {
                    constraintLayout.animate().rotation(-40f).setDuration(500);
                    isAnimCalled = false;
                }
            }
        });


    }
}