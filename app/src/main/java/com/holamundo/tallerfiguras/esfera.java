package com.holamundo.tallerfiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class esfera extends AppCompatActivity {
    private EditText radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = findViewById(R.id.txtRadio);

    }

    public void calcular(View v){
        double Ra, g;
        Ra = Double.parseDouble(radio.getText().toString());

        Metodos M = new Metodos();
        g = M.Esfera(Ra);
        Toast.makeText(this, g + "", Toast.LENGTH_SHORT).show();
        Figura F = new Figura("Area esfera", "Radio: " + Ra, g + "");
        F.Guardar();
    }

    public void borrar(View v){
        radio.setText("");

    }
}
