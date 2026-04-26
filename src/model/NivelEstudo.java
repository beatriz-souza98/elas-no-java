package model;

import java.util.ArrayList;
import java.util.List;

public class NivelEstudo {

    private String nomeNivel;
    private List<Tarefa> listaTarefas = new ArrayList<Tarefa>();

    public NivelEstudo(String nomeNivel, List<Tarefa> listaTarefas) {
        this.nomeNivel = nomeNivel;
        this.listaTarefas = listaTarefas;
    }

    private void carregarTrilha(){

        if (nomeNivel.equalsIgnoreCase("Iniciante")){
        listaTarefas.add(new Tarefa("Lógica de programação (conceitos básicos)"));
            listaTarefas.add(new Tarefa("Variáveis e tipos de dados (int, double, String, boolean)"));
            listaTarefas.add(new Tarefa("Entrada de dados com Scanner"));
            listaTarefas.add(new Tarefa("Operadores matemáticos (+, -, *, /)"));
            listaTarefas.add(new Tarefa("Operadores lógicos (&&, ||, !)"));
            listaTarefas.add(new Tarefa("Estruturas condicionais (if, else)"));
            listaTarefas.add(new Tarefa("Estrutura switch"));
            listaTarefas.add(new Tarefa("Laços de repetição (for, while)"));
            listaTarefas.add(new Tarefa("Criar pequenos exercícios (calculadora, tabuada)"));
    }
        else if (nomeNivel.equalsIgnoreCase("Básico")) {
            listaTarefas.add(new Tarefa("Conceito de Classe e Objeto"));
            listaTarefas.add(new Tarefa("Atributos e Métodos"));
        }
    }
}
