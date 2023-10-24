package br.senai.sp.Model;

public class Exibir {

    public void ExibirTriangulo(Triangulo objTriangulo){

        System.out.println("-----Print------");
        System.out.println("Base:" + objTriangulo.base);
        System.out.println("Altura:" + objTriangulo.altura);
        System.out.println("Área:" + objTriangulo.area);

    }

    public void ExibirCirculo(Circulo objCirculo){

        System.out.println("-----Print------");
        System.out.println("Raio:" + objCirculo.raio);
        System.out.println("Perimetro:" + objCirculo.perimetro);
        System.out.println("Área:" + objCirculo.area);

    }

    public void ExibirRetangulo(Retangulo objRetangulo){

        System.out.println("-----Print------");
        System.out.println("Lado1:" + objRetangulo.lado1);
        System.out.println("Lado2:" + objRetangulo.lado2);
        System.out.println("Área:" + objRetangulo.area);
        System.out.println("Perimetro:" + objRetangulo.perimetro);

    }

    public void ExibirQuadrado(Quadrado objQuadrado){

        System.out.println("-----Print------");
        System.out.println("Lado1:" + objQuadrado.lado1);
        System.out.println("Perimetro:" + objQuadrado.perimetro);
        System.out.println("Área:" + objQuadrado.area);

    }


}
