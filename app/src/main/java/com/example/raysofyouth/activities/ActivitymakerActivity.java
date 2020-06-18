package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.raysofyouth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActivitymakerActivity extends AppCompatActivity {

    @BindView(R.id.facilitatorskillbtn)
    Button facilitatorskillbtn;

    @BindView(R.id.moduledevbtn)
    Button moduledevbtn;

    @BindView(R.id.sampleactdesignbtn)
    Button sampleactdesignbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitymaker);
        ButterKnife.bind(this,this);
    }
}
