package org.example;
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String cpf;
    private String telefone;
    private ArrayList<ItemBiblioteca> itens = new ArrayList<>();

    public Usuario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public boolean pegarEmprestado(ItemBiblioteca item){
        if(item.isDisponivel()){
            if(itens.size() < 3){
                itens.add(item);
                return item.emprestar();
            }else{
                System.out.println("Voce atingiu o limite de 3 emprestimos.");
                return false;
            }
        }else{
            System.out.println(item.getTitulo() + " esta indisponivel.");
            return false;
        }
    }


    public void listarEmprestimos() {
        for (ItemBiblioteca item : itens){
            System.out.println(item.getCodigo() + " - " + item.getTitulo());
        }
    }

    public double devolverItem(String codigoItem,int diasAtraso) {
        for (ItemBiblioteca item : itens) {
            if (item.getCodigo().equals(codigoItem)) {
                itens.remove(item);
                item.devolver();
                return item.calcularMulta(diasAtraso);
            }
        }
        System.out.println("Falha ao devolver.");
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
}