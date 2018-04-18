package com.holamundo.tallerfiguras;

/**
 * Created by LabRedes on 17/04/2018.
 */

public class Metodos {
    public double Cuadrado(double lado){
        return lado*lado;
    }

    public double Rectangulo(double base, double altura){
        return base*altura;
    }

    public double Triangulo(double base, double altura){
        return (base*altura)/2;
    }

    public double Circulo(double radio){
        return Math.PI*Math.pow(radio,2);
    }

    public double Esfera(double radio){
        return Math.PI*Math.pow(radio,3)*1.3;
    }

    public double Cilindro(double altura, double radio){
        return altura*Math.PI*Math.pow(radio,2);
    }

    public double Cono(double altura, double radio){
        return (altura*Math.PI*Math.pow(radio, 2))/3;
    }

    public double Cubo(double longitud){
        return Math.pow(longitud,3);
    }
}
