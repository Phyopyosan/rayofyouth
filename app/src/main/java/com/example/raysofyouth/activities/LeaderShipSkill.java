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
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeaderShipSkill extends AppCompatActivity {

    @BindView(R.id.leaderskilltxt)
    TextView leaderskilltxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_ship_skill);

        ButterKnife.bind(this,this);

        leaderskilltxt.setMovementMethod(new ScrollingMovementMethod());

        String data = "";

        StringBuffer stuBuffer = new StringBuffer();

        InputStream inst = this.getResources().openRawResource(R.raw.leader);

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
                leaderskilltxt.setText(stuBuffer);
                inst.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
