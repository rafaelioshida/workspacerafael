package br.com.bankofoz.modelo;

import br.com.bankofoz.interfaces.PadraoConta;

public class Poupanca extends Conta implements PadraoConta{

	private float rendimento;
	
	


	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [rendimento=" + rendimento + ", conta = " + super.toString() + "]";
	}

	public Poupanca() {
		super();
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}

	@Override
	public boolean sacar(float param1) {
		if (param1>super.getSaldo()) {
			return false;
		}
		super.setSaldo(super.getSaldo()-param1);
		return true;
		
		
		
		
	}

	@Override
	public boolean depositar (float param1) {
		if(param1 <=0) {
			return false;
		}
		setSaldo (param1+getSaldo());
		return true;
	}
	
	
	
	
	public void creditarRendimentos() {
		super.setSaldo(super.getSaldo()+ super.getSaldo()*(rendimento/100));
	}
	
	
	public float  verificarSaldo() {
		return super.getSaldo();
	}
	
	
	
	
	
	
}
