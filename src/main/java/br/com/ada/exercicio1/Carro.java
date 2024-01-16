package br.com.ada.exercicio1;

public class Carro implements Veiculo, VeiculoMotorizado {
    @Override
    public void ligar() {
        System.out.println("Carro ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligando");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Carro acelerando " + velocidade);
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }
}
