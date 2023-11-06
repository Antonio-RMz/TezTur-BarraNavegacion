package com.example.teztur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivityBienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bienvenida);
    }

    public void abreActivityInicio(View view) {
        Intent intent = new Intent(view.getContext(), MainActivityInicio.class);
        view.getContext().startActivity(intent);
    }
}