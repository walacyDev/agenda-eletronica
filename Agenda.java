package agenda;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao;
		String[] nome = new String[20];
		String[] data_inicio = new String[20];
		String[] duracao = new String[20];
		int posicao = 0;

		do {
			System.out.printf("%nEscolha a opção: Inserir - Listar - Sair");
			opcao = entrada.nextLine();

			switch (opcao) {
			case "Inserir":
				// Código para Inserir
				String continuar;
				do {
					System.out.print("Digite o Nome: ");
					nome[posicao] = entrada.nextLine();

					System.out.print("Digite a Data: ");
					data_inicio[posicao] = entrada.nextLine();

					System.out.print("Digite a Duração: ");
					duracao[posicao] = entrada.nextLine();

					System.out.print("Deseja continuar o cadastramento? ");
					continuar = entrada.nextLine();

					posicao++;
				} while (continuar.equalsIgnoreCase("Sim"));
				break;

			case "Listar":
				// Código para Listar
				for (int i = 0; i < posicao; i++) {
					System.out.printf("%nNome: " + nome[i] + "%nData de Início do Evento: " + data_inicio[i]
							+ "%nDuração do Evento: " + duracao[i]);
				}
				break;

			case "Sair":
				// Código para Sair
				System.out.println("Programa Finalizado");
				break;

			default:
				// Opção inválida
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}
		} while (!opcao.equals("Sair"));

		entrada.close();
	}
}