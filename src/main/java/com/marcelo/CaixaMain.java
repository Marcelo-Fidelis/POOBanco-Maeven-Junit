package com.marcelo;

import java.util.Scanner;

public class CaixaMain {

	public static void main(String[] args) {
		
		
		
		
		//para fins de simplificação, considerando 2 contas já abertas
		
		Object contaB = Banco.criarConta("Ana","ab8w8@$1",1800.0);
		Object contaPB = Banco.criarConta("Josias","ab8w8@$1", 6000.0,325235);
		
		
		

	}
	
	public static void menuInicial() {
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
					+ "\n2 - Entrar em uma conta"
					+ "\n3 - Sair da Aplicação");
			escolha = input.nextInt();
			switch(escolha) {
			case 0:
				System.out.print("Por favor, digite o nome do titular: ");
				titularRegular = input.nextLine();				
				System.out.print("Por favor, digite uma senha: ");
				senha = input.nextLine();
				System.out.print("Por favor, Digite o saldo inicial: ");
				saldoInicial = input.nextDouble();
				criarConta(titularRegular,senha,saldoInicial);
				System.out.println("Operação realizada com sucesso!");
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
				criarConta(titularPremium,senha,saldoInicial,numeroVerificacao);
				System.out.println("Operação realizada com sucesso!");
				break;
			case 2:
				break;
				
			}
			
			
			
		}while(loop);
	}
	
	public static Object criarConta(String titular,String senha, Double saldoInicial) {
		Object contaA = Banco.criarConta(titular, senha, saldoInicial);
		return contaA;
	}
	
	public static Object criarConta(String titular,String senha, Double saldoInicial, int numVerificacao) {
		Object contaPA = Banco.criarConta(titular, senha, saldoInicial);
		return contaPA;
	}

}
