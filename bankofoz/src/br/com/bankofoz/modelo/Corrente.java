package br.com.bankofoz.modelo;

import br.com.bankofoz.interfaces.PadraoConta;

public class Corrente extends Conta implements PadraoConta {


	
private float limite;
private float taxa;




public void aumentarLimite(float porc) {
	limite =  (limite + limite*(porc/100));
}

public void debitarTaxa() {
	super.setSaldo (super.getSaldo()-taxa);
}


public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
	super.setAll(numero, digito, agencia, saldo, cliente);
	this.limite = limite;
	this.taxa = taxa;
}
@Override
public String toString() {
	return "Corrente [limite=" + limite + ", taxa=" + taxa + super.toString() + "]";
}
public Corrente() {
	super();
}
public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
	super(numero, digito, agencia, saldo, cliente);
	this.limite = limite;
	this.taxa = taxa;
}
public float getLimite() {
	return limite;
}
public void setLimite(float limite) {
	this.limite = limite;
}
public float getTaxa() {
	return taxa;
}
public void setTaxa(float taxa) {
	this.taxa = taxa;
}

@Override
public boolean sacar(float param1) {
	if (param1>(getSaldo()+limite)) {
		return false;
	}
	setSaldo(getSaldo()-param1);
	return true;
}

@Override
public boolean depositar(float param1) {
	if(param1 <=0) {
		return false;
	}
	setSaldo (param1+getSaldo());
	return true;
}

public float  verificarSaldo() {
	return super.getSaldo() + limite;
}
	
	
	
	
	
	
}
