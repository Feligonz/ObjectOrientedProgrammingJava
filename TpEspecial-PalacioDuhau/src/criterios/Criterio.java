package criterios;

import clases.Comida;
import clases.EstacionTrabajo;

public interface Criterio{
	public boolean cumple(EstacionTrabajo e);
	public boolean cumplePrecio(Comida c);
}
