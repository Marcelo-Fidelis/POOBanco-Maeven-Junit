package com.marcelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContasTeste {
	
	@Test
	void verificarInstanciamentoObjeto(){
		ContaRegular conta = new ContaRegular("Marcelo","ab8w8@$1",2000.0);
		ContaPremium contaPA = new ContaPremium("Zuleide","ab8w8@$1", 5000.0, 235135);
		Assertions.assertNotNull(conta);
	}
	
	@Test
	void verificarSettersGetters(){
		ContaRegular conta = new ContaRegular("Marcelo","ab8w8@$1", 2000.0);
		Assertions.assertEquals("Marcelo", conta.getTitular());
		Assertions.assertEquals(2000.0, conta.getSaldo());
		conta.setSaldo(500.00);
		conta.setTitular("Joaquim");
		Assertions.assertEquals(500.0, conta.getSaldo());
		Assertions.assertEquals("Joaquim", conta.getTitular());
		ContaPremium contaPA = new ContaPremium("Garcia","ab8w8@$1", 10000.0,412947);
		Assertions.assertEquals(10000.0, contaPA.getSaldo());
		Assertions.assertEquals("Garcia", contaPA.getTitular());
		Assertions.assertEquals(412947, contaPA.getNumeroverificacao());
	}
	
	@Test
	void verficarSaque() {
		ContaRegular conta = new ContaRegular("Marcelo","ab8w8@$1", 2000.0);
		Assertions.assertEquals(2000.0, conta.getSaldo());
		conta.saque(500.0);
		Assertions.assertEquals(1500.0, conta.getSaldo());
	}
	
	@Test
	void verficarDeposito() {
		ContaRegular conta = new ContaRegular("Marcelo","ab8w8@$1", 2000.0);
		conta.deposito(500.0);
		Assertions.assertEquals(2500.0, conta.getSaldo());
	}
	
	@Test
	void verificarTransferencia() {
		
		//Transferir dinheiro da contaA para contaB
		ContaRegular contaA = new ContaRegular("Marcelo","ab8w8@$1", 2000.0);
		ContaRegular contaB = new ContaRegular("Patrick","ab8w8@$1", 500.0);
		contaA.transferir(500.0, contaB);
		Assertions.assertEquals(1000.0, contaB.getSaldo());
		Assertions.assertEquals(1500.0, contaA.getSaldo());
		
		//Transferir dinheiro da contaB para contaA
		contaB.transferir(200.0, contaA);
		Assertions.assertEquals(1700.0,contaA.getSaldo());
		Assertions.assertEquals(800.0,contaB.getSaldo());
		
		//Transferir dinheiro de uma conta normal para uma premium
		ContaPremium contaPA = new ContaPremium("Garcia","ab8w8@$1", 10000.0,412947);
		contaA.transferir(700.0, contaPA);
		Assertions.assertEquals(10700.0,contaPA.getSaldo());
		
		//Transferir dinheiro de uma conta premium para uma normal
		contaPA.transferir(700.0, contaA);
		Assertions.assertEquals(10000.0,contaPA.getSaldo());
		Assertions.assertEquals(1700.0,contaA.getSaldo());
		
	}
	
	
	
	

}
