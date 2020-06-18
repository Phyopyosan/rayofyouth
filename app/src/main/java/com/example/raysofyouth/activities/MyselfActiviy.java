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

public class MyselfActiviy extends AppCompatActivity {

    @BindView(R.id.selfawarenessbtn)
    Button selfawarenessbtn;

    @BindView(R.id.lifeskillsbtn)
    Button lifeskillsbtn;

    @BindView(R.id.myfamilybtn)
    Button myfamilybtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myself_activiy);
        ButterKnife.bind(this,this);

        selfawarenessbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent selfawarenessin = new Intent(MyselfActiviy.this,SelfAwarnesessActivity.class);
                startActivity(selfawarenessin);
            }
        });

        lifeskillsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent lifeskillin = new Intent(MyselfActiviy.this,LifeSkillsActivity.class);
                startActivity(lifeskillin);

            }
        });

        myfamilybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myfamilyin = new Intent(MyselfActiviy.this,MyFamilyActivity.class);
                startActivity(myfamilyin);

            }
        });
    }

//    @Override
//    public void onBackPressed() {
//        finish();
//    }
}
