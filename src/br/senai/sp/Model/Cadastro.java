package br.senai.sp.Model;


import java.util.Scanner;

public class Cadastro {

    /** Instanciar cadastro */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Geral */
    Triangulo objTriangulo = new Triangulo();
    Quadrado objQuadrado = new Quadrado();
    Circulo objCirculo = new Circulo();
    Retangulo objRetangulo = new Retangulo();

    public Triangulo CadastrarTriangulo(){
        System.out.println("Triângulo");
        System.out.println("Informe a Base: ");
        objTriangulo.base = teclado.nextDouble();
        System.out.println("Informe a Altura: ");
        objTriangulo.altura = teclado.nextDouble();

        return objTriangulo;

    }

    public Quadrado CadastrarQuadrado(){
        System.out.println("Quadrado");
        System.out.println("Informe o lado1: ");
        objQuadrado.lado1 = teclado.nextDouble();


        return objQuadrado;

    }

    public Circulo CadastrarCirculo(){
        System.out.println("Circulo");
        System.out.println("Informe o Raio: ");
        objCirculo.raio = teclado.nextDouble();


        return objCirculo;

    }

    public Retangulo CadastrarRetangulo(){
        System.out.println("Retangulo");
        System.out.println("Informe o Lado1: ");
        objRetangulo.lado1 = teclado.nextDouble();
        System.out.println("Informe o Lado2: ");
        objRetangulo.lado2 = teclado.nextDouble();

        return objRetangulo;

    }

}