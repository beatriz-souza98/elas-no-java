package model;

import service.MotivacaoService;
import java.util.ArrayList;
import java.util.List;

public class NivelEstudo {

    private String nomeNivel;
    private List<Tarefa> listaTarefas = new ArrayList<Tarefa>();
    private MotivacaoService motivacao = new MotivacaoService();
    public NivelEstudo(String nomeNivel) {
        this.nomeNivel = nomeNivel;
        this.listaTarefas = listaTarefas;
        carregarTrilha();
    }

    private void carregarTrilha() {

        if (nomeNivel.equalsIgnoreCase("Básico")) {
            listaTarefas.add(new Tarefa("Lógica de programação (conceitos básicos)"));
            listaTarefas.add(new Tarefa("Variáveis e tipos de dados (int, double, String, boolean)"));
            listaTarefas.add(new Tarefa("Entrada de dados com Scanner"));
            listaTarefas.add(new Tarefa("Operadores matemáticos (+, -, *, /)"));
            listaTarefas.add(new Tarefa("Operadores lógicos (&&, ||, !)"));
            listaTarefas.add(new Tarefa("Estruturas condicionais (if, else)"));
            listaTarefas.add(new Tarefa("Estrutura switch"));
            listaTarefas.add(new Tarefa("Laços de repetição (for, while)"));
            listaTarefas.add(new Tarefa("Criar pequenos exercícios (calculadora, tabuada)"));
        } else if (nomeNivel.equalsIgnoreCase("Intermédiario")) {
            listaTarefas.add(new Tarefa("Conceito de Classe e Objeto"));
            listaTarefas.add(new Tarefa("Atributos e Métodos"));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
        } else if (nomeNivel.equalsIgnoreCase("Avançado")) {
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
            listaTarefas.add(new Tarefa(""));
        }
    }

    public void setListaTarefas() {
        for (int i = 0; i < listaTarefas.size(); i++) {
            Tarefa t = listaTarefas.get(i);
            System.out.println("--------------------------------");
            System.out.println(i + " - " + t.getNome());
            System.out.println("Status: " + t.getStatus());
        }
    }

    public void concluirTarefa(int index) {
        if (index >= 0 && index < listaTarefas.size()) {
            listaTarefas.get(index).concluir();
            System.out.println("\n✔ Tarefa concluída com sucesso!");
            System.out.println(motivacao.proximaFrase());
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public String getNome() {
        return nomeNivel;
    }
}
