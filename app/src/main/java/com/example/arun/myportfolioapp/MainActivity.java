package com.example.arun.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Displays the toast message
     */
    public void showToast(View view){
        int id= view.getId();

        //Uses switch case to display toast message for a particular button
        switch (id) {
            case R.id.popular_movies_app:
                Toast.makeText(getApplicationContext(), getString(R.string.launch) + " Popular Movies app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.stock_hawk_app:
                Toast.makeText(getApplicationContext(), getString(R.string.launch) + " Stock Hawk app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.build_it_bigger_app:
                Toast.makeText(getApplicationContext(), getString(R.string.launch) + " Build it Bigger app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.material_app:
                Toast.makeText(getApplicationContext(), getString(R.string.launch) + " Make Your Material app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.go_ubiquitous_app:
                Toast.makeText(getApplicationContext(), getString(R.string.launch) + " Go Ubiquitous app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone_app:
                Toast.makeText(getApplicationContext(), getString(R.string.launch) + " Capstone app!",Toast.LENGTH_SHORT).show();
                break;

        }//end of switch case
    }
}
