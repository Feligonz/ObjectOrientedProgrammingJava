package criterios;

import clases.Comida;
import clases.EstacionTrabajo;

public class CriterioModoPreparacion implements Criterio{
	private String modoPreparacion;
	
	public CriterioModoPreparacion(String m) {
		this.modoPreparacion=m;
	}
	
	@Override
	public boolean cumple(EstacionTrabajo e) {
		return e.getModosPreparacionPermitidos().contains(this.modoPreparacion);
	}

	@Override
	public boolean cumplePrecio(Comida c) {
		return c.getModoPreparacion().equals(this.modoPreparacion);
	}
}
