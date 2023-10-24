package br.senai.sp.Model;

public class Quadrado {

    double lado1, area, perimetro;

    public double CalcularArea(){
        area = lado1 * lado1;
        return area;

    }

    public double CalcularPerimetro(){

        perimetro = lado1 + lado1 + lado1 + lado1;
        return perimetro;

    }

}
