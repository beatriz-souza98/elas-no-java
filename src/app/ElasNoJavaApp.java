package app;

import model.NivelEstudo;
import javax.swing.*;
import java.util.Scanner;

public class ElasNoJavaApp{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NivelEstudo basico = new NivelEstudo("básico");
        NivelEstudo intermediario = new NivelEstudo("intermediário");
        NivelEstudo avancado = new NivelEstudo("avançado");

    System.out.println("====================================");
    System.out.println("   💜 TRILHA DE ESTUDOS JAVA 💜     ");
    System.out.println("   Apoio para mulheres em tecnologia");
    System.out.println("====================================");

    int opcao;

    do {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("1 - Básico");
        System.out.println("2 - Intermediário");
        System.out.println("3 - Avançado");
        System.out.println("4 - Sair");
        System.out.print("Escolha: ");

        opcao = scanner.nextInt();

        switch (opcao){
            case 1 -> menu(scanner, basico);
            case 2 -> menu(scanner, intermediario);
            case 3 -> menu(scanner, avancado);
            case 4 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida!");
        }
    }
    while (opcao != 4);

        scanner.close();
}

private static void menu(Scanner scanner, NivelEstudo nivel) {

    int op;

    do {
        System.out.println("\n📚 " + nivel.getNome().toUpperCase());
        System.out.println("1 - Ver trilha");
        System.out.println("2 - Concluir tarefa");
        System.out.println("3 - Voltar");
        System.out.print("Escolha: ");

        op = scanner.nextInt();

        switch (op) {
            case 1 -> nivel.mostrarTrilha();
            case 2 -> {
                System.out.println("Escolha o tema: ");
                System.out.println("Ou digite 0 para voltar");
                nivel.listarTarefas();
                int index = scanner.nextInt();
                nivel.concluirTarefa(index);

                if (index != 0) {
                    nivel.concluirTarefa(index);
                }
            }
        }
    }
        while (op != 3) ;
    }
}