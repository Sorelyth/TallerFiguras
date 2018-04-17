package com.holamundo.tallerfiguras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lv = findViewById(R.id.lstAreas);
        opc = getResources().getStringArray(R.array.lstArea);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        in = new Intent(Areas.this,cuadrado.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Areas.this,rectangulo.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Areas.this,triangulo.class);
                        startActivity(in);
                        break;
                    case 3:
                        in = new Intent(Areas.this,circulo.class);
                        startActivity(in);

                }
            }
        });
    }
}
