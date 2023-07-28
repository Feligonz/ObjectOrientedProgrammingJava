package criterios;

import clases.Comida;
import clases.EstacionTrabajo;

public class CriterioNot implements Criterio{
	private Criterio c1;
	
	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(EstacionTrabajo e) {
		return !(c1.cumple(e));
	}

	@Override
	public boolean cumplePrecio(Comida c) {
		return !(c1.cumplePrecio(c));

	}

}
