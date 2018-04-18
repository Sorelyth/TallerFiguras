package com.holamundo.tallerfiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cuadrado extends AppCompatActivity {
    private EditText lado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        lado = findViewById(R.id.txtLadoC);
    }

    public void calcular(View v){
        double L,g;
        L = Double.parseDouble(lado.getText().toString());

        Metodos M = new Metodos();
        g = M.Cuadrado(L);
        Toast.makeText(this, g + "", Toast.LENGTH_SHORT).show();
        Figura F = new Figura("Area cuadrado", "Lado: " + L, g + "");
        F.Guardar();
    }

    public void borrar(View v){
        lado.setText("");
    }




}
