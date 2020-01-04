package com.mamata.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class AgreementActivity extends AppCompatActivity {
    CheckBox chkTerms, chkSafety, chkAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        chkTerms = findViewById(R.id.chkTerms);
        chkSafety = findViewById(R.id.chkSafety);
        chkAd = findViewById(R.id.chkAd);


        chkTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgreementActivity.this, Terms.class);
                startActivity(intent);
                chkTerms.setChecked(true);
                chkTerms.setEnabled(false);

                //v.setOnClickListener(null);
            }
        });

        chkSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgreementActivity.this, Safety.class);
                startActivity(intent);
                chkSafety.setChecked(true);
                chkSafety.setEnabled(false);
            }
        });
    }
}
