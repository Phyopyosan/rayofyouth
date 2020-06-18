package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.raysofyouth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExerciseActivity extends AppCompatActivity {

    @BindView(R.id.myselfexbtn)
    Button myselfexbtn;

    @BindView(R.id.communityexbtn)
    Button communityexbtn;

    @BindView(R.id.socialexbtn)
    Button socialexbtn;

    @BindView(R.id.rightlawexbtn)
    Button rightlawexbtn;

    @BindView(R.id.leadershipexbtn)
    Button leadershipexbtn;

    @BindView(R.id.activitymakerexbtn)
    Button activitymarkerbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        ButterKnife.bind(this,this);
    }
}
