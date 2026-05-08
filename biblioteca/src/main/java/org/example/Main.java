package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cenário 1 – Empréstimo normal
        System.out.println("Cenario 1 – Emprestimo normal");
        Livro tccAlan = new Livro("Nova Abordagem para viabilizar analises pan-genomicas a partir de genomas nao finalizados.", 2017);
        Usuario tassio = new Usuario("Tassio Carvalho", "992.231.876-87", "91992399");

        tassio.pegarEmprestado(tccAlan);
        System.out.println(tccAlan.isDisponivel());




        //Cenário 2 – Tentativa de pegar item indisponível
        System.out.println("Cenario 2 – Tentativa de pegar item indisponivel");
        Usuario tawan = new Usuario("Tawan Professor de Psicologia", "104.185.481-41", "52552415214");
        tawan.pegarEmprestado(tccAlan);


        //Cenário 3 – Limite de itens
        System.out.println("//Cenario 3 – Limite de itens");
        Revista artigoAllan = new Revista("Artigo do Allan na revista", 2006);
        DVD formaturaAllan = new DVD("Formatura do Allan", 1888);
        Livro cleanCode = new Livro("Clean Code", 2007);
        tassio.pegarEmprestado(formaturaAllan);
        tassio.pegarEmprestado(artigoAllan);
        tassio.pegarEmprestado(cleanCode);

        // metodo pra ver todos os itens do tassio
        tassio.verItens();


        //Cenário 4 – Cálculo polimórfico de multa
        System.out.println("Cenario 4 – Calculo polimorfico de multa");
        System.out.println(tassio.devolverItem(tccAlan.getCodigo(), 5));
        System.out.println(tassio.devolverItem(formaturaAllan.getCodigo(), 10));
        System.out.println(tassio.devolverItem(artigoAllan.getCodigo(), 366));

        //Cenário 5 – Validação de encapsulamento
        System.out.println("Cenario 5 – Validação de encapsulamento");
        //deixamos o erro para provar do encapsulamento
        //ttcAlan.disponivel = true;

        Livro livroArcaico = new Livro("Pai do Allan", 1200);


    }
}