package com.example.laptop.mixone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
=======
import android.view.View.*;
>>>>>>> 4ebe5d62bd4a046b8e5f7968c989909f1b650bea

public class SearchDrinks extends AppCompatActivity {

    private Button mBtLaunchActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_drinks);
       // getActionBar().hide();
<<<<<<< HEAD

=======
        final Button btn = (Button)findViewById(R.id.button2);
        btn.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SearchDrinks.this, BestDrinks.class));
            }
        });
>>>>>>> 4ebe5d62bd4a046b8e5f7968c989909f1b650bea
    }

    public void sendMessage(View view) {

    }


}
