package clases;

import java.util.ArrayList;

import criterios.Criterio;

public class Cocina {
	private ArrayList<EstacionTrabajo> estacionesTrabajo;
	private EstacionTrabajo porDefecto;
	private Criterio criterio;
	private double precioCumple;
	private double precioNoCumple;
	private double porcentaje;
	
	public Cocina(Criterio c, double precioC, double precioN, double porcen,EstacionTrabajo...e) {
	        this.estacionesTrabajo = new ArrayList<EstacionTrabajo>();
	        for(EstacionTrabajo s:e) {
	            this.estacionesTrabajo.add(s);
	        }
	        this.porDefecto = new EstacionTrabajo("porDefecto",0);
	        this.criterio=c;
	        this.precioCumple = precioC;
	        this.precioNoCumple = precioN;
	        this.porcentaje = porcen;
	}
	
	public void agregarEstacionTrabajo(EstacionTrabajo e) {
	    this.estacionesTrabajo.add(e);
	}
	
	public boolean eliminarEstacionTrabajo(EstacionTrabajo e) {
		return this.estacionesTrabajo.remove(e);
	}
	
	public EstacionTrabajo getEstacionPorDefecto() {
		return this.porDefecto;
	}
	
	public EstacionTrabajo buscarEstacion(Comida comida, Criterio c) {
		for(EstacionTrabajo e: this.estacionesTrabajo) {
			if(c.cumple(e))
				return e;
		}
		return this.porDefecto;
	}
	

	public double getPrecioCumple() {
		return precioCumple;
	}

	public void setPrecioCumple(double precioCumple) {
		this.precioCumple = precioCumple;
	}

	public double getPrecioNoCumple() {
		return precioNoCumple;
	}

	public void setPrecioNoCumple(double precioNoCumple) {
		this.precioNoCumple = precioNoCumple;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public void setCriterio(Criterio criterio) {
		this.criterio = criterio;
	}

	@Override
	public String toString() {
		return "Cocina [estacionesTrabajo=" + estacionesTrabajo + ", porDefecto=" + porDefecto + "]";
	}
	
	public double calcularCuenta(Mesa m) {
		double salida =0;
		ArrayList<Comida> aux = m.getComidas();
		for(Comida com : aux) {
			salida+= com.calcularPrecio(this.criterio, this.precioCumple, this.precioNoCumple, this.porcentaje); //preguntar si es mejor pasar cocina a comida en vez de todo esto
		}
		return salida;
	}
	
	
}
