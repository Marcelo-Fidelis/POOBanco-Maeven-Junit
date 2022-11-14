package com.marcelo;

public class ContaRegular extends Conta {

	ContaRegular(String titular, String senha, Double saldoInicial) {
		super(titular, senha, saldoInicial);
		
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
		super.transferir(valor,conta);
	}

	
	
	

}
