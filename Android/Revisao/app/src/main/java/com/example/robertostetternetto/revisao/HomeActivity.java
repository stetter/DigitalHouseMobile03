package com.example.robertostetternetto.revisao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView textViewHome;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textViewHome = findViewById(R.id.textview_home);
        btnBack = findViewById(R.id.btn_back);

        String value = getIntent().getStringExtra("name");

        textViewHome.setText(value);

    }
}
