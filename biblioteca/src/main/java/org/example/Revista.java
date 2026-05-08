package org.example;

public class Revista extends ItemBiblioteca{
    public Revista(String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }


    @Override
    public double calcularMulta(int diasAtraso) {
        return 0;
    }
}
