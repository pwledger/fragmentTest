package com.best.cy.fragmenttest;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Fragment1 mainFragment;
    Fragment2 fragment2;
    Fragment3 fragment3;
    Fragment4 fragment4;

    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = (Fragment1) getSupportFragmentManager().findFragmentById(R.id.mainFragment);
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
    }


    public void onButton1(View v) {

        b1.setTypeface(Typeface.create("", Typeface.BOLD));
        b1.setTextColor(Color.BLUE);

        b2.setTypeface(Typeface.create("", Typeface.NORMAL));
        b2.setTextColor(Color.BLACK);

        b3.setTypeface(Typeface.create("", Typeface.NORMAL));
        b3.setTextColor(Color.BLACK);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
    }

    public void onButton2(View v) {

        b1.setTypeface(Typeface.create("", Typeface.NORMAL));
        b1.setTextColor(Color.BLACK);

        b2.setTypeface(Typeface.create("", Typeface.BOLD));
        b2.setTextColor(Color.BLUE);

        b3.setTypeface(Typeface.create("", Typeface.NORMAL));
        b3.setTextColor(Color.BLACK);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();
    }

    public void onButton3(View v) {

        b1.setTypeface(Typeface.create("", Typeface.NORMAL));
        b1.setTextColor(Color.BLACK);

        b3.setTypeface(Typeface.create("", Typeface.BOLD));
        b3.setTextColor(Color.BLUE);

        b2.setTypeface(Typeface.create("", Typeface.NORMAL));
        b2.setTextColor(Color.BLACK);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment4).commit();
    }

    public void onGotoMainFragment() {

        b1.setTypeface(Typeface.create("", Typeface.NORMAL));
        b1.setTextColor(Color.BLACK);

        b3.setTypeface(Typeface.create("", Typeface.NORMAL));
        b3.setTextColor(Color.BLACK);

        b2.setTypeface(Typeface.create("", Typeface.NORMAL));
        b2.setTextColor(Color.BLACK);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();

    }
}
