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

public class SmartYouthActivity extends AppCompatActivity {

    @BindView(R.id.myselfbtn)
    Button myselfbtn;

    @BindView(R.id.communitybtn)
    Button communitybtn;

    @BindView(R.id.socialbtn)
    Button socialbtn;

    @BindView(R.id.rightbtn)
    Button rightbtn;

    @BindView(R.id.leadershipbtn)
    Button leadershipbtn;

    @BindView(R.id.activitymakerbtn)
    Button activitymakerbtn;

    @BindView(R.id.exercisebtn)
    Button exercisebtn;

    @BindView(R.id.dobtn)
    Button dobtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart_youth);
        ButterKnife.bind(this,this);
        Toolbar tb = findViewById(R.id.smytb);
        setSupportActionBar(tb);
        myselfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myselfin = new Intent(SmartYouthActivity.this,MyselfActiviy.class);
                startActivity(myselfin);
                finish();
            }
        });

        communitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent communityin = new Intent(SmartYouthActivity.this,CommunityActivity.class);
                startActivity(communityin);
                finish();
            }
        });

        socialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent socialin = new Intent(SmartYouthActivity.this,SocialIssueActivity.class);
                startActivity(socialin);
                finish();
            }
        });

        rightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rightin = new Intent(SmartYouthActivity.this,RightLawsActivity.class);
                startActivity(rightin);
                finish();
            }
        });

        leadershipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leadershipin = new Intent(SmartYouthActivity.this,LeaderShipActivity.class);
                startActivity(leadershipin);
                finish();
            }
        });

        activitymakerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activitymakerin = new Intent(SmartYouthActivity.this,ActivitymakerActivity.class);
                startActivity(activitymakerin);
                finish();
            }
        });

        exercisebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exercisein = new Intent(SmartYouthActivity.this,ExerciseActivity.class);
                startActivity(exercisein);
                finish();
            }
        });



    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
