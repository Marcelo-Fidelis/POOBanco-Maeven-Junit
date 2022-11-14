package com.marcelo;

public class ContaPremium extends Conta {
	
	private int numeroVerificacao;
	
	ContaPremium(String titular, String senha,Double saldoInicial, int numVerificacao) {
		
		super(titular, senha, saldoInicial);
		this.numeroVerificacao = numVerificacao;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return super.getTitular();
	}

	@Override
	public void setTitular(String titular) {
		// TODO Auto-generated method stub
		super.setTitular(titular);
	}

	@Override
	public void setSaldo(Double saldo) {
		// TODO Auto-generated method stub
		super.setSaldo(saldo);
	}

	@Override
	public Double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}

	@Override
	public void deposito(Double valor) {
		// TODO Auto-generated method stub
		super.deposito(valor);
	}

	@Override
	public void saque(Double valor) {
		// TODO Auto-generated method stub
		super.saque(valor);
	}

	@Override
	public void transferir(Double valor, Object conta) {
		// TODO Auto-generated method stub
		super.transferir(valor, conta);
	}
	
	public int getNumeroverificacao() {
		return this.numeroVerificacao;
	}
	
	
	public void emprestimoEspecial(Double valor) {
		this.setSaldo(this.getSaldo() + valor);
		
	}

}
