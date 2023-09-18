package com.example.calculos;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Tela3 extends AppCompatActivity {

    private EditText editText1, editText2, editText3, editText4;
    private Button btnResultado, btnSair;
    private Double imc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View. OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
            });

        editText1 = findViewById(R.id.Nome);
        editText2 = findViewById(R.id.Idade);
        editText3 = findViewById(R.id.Altura);
        editText4 = findViewById(R.id.Peso);
        Button btnResultado = findViewById(R.id.btnResultado);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtém os valores dos campos de texto
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int valor3 = Integer.parseInt(editText3.getText().toString());
                Double valor4 = Double.parseDouble(editText4.getText().toString());

                // Realiza a soma dos valores
                imc = valor4 / (valor3 * valor3);

                if (imc < 17) {
                    String resultado = "Muito abaixo do peso";
                } else if (imc >= 17 && imc < 18.5) {
                    String resultado = "Abaixo do peso.";
                } else if (imc >= 18.5 && imc < 25) {
                    String resultado = "Peso normal.";
                } else if (imc >= 25 && imc < 30) {
                    String resultado = "Acima do peso.";
                } else if (imc >= 30 && imc < 35) {
                    String resultado = "Obesidade I.";
                } else if (imc >= 35 && imc < 40) {
                    String resultado = "Obesidade II (severa).";
                } else {
                    String resultado = "Obesidade III (mórbida).";

                    // Exibe o resultado em um Toast
                    Toast.makeText(Tela3.this, +valor1 + valor2 + "O seu IMC é: " + imc + resultado, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }}

