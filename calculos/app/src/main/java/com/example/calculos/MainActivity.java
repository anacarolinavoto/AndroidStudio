package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCalc, btnBhas, btnForm, btnIMC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tela2 = new Intent(getApplicationContext(), Tela2.class);
                startActivity(Tela2);

            }

            Button btnIMC = findViewById(R.id.btnIMC);
        btnIMC.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {
                    Intent Tela3 = new Intent(getApplicationContext(), Tela3.class);
                    startActivity(Tela3);

                }
                Button btnBhas = findViewById(R.id.btnBhas);
                btnBhas.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent Tela4 = new Intent(getApplicationContext(), Tela4.class);
                        startActivity(Tela4);

                    }

                    Button btnForm = findViewById(R.id.btnForm);
                btnForm.setOnClickListener(new View.OnClickListener() {

                            Intent Tela5 = new Intent(getApplicationContext(), Tela5.class);
                            startActivity(Tela5);
                        }
                };
            });
          }
        });
    }
}