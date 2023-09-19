package com.example.calculos;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Tela5 extends AppCompatActivity {

    // define the variable
    Button salvar;
    EditText NomeForm, SobrenomeForm;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R. layout.activity_tela5);
        NomeForm = findViewById (R.id.NomeForm) ;
        SobrenomeForm = findViewById(R.id.SobrenomeForm);
        salvar = findViewById(R.id.salvar);
        salvar.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela5.this, Tela6.class);

                intent.putExtra(name:"nomerecebido", NomeForm.getText().toString());
                intent.putExtra(name:"sobrenomerecebido", SobrenomeForm.getText().toString());
                startActivity(intent);
                finish();

            }
        });