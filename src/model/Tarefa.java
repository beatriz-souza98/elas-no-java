package model;

public class Tarefa {

    private String nome;
    private boolean concluida;

    public Tarefa(String nome) {
        this.nome = nome;
        this.concluida = false;
    }

    public void concluir(){
        this.concluida = true;
    }

    public String getNome(){
        return nome;
    }

    public boolean isConcluida( ){
        return concluida;
    }

    public String getStatus(){
        return concluida ? "Concluida" : "Pendente";
    }
}
