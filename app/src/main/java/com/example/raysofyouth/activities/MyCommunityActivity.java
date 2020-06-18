package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.raysofyouth.R;
import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyCommunityActivity extends AppCompatActivity {

    @BindView(R.id.mycommunitypdf)
    PDFView mycommunitypdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_community);
        ButterKnife.bind(this,this);

        mycommunitypdf.fromAsset("communitypdf.pdf").load();



    }
}
