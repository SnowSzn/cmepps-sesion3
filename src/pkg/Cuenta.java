package pkg;

import java.util.ArrayList;

public class Cuenta {
	String numero;
	String titular;
	double saldo;
	ArrayList<Movimiento> movimientos;

	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.movimientos = new ArrayList<Movimiento>();
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public void limpiar() {
		this.saldo = 0;
	}

	public void ingresar(double i) {
		this.saldo += i;
		
	}

	public void retirar(double i) {
		this.saldo -= i;
	}
}
