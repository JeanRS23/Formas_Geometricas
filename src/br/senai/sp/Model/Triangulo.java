package br.senai.sp.Model;

public class Triangulo {

    public double base;
    public double altura;
    public double area;

    public double CalcularArea(){
        double area = (base * altura) / 2;
        return area;

    }
    public double CalcularPerimetro(){

        double perimetro = base + altura * 2;
        return perimetro;
    }

}
