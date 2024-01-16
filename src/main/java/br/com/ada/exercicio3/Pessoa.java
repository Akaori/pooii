package br.com.ada.exercicio3;

public record Pessoa(long id, String nome) implements Identificavel<Long> {
    @Override
    public Long getId() {
        return this.id;
    }
}
