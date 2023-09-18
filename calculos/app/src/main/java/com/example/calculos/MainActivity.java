package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
                Intent Tela3 = new Intent(getApplicationContext(), Tela3.class);
                startActivity(Tela3);
                Intent Tela4 = new Intent(getApplicationContext(), Tela4.class);
                startActivity(Tela4);
            }
        });
    };
}