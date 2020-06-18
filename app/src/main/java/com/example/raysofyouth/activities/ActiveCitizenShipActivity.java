package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.raysofyouth.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ActiveCitizenShipActivity extends AppCompatActivity {

    @BindView(R.id.activetxt)
    TextView activetxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_citizen_ship);

        ButterKnife.bind(this,this);

        activetxt.setMovementMethod(new ScrollingMovementMethod());

        String data = "";

        StringBuffer stuBuffer = new StringBuffer();

        InputStream inst = this.getResources().openRawResource(R.raw.activecitizenship);

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(inst,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        if(inst != null){
            try{
                while ((data = reader.readLine())!=null){
                    stuBuffer.append(data +"\n");
                }
                activetxt.setText(stuBuffer);
                inst.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
