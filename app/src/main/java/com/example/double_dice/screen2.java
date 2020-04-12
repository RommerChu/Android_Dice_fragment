package com.example.double_dice;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class screen2 extends Fragment {

    Button dice_roll; //button of the dice
    ImageView imageViewDice; //image of the dice from mipmap

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        imageViewDice = imageViewDice.findViewById ( R.id.IV_diceresult ); //
        dice_roll = dice_roll.findViewById(R.id.btn_roll);
        dice_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roll(); // when click this button it will trigger the function roll()
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dice_screen, container, false);
    }
        //METHOD TO CALL FUNCTION "roll"
        private void roll() {
        int rollNumber = (int)(Math.random()*6+1); //set random number by using Math.random()

        //TIMER COUNTER
        int SPLASH_TIME_OUT = 10000; // Declare variable
        // Code in activity or fragment

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                imageViewDice.setImageResource(R.mipmap.dice_start);
            }
        }, SPLASH_TIME_OUT);


        //used switch statement to change the image once every pressed of button
        switch(rollNumber){
            case 1:
                imageViewDice.setImageResource(R.mipmap.dice1);
                //Log.d("Dice","One");
                break;
            case 2:
                imageViewDice.setImageResource(R.mipmap.dice2);
                //Log.d("Dice","Two");
                break;
            case 3:
                imageViewDice.setImageResource(R.mipmap.dice3);
                //Log.d("Dice","Three");
                break;
            case 4:
                imageViewDice.setImageResource(R.mipmap.dice4);
                //Log.d("Dice","Four");
                break;
            case 5:
                imageViewDice.setImageResource(R.mipmap.dice5);
                //Log.d("Dice","Five");
                break;
            case 6:
                imageViewDice.setImageResource(R.mipmap.dice6);
                //Log.d("Dice","Six");
                break;
        }

        //TOAST MESSAGE
        Toast toast= Toast.makeText(getContext(),
                String.valueOf(rollNumber), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();

    }


}
