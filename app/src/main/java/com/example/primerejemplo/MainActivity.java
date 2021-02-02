package com.example.primerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_base;
    private EditText et_exponente;
    private TextView tv_potencia;
    private Button button_potencia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontrar las direcciones de controles de memoria del layout
        et_base = findViewById(R.id.et_base);
        et_exponente = findViewById(R.id.et_exponente);
        tv_potencia = findViewById(R.id.tv_potencia);
        button_potencia = findViewById(R.id.button_Potencia);
    }

    //Esto se va a ejecutar cuando se de clic en el boton

    public void clic_potencia(View view){
        int base = Integer.parseInt(et_base.getText().toString());
        int exponente = Integer.parseInt(et_exponente.getText().toString());
        int potencia = 1;
        for (int i = 1; i<=exponente;i++){
            potencia *= base;
        }

        //Mostrar el resultado
        String resultado = String.valueOf(potencia);
        tv_potencia.setText(resultado);
    }
}