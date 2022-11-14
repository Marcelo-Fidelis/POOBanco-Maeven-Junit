package com.marcelo;

/**
 * Itermedia as operações das contas
 * @author marcelo
 *
 */

public class Banco {
	
	// Como o Banco em si não é uma entidade que necessita ser referenciada como Objeto
	//faz mais sentido utilizar staticmethods.
	static Object criarConta(String titular,String senha, Double saldoInicial) {
		ContaRegular contaRegular = new ContaRegular(titular,senha,saldoInicial);
		return contaRegular;
	}
	
	static Object criarConta(String titular,String senha, Double saldoInicial, Integer numVerificacao) {
		ContaPremium contaPremium = new ContaPremium(titular,senha,saldoInicial,numVerificacao);
		return contaPremium;
	}
	
	static void deposito(Double valor, Object conta) {
		((Conta) conta).deposito(valor);
	}
	
	static void saque(Double valor, Object conta) {
		((Conta) conta).saque(valor);
	}
	
	static void transferirDinheiro(Double valor, Object conta) {
		((Conta) conta).transferir(valor, conta);
	}
	
	static void emprestimoEspecial(Double valor, ContaPremium conta) {
		conta.emprestimoEspecial(valor);
	}

}
