package com.example.raysofyouth.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.raysofyouth.R;
import com.github.barteksc.pdfviewer.PDFView;

import butterknife.BindView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SocietyFragment extends Fragment {
    PDFView societypdfv;

    public SocietyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_society, container, false);
        societypdfv = v.findViewById(R.id.societypdf);
        societypdfv.fromAsset("society.pdf").load();
        return  v;
    }
}
