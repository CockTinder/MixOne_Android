package com.example.laptop.mixone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.*;

public class SearchDrinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_drinks);
       // getActionBar().hide();
        final Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SearchDrinks.this, BestDrinks.class));
            }
        });
    }
}
