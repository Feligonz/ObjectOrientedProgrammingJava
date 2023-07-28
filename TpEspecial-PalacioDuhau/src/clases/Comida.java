package clases;

import criterios.Criterio;

public class Comida {
	private String nombre;
	private String tipo;
	private String modoPreparacion;
	private double calorias;
	private double precio;
	private int tiempoPreparacion;
	
	public Comida(String nombre, String tipo, String modoPreparacion, double calorias, double precio,
			int tiempoPreparacion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.modoPreparacion = modoPreparacion;
		this.calorias = calorias;
		this.precio = precio;
		this.tiempoPreparacion = tiempoPreparacion;
	}
	
	public Comida(String nombre, String tipo, String modoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModoPreparacion() {
		return modoPreparacion;
	}

	public void setModoPreparacion(String modoPreparacion) {
		this.modoPreparacion = modoPreparacion;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	
	public double calcularPrecio(Criterio c, double precioCumple, double precioNoCumple, double porcentaje) {
		if (c.cumplePrecio(this)) {
            return (this.getPrecio()+precioCumple)+(this.getPrecio()+precioCumple) * porcentaje/100;
        }else
            return (this.getPrecio()+precioNoCumple)+(this.getPrecio()+precioNoCumple) * porcentaje/100;
    }
	
	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", tipo=" + tipo + ", modoPreparacion=" + modoPreparacion + ", calorias="
				+ calorias + ", precio=" + precio + ", tiempoPreparacion=" + tiempoPreparacion + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Comida aux = (Comida)o;
			return (this.getNombre().equals(aux.getNombre())
					&& this.getCalorias() == aux.getCalorias() 
					&& this.getTipo().equals(aux.getTipo())
					&& this.getModoPreparacion().equals(aux.getModoPreparacion())
					&& this.getPrecio() == aux.getPrecio()
					&& this.getTiempoPreparacion() == aux.getTiempoPreparacion());
		}catch(Exception e) {
			return false;
		}
	}
	
	
}
