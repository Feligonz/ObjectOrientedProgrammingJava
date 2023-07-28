package criterios;

import clases.Comida;
import clases.EstacionTrabajo;

public class CriterioTipo implements Criterio{
	private String tipo;
	
	
	public CriterioTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public boolean cumple(EstacionTrabajo e) {
		return e.getTiposPermitidos().contains(this.tipo);
	}


	@Override
	public boolean cumplePrecio(Comida c) {
		return c.getTipo().equals(this.tipo);
	};
	
}
