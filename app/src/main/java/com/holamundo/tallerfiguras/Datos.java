package com.holamundo.tallerfiguras;

import java.util.ArrayList;

/**
 * Created by LabRedes on 17/04/2018.
 */

public class Datos {
    private static ArrayList<Figura> datos = new ArrayList<>();
    public static void Agregar(Figura F){
        datos.add(F);
    }

    public static ArrayList<Figura> verLista() {
        return datos;
    }
}
