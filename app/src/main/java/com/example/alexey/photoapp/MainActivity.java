package com.example.alexey.photoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private ImageView imageView2;
    private Button button1;
    private Button button2;
    int[] images = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four,
            R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight, R.drawable.nine, R.drawable.ten};
    int i = 1;
    int j = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doAction1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doAction2();
            }
        });
    }
    void doAction1() {
        if(i == 9)
            i = 0;
        imageView1.setImageResource(images[i]);
        i++;
    }

    void doAction2() {
        if(j == 9)
            j = 0;
        imageView2.setImageResource(images[j]);
        j++;
    }
}

