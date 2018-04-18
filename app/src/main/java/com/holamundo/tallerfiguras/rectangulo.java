package com.holamundo.tallerfiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class rectangulo extends AppCompatActivity {
    private EditText base, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        base = findViewById(R.id.txtBase);
        altura = findViewById(R.id.txtAltura);
    }

    public void calcular(View v){
        double B,H, g;
        B = Double.parseDouble(base.getText().toString());
        H = Double.parseDouble(altura.getText().toString());

        Metodos M = new Metodos();
        g = M.Rectangulo(B, H);
        Toast.makeText(this, g + "", Toast.LENGTH_SHORT).show();
        Figura F = new Figura("Area rectángulo", "Base: " + B + "Altura: " + H, g + "");
        F.Guardar();
    }

    public void borrar(View v){
        base.setText("");
        altura.setText("");
    }
}
