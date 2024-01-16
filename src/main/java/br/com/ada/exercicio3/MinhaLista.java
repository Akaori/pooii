package br.com.ada.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends Identificavel<U>, U> {
    private final List<T> lista;

    public MinhaLista() {
        this.lista = new ArrayList<>();
    }

    public void adicionar(T elemento) {
        this.lista.add(elemento);
    }

    public T obter(int indice) {
        return this.lista.get(indice);
    }

    public int indice(U identificador) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i).getId().equals(identificador)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T elemento) {
        for (T el: this.lista) {
            if (el.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

}
