package model;

import java.util.ArrayList;
import java.util.List;

public class NivelEstudo {

    private String nomeNivel;
    private List<Tarefa> listaTarefas = new ArrayList<>();
    public NivelEstudo(String nomeNivel) {
        this.nomeNivel = nomeNivel;
        carregarTrilha();
    }

    private void carregarTrilha() {

        if (nomeNivel.equalsIgnoreCase("Básico")) {

            listaTarefas.add(new Tarefa("Fundamentos da linguagem (conceito e funcionamento)"));
            listaTarefas.add(new Tarefa("Ambiente de desenvolvimento (JDK e IDE)"));
            listaTarefas.add(new Tarefa("Estrutura de um programa (classe e método main)"));

            listaTarefas.add(new Tarefa("Variáveis e tipos de dados (int, double, boolean, char, String)"));
            listaTarefas.add(new Tarefa("Operadores (aritméticos, comparação, lógicos)"));

            listaTarefas.add(new Tarefa("Estruturas condicionais (if, else, switch)"));
            listaTarefas.add(new Tarefa("Laços de repetição (for, while, do-while)"));

            listaTarefas.add(new Tarefa("Métodos (criação, parâmetros e retorno)"));

            listaTarefas.add(new Tarefa("Arrays (armazenamento de múltiplos valores)"));
            listaTarefas.add(new Tarefa("Laços de repetição com arrays"));

            listaTarefas.add(new Tarefa("Exercícios práticos (lógica e problemas simples)"));
        }

        else if (nomeNivel.equalsIgnoreCase("Intermediário")) {

            listaTarefas.add(new Tarefa("Programação orientada a objetos (conceitos principais)"));
            listaTarefas.add(new Tarefa("Classes e objetos"));

            listaTarefas.add(new Tarefa("Encapsulamento (getters e setters)"));
            listaTarefas.add(new Tarefa("Construtores"));

            listaTarefas.add(new Tarefa("Herança"));
            listaTarefas.add(new Tarefa("Polimorfismo"));

            listaTarefas.add(new Tarefa("Abstração (classes abstratas)"));
            listaTarefas.add(new Tarefa("Interfaces"));

            listaTarefas.add(new Tarefa("Collections (List, Set, Map)"));

            listaTarefas.add(new Tarefa("Tratamento de exceções (try/catch)"));

            listaTarefas.add(new Tarefa("Manipulação de arquivos (leitura e escrita)"));

            listaTarefas.add(new Tarefa("Organização de projeto (pacotes e camadas)"));

            listaTarefas.add(new Tarefa("Projeto prático (sistema em console)"));
        }

        else if (nomeNivel.equalsIgnoreCase("Avançado")) {

            listaTarefas.add(new Tarefa("Banco de dados (conceitos básicos)"));
            listaTarefas.add(new Tarefa("SQL (SELECT, INSERT, UPDATE, DELETE)"));

            listaTarefas.add(new Tarefa("Integração com banco (conexão da aplicação)"));
            listaTarefas.add(new Tarefa("CRUD completo"));

            listaTarefas.add(new Tarefa("APIs (conceito e funcionamento)"));
            listaTarefas.add(new Tarefa("Requisições HTTP (GET, POST, PUT, DELETE)"));

            listaTarefas.add(new Tarefa("Spring Boot (estrutura da aplicação)"));
            listaTarefas.add(new Tarefa("Camadas da aplicação (controller, service)"));

            listaTarefas.add(new Tarefa("Injeção de dependência"));

            listaTarefas.add(new Tarefa("JSON (troca de dados)"));

            listaTarefas.add(new Tarefa("Persistência com JPA/Hibernate"));
            listaTarefas.add(new Tarefa("Relacionamentos entre entidades"));

            listaTarefas.add(new Tarefa("Testes automatizados (JUnit)"));
            listaTarefas.add(new Tarefa("Boas práticas (clean code)"));

            listaTarefas.add(new Tarefa("Controle de versão (Git)"));
            listaTarefas.add(new Tarefa("Publicação de código (GitHub)"));

            listaTarefas.add(new Tarefa("Documentação de API"));

            listaTarefas.add(new Tarefa("Segurança (autenticação básica)"));

            listaTarefas.add(new Tarefa("Deploy de aplicação"));

            listaTarefas.add(new Tarefa("Projeto profissional (API completa para portfólio)"));
        }
    }

    public void listarTarefas() {
        for (int i = 0; i < listaTarefas.size(); i++) {
            Tarefa t = listaTarefas.get(i);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println((i + 1) + " - " + t.getNome());
            System.out.println("Status: " + t.getStatus());
        }
    }

    public void mostrarTrilha() {

        for (int i = 0; i < listaTarefas.size(); i++) {
            Tarefa t = listaTarefas.get(i);
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println((i + 1) + " - " + t.getNome());
        }
    }

    public boolean concluirTarefa(int index) {
        if (index >= 0 && index < listaTarefas.size()) {
            listaTarefas.get(index).concluir();
            return true;
        }
        else {
            return false;
        }
    }

    public String getNome() {
        return nomeNivel;
    }
}