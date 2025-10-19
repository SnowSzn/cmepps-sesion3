package pkg;

public class Movimiento {
	public static enum Signo {D, H};
	double importe;
	String detalles;
	
	public Movimiento(double importe, String detalles) {
		super();
		this.importe = importe;
		this.detalles = detalles;
	}
	
	public double getImporte() {
		return importe;
	}
	
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public String getDetalles() {
		return detalles;
	}
	
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
}
