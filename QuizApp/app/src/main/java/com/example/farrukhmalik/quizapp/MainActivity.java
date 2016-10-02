package com.example.farrukhmalik.quizapp;

import android.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    int score=0;
    int total=3;
    public void result(View view) {
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);

        RadioButton rd1 = (RadioButton) findViewById(R.id.r1);
        if (rd1.isChecked()){
            score ++;
        }

        RadioButton rd2 = (RadioButton) findViewById(R.id.r2);
        if (rd2.isChecked()){
            score++;
        }
        RadioButton rd3 = (RadioButton) findViewById(R.id.r3);
        if(rd3.isChecked()){
            score++;

        }
        float perc = score/total*100;



        if (perc>50){
            msgBox.setMessage("Congratulation you got "+perc+" marks..");
            msgBox.show();
        }



        else {
            msgBox.setMessage("Sorry! you are Failled"+ perc+" marks");
            msgBox.show();
        }
    }
}
