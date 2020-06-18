package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.raysofyouth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeaderShipActivity extends AppCompatActivity {

    @BindView(R.id.leadershipskillbtn)
    Button leadershipskillbtn;

    @BindView(R.id.activecitizenshipbtn)
    Button activecitizenshipbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_ship);

        ButterKnife.bind(this,this);

        leadershipskillbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent learderskillin = new Intent(LeaderShipActivity.this,LeaderShipSkill.class);
                startActivity(learderskillin);
            }
        });

        activecitizenshipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activein = new Intent(LeaderShipActivity.this,ActiveCitizenShipActivity.class);
                startActivity(activein);
            }
        });




    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
