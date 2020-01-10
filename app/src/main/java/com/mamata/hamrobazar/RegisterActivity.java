package com.mamata.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.mamata.hamrobazar.Agreement.TermsActivity;

public class RegisterActivity extends AppCompatActivity {
    private Spinner spinCity;
    private TextView tvRegisterTerms;
    private ImageView btnRegisterBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegisterBack = findViewById(R.id.btnRegisterBack);
        btnRegisterBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });




        spinCity = findViewById(R.id.spinCity);

        String cities[] = {"Kathmandu","Lalitpur","Bhaktapur","Pokhara","Bara","Baglung","Chitwan","Dama","Dang","Syangja","Gorkha","Itahari","Hetauda","Biratnagar","Janakpur","Dadeldhura","Dhankuta"};

        ArrayAdapter spinAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );

        spinCity.setAdapter(spinAdapter);

        //Terms Section
        tvRegisterTerms = findViewById(R.id.tvRegisterTerms);
        tvRegisterTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, TermsActivity.class);
                startActivity(intent);
            }
        });

    }
}
