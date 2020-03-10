package br.com.wcc.model;

public class Circulo implements Shape{

    private final Double raio;
 
    public Circulo (Double raio){
        this.raio = raio;
    }

    @Override
    public Double getArea() {
         return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public Double getPerimetro() {
        return 2 * Math.PI * raio;
    }

 

}