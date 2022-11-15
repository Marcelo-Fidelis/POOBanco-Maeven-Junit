package com.marcelo;

import java.util.Scanner;

/**
 * Futuramente procurarei usar serializables, mas o código é apenas para mexer e estudar;
 * @author marcelo
 *
 */

public class CaixaMain {

	public static void main(String[] args) {
		
		
		//para fins de simplificação, considerando 2 contas já abertas
		
		
		

		Scanner input = new Scanner(System.in);
		String titularPremium;
		String titularRegular;
		String senha;
		Double saldoInicial;
		boolean loop = true;
		int numeroVerificacao;
		int escolha;
		
		

		do {
			
			System.out.print("Boas vindas. Este é o menu de escolhas:"
					+ "\n0 - Criar uma conta regular"
					+ "\n1 - Criar uma conta Premium"
					+ "\n2 - Sair da Aplicação"
					+ ": ");
			escolha = input.nextInt();
			switch(escolha) {
			case 0:
				input = new Scanner(System.in);
				System.out.print("Por favor, digite o nome do titular: ");
				titularRegular = input.nextLine();				
				System.out.print("Por favor, digite uma senha: ");
				senha = input.nextLine();
				System.out.print("Por favor, Digite o saldo inicial: ");
				input = new Scanner(System.in);
				saldoInicial = input.nextDouble();
				Object contaA = criarConta(titularRegular,senha,saldoInicial);
				System.out.println("Operação realizada com sucesso!");
				menuConta(contaA);
				break;
			case 1:
				System.out.print("Por favor, digite o nome do titular: ");
				titularPremium = input.nextLine();				
				System.out.print("Por favor, digite uma senha: ");
				senha = input.nextLine();
				System.out.print("Por favor, Digite o numero de verificação");
				numeroVerificacao = input.nextInt();
				System.out.print("Por favor, Digite o saldo inicial: ");
				saldoInicial = input.nextDouble();
				Object contaPA = criarConta(titularPremium,senha,saldoInicial,numeroVerificacao);
				System.out.println("Operação realizada com sucesso!");
				menuConta(contaPA);
				break;
			case 2:
				loop = false;
				break;
				
			}
					
			
		}while(loop);
	}
	
	public static void menuInicial() {
	}
	
	public static Object criarConta(String titular,String senha, Double saldoInicial) {
		Object contaA = Banco.criarConta(titular, senha, saldoInicial);
		return contaA;
	}
	
	public static Object criarConta(String titular,String senha, Double saldoInicial, int numVerificacao) {
		Object contaPA = Banco.criarConta(titular, senha, saldoInicial);
		return contaPA;
	}
	
	public static void menuConta(Object conta) {
		String contaEscolhida;
		Double quantia;
		Scanner input = new Scanner(System.in);
		int escolha;
		boolean loop = true;
		Object contaA = conta;
		Object contaB = Banco.criarConta("Ana","ab8w8@$1",1800.0);
		Object contaPB = Banco.criarConta("Josias","ab8w8@$1", 6000.0,325235);
		
		do {
			
			System.out.println("Boas Vindas ao menu da conta, escolha uma opção:"
					+ "\n0 - depósito"
					+ "\n1 - saque"
					+ "\n2 - transferencia "
					+ "\n3 - finalizar aplicação");
			escolha = input.nextInt();
			
			switch(escolha) {
			case 0:
				
				System.out.print("Digite o quanto deseja depositar: ");
				quantia = input.nextDouble();
				Banco.deposito(quantia, contaA);
				break;
			
			case 1:
				System.out.print("Digite o quanto deseja sacar: ");
				quantia = input.nextDouble();
				Banco.saque(quantia, contaA);
				break;
			
			case 2:
				System.out.print("Digite para qual conta deseja transferir: ");
				contaEscolhida = input.nextLine();
				System.out.print("Digite o valor a ser transferido: ");
				quantia = input.nextDouble();
				
				if (contaEscolhida.equals("contaB")){
					Banco.transferirDinheiro(quantia, contaA, contaB);
					System.out.println("Transferencia realizada com sucesso!");
				}else if(contaEscolhida.equalsIgnoreCase("ContaPB")){
					Banco.transferirDinheiro(quantia, contaA, contaPB);
					System.out.println("Transferencia realizada com sucesso!");
				}else {
					System.out.println("Conta inválida!");
				}
				break;
			case 3:
				System.out.println("Finalizando aplicação");
				loop = false;
				
				
			}
			
			
		}while(loop);
		
	}

	

	

}
