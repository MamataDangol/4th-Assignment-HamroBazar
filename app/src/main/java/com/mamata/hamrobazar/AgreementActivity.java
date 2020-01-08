package com.mamata.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.mamata.hamrobazar.Agreement.AdPostingActivity;
import com.mamata.hamrobazar.Agreement.SafetyActivity;
import com.mamata.hamrobazar.Agreement.TermsActivity;

public class AgreementActivity extends AppCompatActivity {
    CheckBox chkTerms, chkSafety, chkAd;
    Button btnagree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        chkTerms = findViewById(R.id.chkTerms);
        chkSafety = findViewById(R.id.chkSafety);
        chkAd = findViewById(R.id.chkAd);
        btnagree = findViewById(R.id.btnagree);


        chkTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgreementActivity.this, TermsActivity.class);
                startActivity(intent);
                chkTerms.setChecked(true);
                chkTerms.setEnabled(false);

                //v.setOnClickListener(null);
            }
        });

        chkSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgreementActivity.this, SafetyActivity.class);
                startActivity(intent);
                chkSafety.setChecked(true);
                chkSafety.setEnabled(false);
            }
        });

        chkAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgreementActivity.this, AdPostingActivity.class);
                startActivity(intent);
                chkAd.setChecked(true);
                chkAd.setEnabled(false);
            }
        });

        btnagree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgreementActivity.this, SplashScreenActivity.class);
                startActivity(intent);
            }
        });
    }
}
