package org.example;

public class ItemBiblioteca {
    private static int id = 0;

    private String codigo;
    private String titulo;
    private int anoPublicacao;
    private boolean disponivel;

    public ItemBiblioteca( String titulo, int anoPublicacao) {
        id++;
        if(id < 10 && id > 0){
            this.codigo = "LIB-00" + id;
        }else if(id < 100){
            this.codigo = "LIB-0" + id;
        }else if(id > 99){
            this.codigo = "LIB-" + id;
        }

        this.titulo = titulo;

        if(anoPublicacao > 1500 && anoPublicacao <= 2026){
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano invalido");
            this.anoPublicacao = 2026;
        }
        this.disponivel = true;
    }

    public String getCodigo() {
        return codigo;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }


    public boolean emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println(titulo + " emprestado.");
            return true;
        }else{
            System.out.println(titulo + " Indisponivel.");
            return false;
        }
    }

    public void devolver(){
        disponivel = true;
    }

    public double calcularMulta(int diasAtraso){
        return 0;
    }


}
