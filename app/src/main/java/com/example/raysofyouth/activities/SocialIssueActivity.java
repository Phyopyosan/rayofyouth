package com.example.raysofyouth.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.example.raysofyouth.Fragments.SelfMigrationFragment;
import com.example.raysofyouth.Fragments.SocietyFragment;
import com.example.raysofyouth.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SocialIssueActivity extends AppCompatActivity {

    @BindView(R.id.socitybtn)
    Button socitybtn;

    @BindView(R.id.safemigrationbtn)
    Button safemigrationbtn;

    @BindView(R.id.childbtn)
    Button childbtn;

    @BindView(R.id.humanbtn)
    Button humanbtn;

    @BindView(R.id.genderbtn)
    Button genderbtn;

    @BindView(R.id.youthproblembtn)
    Button youthproblembtn;

    @BindView(R.id.midlbtn)
    Button midlbtn;

    @BindView(R.id.srhrbtn)
    Button srhrbtn;

    @BindView(R.id.drugsbtn)
    Button drugsbtbn;

    @BindView(R.id.communityhealthbtn)
    Button communityhealthbtn;

    @BindView(R.id.enviromnment)
    Button enviromnment;

    @BindView(R.id.sc)
    ScrollView sc;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_issue);
        ButterKnife.bind(this,this);

        socitybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sc.setVisibility(View.GONE);
                FragmentManager fg = getSupportFragmentManager();
                SocietyFragment sfg = new SocietyFragment();
                Log.d("mm", "why");
                fg.beginTransaction().replace(R.id.sociallayout,sfg).commit();

            }
        });

        safemigrationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sc.setVisibility(View.GONE);
                FragmentManager fg = getSupportFragmentManager();
                SelfMigrationFragment selffg = new SelfMigrationFragment();
                fg.beginTransaction().replace(R.id.sociallayout,selffg).commit();

            }
        });


    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
