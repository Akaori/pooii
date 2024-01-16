package br.com.ada.exercicio1;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("Biclicleta acelerando " + velocidade);
    }

    @Override
    public void frear() {
        System.out.println("Biclicleta freando");
    }
}
