package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;

import com.example.raysofyouth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RightLawsActivity extends AppCompatActivity {

    @BindView(R.id.humanrightbtn)
    Button humanrightbtn;

    @BindView(R.id.crcbtn)
    Button crcbtn;

    @BindView(R.id.childlawbtn)
    Button childlawbtn;

    @BindView(R.id.humanlawbtn)
    Button humanlaewbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_laws);
        ButterKnife.bind(this,this);

    }
}
