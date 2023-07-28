package clases;

import java.util.ArrayList;

public class ComidaCompleja extends Comida {
	private ArrayList<Comida> comidasContenidas;
	
	public ComidaCompleja(String nombre, String tipo, String modoPreparacion, Comida...c) {
		super(nombre,tipo,modoPreparacion);
		this.comidasContenidas = new ArrayList<Comida>();
		for(Comida com: c) {
			this.comidasContenidas.add(com);
		}
	}
	
	@Override
	public double getPrecio() {
		double salida=0;
		for(Comida c: this.comidasContenidas) {
			salida+=c.getPrecio();
		}
		return salida;
	}
	
	@Override
	public double getCalorias() {
		double salida=0;
		for(Comida c: this.comidasContenidas) {
			salida+=c.getCalorias();
		}
		return salida;
	}
	
	@Override
	public int getTiempoPreparacion() {
		int salida=0;
		for(Comida c: this.comidasContenidas) {
			salida+=c.getTiempoPreparacion();
		}
		return salida;
	}
	
	public void AgregarComidaContenida(Comida c) {
		this.comidasContenidas.add(c);
	}

	@Override
	public String toString() {
		return super.toString() + "ComidaCompleja [comidasContenidas=" + comidasContenidas + "]";
	}
	
	

}
