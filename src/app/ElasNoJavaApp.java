package app;

import model.NivelEstudo;
import service.MotivacaoService;
import java.util.Scanner;
public class ElasNoJavaApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MotivacaoService motivacao = new MotivacaoService();

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

            switch (opcao) {
                case 1 -> menu(scanner, basico, motivacao);
                case 2 -> menu(scanner, intermediario, motivacao);
                case 3 -> menu(scanner, avancado, motivacao);
                case 4 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        }
        while (opcao != 4);

        scanner.close();
    }

    private static void menu(Scanner scanner, NivelEstudo nivel, MotivacaoService motivacao) {

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
                    nivel.listarTarefas();
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                    System.out.println("Escolha o numero da tarefa (0 para voltar ao menu)");
                    int index = scanner.nextInt();

                    if (index != 0) {
                        boolean concluida = nivel.concluirTarefa(index - 1);

                        if (concluida) {
                            System.out.println("\n✔ Parabéns, tarefa concluída com sucesso!");
                            System.out.println(motivacao.proximaFrase());
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                }
            }
        }
        while (op != 3);
    }
}
