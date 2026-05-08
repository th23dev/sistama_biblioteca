package org.example;

public class Main {
    public static void main(String[] args) {
        // Alunos: Raffael Thauã da Silva Lima
        //         Lucas Correa Marinheiro
        //         Glauber Willer da Silva e Silva
        //         Railton José de Sousa Azevedo
        //         Luiz Gustavo Damasceno Sofiatti

        Livro bobbieGoodies = new Livro("bobbie Goodies", 2025);

        DVD formaturaAllan = new DVD("Formatura do Allan", 1970);
        DVD formaturaTassio = new DVD("Formatura do Tassio", 2003);

        Revista artigoTassio = new Revista("Arquitetura com Suporte a Predicao de QoE e Mobilidade para Aplicacoes de Video em Redes Sem Fio Heterogeneas", 2012);


        System.out.println("\nCenario 1: Emprestimo normal\n");

        Livro tccAllan = new Livro("Nova Abordagem para viabilizar analises pan-genomicas a partir de genomas nao finalizados", 2017);
        Usuario allan = new Usuario("Allan Veras","000.000.002-00", "9102404033");
        allan.pegarEmprestado(tccAllan);
        if(!tccAllan.isDisponivel()){
            System.out.println("Indisponivel!");
        }

        System.out.println("\nCenario 2: Tentativa de pegar item indisponivel\n");
        Usuario tassio = new Usuario("Tassio Carvalho","000.000.120-00", "9102404033");
        tassio.pegarEmprestado(tccAllan);

        System.out.println("\nCenario 3: Limite de itens\n");
        Usuario jailton = new Usuario("Jose jailton", "000.000.001-00", "9102404033");

        jailton.pegarEmprestado(bobbieGoodies);
        jailton.pegarEmprestado(formaturaAllan);
        jailton.pegarEmprestado(artigoTassio);
        jailton.pegarEmprestado(formaturaTassio);

        // Apenas um capricho para mostrar que o quarto item nao foi adicionado
        System.out.println("\nHistorico de emprestimos de " + jailton.getNome());
        jailton.listarEmprestimos();

        System.out.println("\nCenario 4: Calculo polimorfico de multa\n");

        System.out.println(bobbieGoodies.getTitulo()+ " Devolvido - " + "Multa: R$" + jailton.devolverItem(bobbieGoodies.getCodigo(), 5));
        System.out.println(formaturaAllan.getTitulo()+ " Devolvido - " + "Multa: R$" + jailton.devolverItem(formaturaAllan.getCodigo(), 10));
        System.out.println(artigoTassio.getTitulo()+ " Devolvido - " + "Multa: R$" + jailton.devolverItem(artigoTassio.getCodigo(), 50));


        System.out.println("\nCenario 5: Validacao de encapsulamento\n");

        // deixamos comentado para não ocorrer nenhum erro de execução
        //tccAllan.titulo = "Teste de mudanca";
        //formaturaAllan.anoPublicacao = 2026;
        //artigoTassio.titulo = "Nao vai mudar";

        Livro livroArcaico = new Livro("Biografia do Allan", 1200);
    }
}