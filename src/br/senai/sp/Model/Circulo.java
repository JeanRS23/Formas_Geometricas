package br.senai.sp.Model;

public class Circulo {

    double raio, area, perimetro;


   public double CalcularArea(){

       area = (Math.PI * raio * raio);
       return area;

   }

    public double CalcularPerimetro(){

       perimetro = (2 * Math.PI) * raio;
       return perimetro;


    }

}
