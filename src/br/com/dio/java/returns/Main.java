package br.com.dio.java.returns;

import br.com.dio.java.Sobrecarga.Quadrilatero;

public class Main {
    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercicio de retornos");

        double areaQuadrado = QuadrilateroReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroReturn.area(5d, 5d);
        System.out.println("Área do retãmgulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroReturn.area(7, 8, 12);
        System.out.println("Área do Trapézio: " + areaTrapezio);

        double areaLosango = QuadrilateroReturn.area(5f,5f);
        System.out.println("Área do losango: " + areaLosango);


    }
}
