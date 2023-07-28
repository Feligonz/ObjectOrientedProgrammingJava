package criterios;

import clases.Comida;
import clases.EstacionTrabajo;

public class CriterioTiempo implements Criterio{
	private Integer tiempo;

	public CriterioTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public boolean cumple(EstacionTrabajo e) {
		return e.getTiempoMaximo() >= this.tiempo;
	}

	@Override
	public boolean cumplePrecio(Comida c) {
		return c.getTiempoPreparacion() == this.tiempo;
	}
	
	
	
}
