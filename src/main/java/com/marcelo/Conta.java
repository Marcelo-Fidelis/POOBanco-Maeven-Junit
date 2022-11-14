package com.marcelo;


/**
 * Importancia de colcoar algumas superclass em abstract. Nos testes, me descuidei
 * e estava fazendo referencia a esta classe e não a uma subClass. Logo, se não for
 * instanciar um objeto da mesma é preferível denotá-la como abstract.
 * @author marcelo
 *
 */

public abstract class Conta implements Contas{
	private String titular;
	private String senha;
	private Double saldo;
	
	
	Conta(String titular, String senha, Double saldoInicial){
		this.titular = titular;
		this.senha = senha;
		this.saldo = saldoInicial;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public void deposito(Double valor) {
		this.saldo += valor;
	}

	@Override
	public void saque(Double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente para realizar tal operação");
		}
		
		
	}

	@Override
	public void transferir(Double valor, Object conta) {
		if(valor <= this.saldo) {
			
			Double total = ((Conta)conta).getSaldo() + valor;
			this.saldo -= valor;
			((Conta) conta).setSaldo(total);
		}else {
			System.out.println("Saldo insuficiente para realizar tal operação");
		}
		
	}
	
	

	
}
