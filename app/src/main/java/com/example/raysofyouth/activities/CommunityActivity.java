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

public class CommunityActivity extends AppCompatActivity {

    @BindView(R.id.mycommunity)
    Button mycommunity;

    @BindView(R.id.aseancommunity)
    Button aseancommunity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        ButterKnife.bind(this,this);

        mycommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mycommunityin = new Intent(CommunityActivity.this,MyCommunityActivity.class);
                startActivity(mycommunityin);
            }
        });

        aseancommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aseancommunity = new Intent(CommunityActivity.this,AseanCommunityActivity.class);
                startActivity(aseancommunity);
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
