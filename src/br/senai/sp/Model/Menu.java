package br.senai.sp.Model;

import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    Cadastro objCadastro = new Cadastro();

    Exibir objExibir = new Exibir();

    public void Menu() {

        System.out.println("Sistema Geometria");
        System.out.println("1- Triângulo");
        System.out.println("2- Círculo");
        System.out.println("3- Retangulp");
        System.out.println("4- Quadrado");
        System.out.println("---------------------");

        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:

                Triangulo objTriangulo = objCadastro.CadastrarTriangulo();
                objTriangulo.CalcularArea();
                objTriangulo.CalcularPerimetro();
                objExibir.ExibirTriangulo(objTriangulo);
                break;


            case 2:

                Circulo objCirculo = objCadastro.CadastrarCirculo();
                objCirculo.CalcularArea();
                objCirculo.CalcularPerimetro();
                objExibir.ExibirCirculo(objCirculo);
                break;


            case 3:

                Retangulo objRetangulo = objCadastro.CadastrarRetangulo();
                objRetangulo.CalcularArea();
                objRetangulo.CalcularPerimetro();
                objExibir.ExibirRetangulo(objRetangulo);
                break;


            case 4:

                Quadrado objQuadrado = objCadastro.CadastrarQuadrado();
                objQuadrado.CalcularArea();
                objQuadrado.CalcularPerimetro();
                objExibir.ExibirQuadrado(objQuadrado);
                break;
        }
    }
}