package com.holamundo.tallerfiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cilindro extends AppCompatActivity {
    private EditText altura, radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        radio = findViewById(R.id.txtRadio);
        altura = findViewById(R.id.txtAltura);
    }

    public void calcular(View v){
        double Ra,H, g;
        Ra = Double.parseDouble(radio.getText().toString());
        H = Double.parseDouble(altura.getText().toString());

        Metodos M = new Metodos();
        g = M.Cilindro(H, Ra);
        Toast.makeText(this, g + "", Toast.LENGTH_SHORT).show();
        Figura F = new Figura("Area cilindro", "Altura: " + H + "Radio: " + Ra, g + "");
        F.Guardar();
    }

    public void borrar(View v){
        radio.setText("");
        altura.setText("");
    }
    }
