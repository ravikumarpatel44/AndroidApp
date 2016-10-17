package com.example.ravikumarpatel.traveldiaries_frontend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {


    private static EditText user_name;
    private static EditText password;

    Animation Fade_in, Fade_out;
    ViewFlipper viewFlipper;

    Button btnlogin,btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // image slider start here..

        viewFlipper = (ViewFlipper) this.findViewById(R.id.flipper);
        Fade_in = AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        Fade_out = AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        //Set out flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

        // slider end here..


            btnlogin = (Button) findViewById(R.id.login);
            btnlogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent1 = new Intent(MainActivity.this, Home.class);
                    startActivity(intent1);
                }
            });


        btnsignup =(Button) findViewById(R.id.signup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,Registration.class);
                startActivity(intent2);
            }
        });




    }

//    public void Loginbutton () {
//
//        user_name = (EditText) findViewById(R.id.user_name);
//        password = (EditText) findViewById(R.id.password);
//
//
//
//            btnlogin.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    if (user_name.getText().toString().equals("ravi268kumar") && password.getText().toString().equals("ravi123")) {
//
//
//                        Intent intent1 = new Intent(MainActivity.this, Home.class);
//                        startActivity(intent1);
//
//                    }
//
//                }
//            });




    }

