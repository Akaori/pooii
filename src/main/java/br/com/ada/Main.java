package br.com.ada;

import br.com.ada.exercicio1.Bicicleta;
import br.com.ada.exercicio1.Carro;
import br.com.ada.exercicio1.Moto;
import br.com.ada.exercicio1.Veiculo;
import br.com.ada.exercicio2.Circulo;
import br.com.ada.exercicio2.Retangulo;
import br.com.ada.exercicio2.Shape;
import br.com.ada.exercicio2.Triangulo;

public class Main {
    public static void main(String[] args) {

        Veiculo bicicleta = new Bicicleta();
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        bicicleta.acelerar(5);
        carro.acelerar(5);
        moto.acelerar(5);

        Shape circulo = new Circulo(3);
        Shape retangulo = new Retangulo(3, 5);
        Shape triangulo = new Triangulo(3,5);

        System.out.println("Área do círculo " + circulo.calcularArea());
        System.out.println("Área do retângulo " + retangulo.calcularArea());
        System.out.println("Área do triângulo " + triangulo.calcularArea());
    }
}