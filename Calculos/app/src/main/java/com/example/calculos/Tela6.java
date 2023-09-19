package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tela6 extends AppCompatActivity {


    TextView txt_completo, nomerecebido, sobrenomerecebido;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        txt_completo = findViewById(R.id.txt_completo);

        String nome = getIntent().getStringExtra(name:"nomerecebido");
        String sobrenome = getIntent().getStringExtra(name:"sobrenomerecebido");
        txt_completo.setText(nome + sobrenome);

    }