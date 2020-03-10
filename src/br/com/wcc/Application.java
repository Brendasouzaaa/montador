package br.com.wcc;

import br.com.wcc.model.Circulo;
import br.com.wcc.model.Retangulo;
import br.com.wcc.model.Quadrado;

public class Application {

    public static void main(String [] args) {
        Circulo circ1 = new Circulo (1d);
        Circulo circ2 = new Circulo (2d);

    // Print do circulo

        System.out.printf("Circulo1- area: %.2f Perimetro: %.2f "+
        circ1.getArea(), circ1.getPerimetro());

        System.out.println("Circulo2-: area: " + circ2.getArea()
        + " Perimetro: "+ circ2.getPerimetro());

        Retangulo ret1 = new Retangulo(2d, 4d);
        Retangulo ret2 = new Retangulo(1d, 2d);

    // Print do retangulo

        System.out.println("Retangulo1- area: " + ret1.getArea()
        + " Perimetro: "+ ret1.getPerimetro());

        System.out.println("Retangulo2- area: " + ret2.getArea()
        + " Perimetro: "+ ret2.getPerimetro());

        Quadrado quad1 = new Quadrado(2d, 4d);
        Quadrado quad2 = new Quadrado(1d, 2d);

    // Print do retangulo

        System.out.println("Quadrado1- area: " + ret1.getArea()
        + " Perimetro: "+ quad1.getPerimetro());

        System.out.println("Retangulo2- area: " + ret2.getArea()
        + " Perimetro: "+ quad2.getPerimetro());
    }
}