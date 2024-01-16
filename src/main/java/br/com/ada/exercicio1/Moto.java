package br.com.ada.exercicio1;

public class Moto implements Veiculo, VeiculoMotorizado {
    @Override
    public void ligar() {
        System.out.println("Moto ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligando");
    }

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Moto acelerando " + velocidade);
    }

    @Override
    public void frear() {
        System.out.println("Moto freando");
    }
}
