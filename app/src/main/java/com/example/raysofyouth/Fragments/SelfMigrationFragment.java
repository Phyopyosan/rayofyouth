package com.example.raysofyouth.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raysofyouth.R;
import com.github.barteksc.pdfviewer.PDFView;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelfMigrationFragment extends Fragment {

    PDFView selfmgpdf;

    public SelfMigrationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View v = inflater.inflate(R.layout.fragment_self_migration, container, false);
     selfmgpdf = v.findViewById(R.id.selfsmgpdf);
     selfmgpdf.fromAsset("safemigration.pdf").load();
     return v;

    }
}
