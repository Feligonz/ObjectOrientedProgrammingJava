package criterios;

import clases.Comida;
import clases.EstacionTrabajo;

public class CriterioAnd implements Criterio {
	private Criterio c1;
	private Criterio c2;
	
	
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(EstacionTrabajo e) {
		return (c1.cumple(e) && c2.cumple(e));
	}


	@Override
	public boolean cumplePrecio(Comida c) {
		return (c1.cumplePrecio(c) && c2.cumplePrecio(c));
	}

}
