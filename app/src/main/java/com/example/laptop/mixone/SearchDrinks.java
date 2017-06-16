package com.example.laptop.mixone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.*;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class SearchDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_drinks);
       // getActionBar().hide();
    }

    public void sendMessage(View view) {
       Button button = (Button) view;
        button.setText("clicked");
    }


}
