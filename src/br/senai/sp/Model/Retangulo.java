package br.senai.sp.Model;

public class Retangulo {


    double lado1, lado2, area, perimetro;

    public double CalcularArea(){

         area = lado1 * lado2;
        return area;

    }

    public double CalcularPerimetro(){

        double perimetro = lado1 * 2 * lado2 * 2;
        return perimetro;

    }

}
