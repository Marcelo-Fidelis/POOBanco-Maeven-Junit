package com.marcelo;

/**
 * Toda os tipos de contas precisam ter a capacidade de deposito, saque, transferencia.
 * @author marcelo
 *
 */

public interface Contas {
	
	
	public abstract void deposito(Double valor);
	public abstract void saque(Double valor);
	public abstract void transferir(Double valor, Object conta);
	

}
