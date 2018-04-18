package com.holamundo.tallerfiguras;

/**
 * Created by LabRedes on 17/04/2018.
 */

public class Figura {
    private String operacion;
    private String dato;
    private String resultado;

    public Figura(String operacion, String dato, String resultado) {
        this.operacion = operacion;
        this.dato = dato;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public void Guardar(){
        Datos d = new Datos();
        d.Agregar(this);

    }
}
