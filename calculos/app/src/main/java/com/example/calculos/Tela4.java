package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculos.MainActivity;

public class Tela4 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        Button btn_calcula_bhas;
        TextView tl_a,tl_b,tl_c;

        tl_a = findViewById(R.id.a);
        tl_b = findViewById(R.id.b);
        tl_c = findViewById(R.id.c);
        btn_calcula_bhas = findViewById(R.id.btnBhas);

        btn_calcula_bhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double A = Double.parseDouble(tl_a.getText().toString());
                Double B = Double.parseDouble(tl_b.getText().toString());
                Double C = Double.parseDouble(tl_c.getText().toString());

                Double delta = (B*B) - (4*A*C);
                Double X1  =  (-B + Math.sqrt(delta))/2*A;
                Double X2  = (-B - Math.sqrt(delta))/2*A;

                TextView txt_bhas = findViewById(R.id.txt_bhas);
                txt_bhas.setText("X1 : "+X1+"\nX2 : "+X2);


            }
        });

    }
}