package com.best.cy.fragmenttest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Fragment4 extends Fragment {

    int r=100;
    int g=100;
    int b=100;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment4, container, false);

        Button button =  rootView.findViewById(R.id.button);
       final TextView showRGB = rootView.findViewById(R.id.showRGB);
       final ImageView img1 =   rootView.findViewById(R.id.bcolor);

        Button rPlus =  rootView.findViewById(R.id.Rplus);
        Button rMinus =  rootView.findViewById(R.id.Rminus);
        Button gPlus =  rootView.findViewById(R.id.Gplus);
        Button gMinus =  rootView.findViewById(R.id.Gminus);
        Button bPlus =  rootView.findViewById(R.id.Bplus);
        Button bMinus =  rootView.findViewById(R.id.Bminus);
        Button randomB =  rootView.findViewById(R.id.randomButton);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();

                activity.onGotoMainFragment();
            }
        });


        rPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               r++;
                img1.setBackgroundColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
            }
        });

        rMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r--;
                img1.setBackgroundColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
            }
        });

        gPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g++;
                img1.setBackgroundColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
            }
        });

        gMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g--;
                img1.setBackgroundColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
            }
        });

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                img1.setBackgroundColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b--;
                img1.setBackgroundColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
            }
        });

        randomB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r = new Random().nextInt(256);
                g = new Random().nextInt(256);
                b = new Random().nextInt(256);

                showRGB.setTextColor(Color.rgb(r,g,b));
                showRGB.setText("red:"+r+" "+"green:"+ g+" "+"blue:" +b);
                img1.setBackgroundColor(Color.rgb(r,g,b));
            }
        });


        showRGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              r = new Random().nextInt(256);
              g = new Random().nextInt(256);
              b = new Random().nextInt(256);

                showRGB.setTextColor(Color.rgb(r,g,b));
                showRGB.setText(""+r+g+b);
                img1.setBackgroundColor(Color.rgb(r,g,b));

            }
        });

        return rootView;
    }

}
