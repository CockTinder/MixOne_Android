package com.example.laptop.mixone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BestDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_drinks);
       // getActionBar().hide();
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SearchDrinks.class);
        startActivity(intent);
    }
}
