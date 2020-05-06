package com.example.photo_frameapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //String[] previous_array ={"one","two","three","four","five","six","seven","eight","nine","ten"};
    //String[] next_array = {"ten","nine","eight","seven","six","five","four","three","two","one"};
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void previous_slide(View view) {

        count = (10 + count - 1) % 10;
        switch (count) {
            case 0:
                ImageView img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.one);
                break;
            case 1:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.two);
                break;
            case 2:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.three);
                break;
            case 3:
                 img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.four);
                break;
            case 4:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.five);
                break;
            case 5:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.six);
                break;
            case 6:
                 img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.seven);
                break;
            case 7:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.eight);
                break;
            case 8:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.nine);
                break;
            case 9:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.ten);
                break;
        }


    }

    public void next_slide(View view) {

        count = (count + 1) % 10;
        switch (count) {
            case 0:
                ImageView img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.one);
                break;
            case 1:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.two);
                break;
            case 2:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.three);
                break;
            case 3:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.four);
                break;
            case 4:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.five);
                break;
            case 5:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.six);
                break;
            case 6:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.seven);
                break;
            case 7:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.eight);
                break;
            case 8:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.nine);
                break;
            case 9:
                img = findViewById(R.id.imageView);
                img.setImageResource(R.drawable.ten);
                break;
        }
    }
}