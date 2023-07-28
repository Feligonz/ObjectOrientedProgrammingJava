package clases;

import java.util.ArrayList;
import java.util.Collections;


public class EstacionTrabajo {
	private String nombre;
	private ArrayList<String> tiposPermitidos;
	private ArrayList<String> modoPreparacionPermitidos;
	private int tiempoMaximo;
	
	public EstacionTrabajo(String nombre, int tiempo) {
		this.modoPreparacionPermitidos = new ArrayList<String>();
		this.tiempoMaximo = tiempo;
		this.tiposPermitidos = new ArrayList<String>();
		this.nombre = nombre;
	}
	
	
	
	public void agregarTipoPermitido(String t) {
		if(!this.tiposPermitidos.contains(t))
			this.tiposPermitidos.add(t);
	}
	
	public boolean eliminarTipoPermitido(String t) {
		return this.tiposPermitidos.remove(t);
	}
	
	public void agregarModoPreparacionPermitido(String m) {
		if(!this.modoPreparacionPermitidos.contains(m))
			this.modoPreparacionPermitidos.add(m);
	}
	
	public boolean eliminarModoPreparacionPermitido(String m) {
		return this.modoPreparacionPermitidos.remove(m);
	}
	
	public void setTiempoMaximo(int i) {
		this.tiempoMaximo =i;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<String> getTiposPermitidos(){
		return (ArrayList<String>) Collections.unmodifiableCollection(this.tiposPermitidos);
	}
	
	public ArrayList<String> getModosPreparacionPermitidos(){
		return (ArrayList<String>) Collections.unmodifiableCollection(this.modoPreparacionPermitidos);
	}
	
	public int getTiempoMaximo() {
		return this.tiempoMaximo;
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			EstacionTrabajo aux = (EstacionTrabajo) o;
			
			return (this.getNombre().equals(aux.getNombre())
					&& this.getTiposPermitidos().containsAll(aux.getTiposPermitidos())
					&& this.getTiposPermitidos().size() == aux.getTiposPermitidos().size()
					&& this.getModosPreparacionPermitidos().containsAll(aux.getModosPreparacionPermitidos())
					&& this.getModosPreparacionPermitidos().size() == aux.getModosPreparacionPermitidos().size()
					&& this.getTiempoMaximo() == aux.getTiempoMaximo());
			
		}catch(Exception e) {
			return false;
		}
	}



	@Override
	public String toString() {
		return "EstacionTrabajo [nombre=" + nombre + ", tiposPermitidos=" + tiposPermitidos
				+ ", modoPreparacionPermitidos=" + modoPreparacionPermitidos + ", tiempoMaximo=" + tiempoMaximo + "]";
	}
	
	
	
}
