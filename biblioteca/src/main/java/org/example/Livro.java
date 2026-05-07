package org.example;

public class Livro extends ItemBiblioteca{

    public Livro(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }
}