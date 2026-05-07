package org.example;

public class ItemBiblioteca {
    protected static int id = 0;

    protected String codigo;
    protected String titulo;
    protected int anoPublicacao;
    protected boolean disponivel;

    public ItemBiblioteca( String titulo, int anoPublicacao) {
        id++;
        if(id < 10){
            this.codigo = "LIB-00" + id;
        }else if(id < 100){
            this.codigo = "LIB-0" + id;
        }else if(id < 1000){
            this.codigo = "LIB-" + id;
        }

        this.titulo = titulo;

        if(anoPublicacao > 1500 && anoPublicacao <= 2026){
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano invalido.");
        }
        this.disponivel = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
            System.out.println("Livro emprestado.");
            return true;
        }else{
            System.out.println("Livro Indisponivel.");
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
