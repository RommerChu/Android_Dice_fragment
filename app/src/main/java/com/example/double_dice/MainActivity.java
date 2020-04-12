package com.example.double_dice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CUSTOMIZED APPBAR TITLE AND SUBTITLE
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Roll d' Dice");
        ab.setSubtitle("Roll the fun anytime!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Layout inflator
        getMenuInflater().inflate(R.menu.main_nav,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int clicked = item.getItemId();
            Fragment fr;
        if (clicked == R.id.btn_player1){
                fr = new screen1();
            }else{
                fr = new screen2();
                //Toast.makeText(this, "Please enter player 1 and 2", Toast.LENGTH_SHORT).show();
        }

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();

            ft.replace(R.id.fragment1,fr);
            ft.commit();

        return super.onOptionsItemSelected(item);
    }

}
