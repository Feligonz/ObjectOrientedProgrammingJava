package clases;

import java.util.ArrayList;
import java.util.Collections;

public class Mesa {
	private ArrayList<Comida> comidas;
	private int numeroMesa;
	private String mozo;
	
	public Mesa(int numeroMesa, String mozo, Comida...com) {
		this.comidas = new ArrayList<Comida>();
		this.numeroMesa = numeroMesa;
		this.mozo = mozo;
		for(Comida c: com) {
			this.comidas.add(c);
		}
		
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public String getMozo() {
		return mozo;
	}

	public void setMozo(String mozo) {
		this.mozo = mozo;
	}
	
	public void agregarComida(Comida c) {
		this.comidas.add(c);
	}
	
	public boolean eliminarComida(Comida c) {
		return this.comidas.remove(c);
			
	}
	
	public ArrayList<Comida> getComidas(){ //preguntar sobre el error al castear como inmodificable
		ArrayList<Comida> aux = new ArrayList<Comida>();
		for(Comida c: this.comidas) {
			Comida comidaAux = new Comida(c.getNombre(),c.getTipo(),c.getModoPreparacion(),c.getCalorias(),c.getPrecio(),c.getTiempoPreparacion());
			aux.add(comidaAux);
		}
		return aux;
	}

	@Override
	public String toString() {
		return "Mesa [comidas=" + comidas + ", numeroMesa=" + numeroMesa + ", mozo=" + mozo + "]";
	}
	
	
}
