package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.raysofyouth.R;
import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LifeSkillsActivity extends AppCompatActivity {

    @BindView(R.id.lifeskillpdf)
    PDFView lifeskillpdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_skills);

        ButterKnife.bind(this,this);

        lifeskillpdf.fromAsset("lifeskills.pdf").load();
    }

}
