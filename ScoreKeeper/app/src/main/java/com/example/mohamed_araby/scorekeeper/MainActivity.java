package com.example.mohamed_araby.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int gScore = 0;
    private int hScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Gplus_6(View view) {

        TextView gplus = (TextView) findViewById(R.id.guest);
        gScore += 6;
        gplus.setText(String.valueOf(gScore));
    }

    public void Hplus_6(View view) {

        TextView hplus = (TextView) findViewById(R.id.home);
        hScore += 6;
        hplus.setText(String.valueOf(hScore));
    }

    ////////////////////////////////////////////////////////////////
    public void Gplus_1(View view) {

        TextView gplus = (TextView) findViewById(R.id.guest);
        gScore += 1;
        gplus.setText(String.valueOf(gScore));
    }

    public void Hplus_1(View view) {

        TextView hplus = (TextView) findViewById(R.id.home);
        hScore += 1;
        hplus.setText(String.valueOf(hScore));
    }

    ////////////////////////////////////////////////////////////////
    public void Gplus_3(View view) {

        TextView gplus = (TextView) findViewById(R.id.guest);
        gScore += 3;
        gplus.setText(String.valueOf(gScore));
    }

    public void Hplus_3(View view) {

        TextView hplus = (TextView) findViewById(R.id.home);
        hScore += 3;
        hplus.setText(String.valueOf(hScore));
    }

    ////////////////////////////////////////////////////////////////
    public void Gplus_2(View view) {

        TextView gplus = (TextView) findViewById(R.id.guest);
        gScore += 2;
        gplus.setText(String.valueOf(gScore));
    }

    public void Hplus_2(View view) {

        TextView hplus = (TextView) findViewById(R.id.home);
        hScore += 2;
        hplus.setText(String.valueOf(hScore));

    }
    public void Reset(View view){
        TextView hplus = (TextView) findViewById(R.id.home);
        TextView gplus = (TextView) findViewById(R.id.guest);
        hScore=0;
        gScore=0;
        hplus.setText("0");
        gplus.setText("0");
    }
    
    
    
    
    
}