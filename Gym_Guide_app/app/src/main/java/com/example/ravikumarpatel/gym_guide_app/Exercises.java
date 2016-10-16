package com.example.ravikumarpatel.gym_guide_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Exercises extends AppCompatActivity {

     CardView cardView_abdominal;
     CardView cardView_back;
     CardView cardView_biceps;
     CardView cardView_chest;
     CardView cardView_legas;
     CardView cardView_shoulder;
     CardView cardView_triceps;
     CardView cardView_stretching;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        cardView_abdominal =(CardView) findViewById(R.id.card_view1);
        cardView_back =(CardView) findViewById(R.id.card_view2);
        cardView_biceps =(CardView) findViewById(R.id.card_view3);
        cardView_chest =(CardView) findViewById(R.id.card_view4);
        cardView_legas =(CardView) findViewById(R.id.card_view5);
        cardView_shoulder =(CardView) findViewById(R.id.card_view6);
        cardView_triceps =(CardView) findViewById(R.id.card_view7);
        cardView_stretching =(CardView) findViewById(R.id.card_view8);

        cardView_abdominal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(Exercises.this ,abdominal_lists.class);
                startActivity(intent1);
            }
        });

         cardView_back.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent2 =new Intent(Exercises.this,back.class);
                 startActivity(intent2);
             }
         });

        cardView_biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 =new Intent(Exercises.this,biceps.class);
                startActivity(intent3);
            }
        });

        cardView_chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 =new Intent(Exercises.this,chest.class);
                startActivity(intent4);
            }
        });

        cardView_legas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 =new Intent(Exercises.this,legs.class);
                startActivity(intent5);

            }
        });

        cardView_shoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(Exercises.this,shoulders.class);
                startActivity(intent6);
            }
        });

        cardView_triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 =new Intent(Exercises.this,triceps.class);
                startActivity(intent7);
            }
        });

        cardView_stretching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 =new Intent(Exercises.this,stretching.class);
                startActivity(intent8);
            }
        });


    }
}
