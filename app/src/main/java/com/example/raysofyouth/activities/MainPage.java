package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.raysofyouth.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainPage extends AppCompatActivity {

    @BindView(R.id.aboutusbtn)
    Button aboutsusbtn;

    @BindView(R.id.smartyouthbtn)
    Button smartyouthbtn;

    @BindView(R.id.languagebtn)
    Button languagebtn;

    @BindView(R.id.materialbtn)
    Button materialbtn;

    @BindView(R.id.successstorybtn)
    Button successstorybtn;

    @BindView(R.id.contactusbtn)
    Button contactusbtn;

    @BindView(R.id.tb)
    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ButterKnife.bind(this,this);


        Toolbar toolbar = findViewById(R.id.tb);
        setSupportActionBar(toolbar);
        aboutsusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutusin = new Intent(MainPage.this,AboutUsActivity.class);
                startActivity(aboutusin);


            }
        });

        smartyouthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smartyouthin = new Intent(MainPage.this,SmartYouthActivity.class);
                startActivity(smartyouthin);
            }
        });

        languagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent languagein = new Intent(MainPage.this,LanguageActivity.class);
                startActivity(languagein);
            }
        });
    }




    @Override
    public void onBackPressed() {
        finish();
    }
}
