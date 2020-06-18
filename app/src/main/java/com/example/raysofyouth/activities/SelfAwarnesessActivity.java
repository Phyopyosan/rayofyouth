
package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.raysofyouth.R;
import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelfAwarnesessActivity extends AppCompatActivity {

    @BindView(R.id.selfawarenesspdf)
    PDFView selfawarenesspdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_awarnesess);

        ButterKnife.bind(this,this);

        selfawarenesspdf.fromAsset("selfawareness.pdf").load();
    }


}
