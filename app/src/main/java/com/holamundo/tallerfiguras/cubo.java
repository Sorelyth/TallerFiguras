package com.holamundo.tallerfiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cubo extends AppCompatActivity {
    private EditText longi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        longi = findViewById(R.id.txtLongitud);

    }

    public void calcular(View v){
        double L, g;
        L = Double.parseDouble(longi.getText().toString());

        Metodos M = new Metodos();
        g = M.Cubo(L);
        Toast.makeText(this, g + "", Toast.LENGTH_SHORT).show();
        Figura F = new Figura("Area cubo", "Longitud: " + L, g + "");
        F.Guardar();
    }

    public void borrar(View v){
        longi.setText("");

    }
    }

