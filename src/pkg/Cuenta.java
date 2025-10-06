package pkg;

public class Cuenta {
	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(double i) {
		// TODO Auto-generated constructor stub
		this.saldo = i;
	}

	public Cuenta(String numero, String titular, Double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(int i) {
		// TODO Auto-generated method stub
		this.saldo = 500.0;
		
	}

	public void retirar(int i) {
		// TODO Auto-generated method stub
		this.saldo = -500.0;
	}

}
