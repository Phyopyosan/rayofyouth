package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.raysofyouth.R;
import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyFamilyActivity extends AppCompatActivity {

    @BindView(R.id.myfamilypdf)
    PDFView myfamilypdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_family);

        ButterKnife.bind(this,this);

        myfamilypdf.fromAsset("myfamily.pdf").load();
    }
}
