package com.example.ravikumarpatel.gym_guide_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Exercises extends AppCompatActivity {

    private String [] items ={"icon_abdominal","icon_back","icon_biceps","icon_chest","icon_legs","icon_shoulders"};
    private int[] img= {R.drawable.abdominal ,R.drawable.back,R.drawable.biceps ,R.drawable.chest ,R.drawable.legs,R.drawable.shoulders};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        listView =(ListView) findViewById(R.id.list);
        listView.setAdapter(new CustomAdapter(this,items,img));

        listView.setOnClickListener(new AdapterView.OnClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent ,View view, int position, long id) {

            }
        });


    }
}
