package clases;

import java.util.ArrayList;
import criterios.*;

public class PalacioComidas {
	private ArrayList<Mesa> mesas;
	private Cocina cocina;
	private ArrayList<Comida> menu;
	
	public PalacioComidas(ArrayList<Mesa> mesas, Cocina cocina, ArrayList<Comida> menu) {
		this.mesas = mesas;
		this.cocina = cocina;
		this.menu = menu;
	}
	
	public double calcularCuentaMesa(Mesa m) {
		return this.cocina.calcularCuenta(m);
	}

	public static void main(String[] args) {
		
		//Mesas
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		
		Comida Asado = new Comida("Asado", "Carne", "Brazas", 2000, 3000, 180);
		Comida Locro = new Comida("Locro", "Estofado", "Holla", 5000, 1200, 60);
		Comida Mondongo= new Comida("Mondongo", "Estofado", "Holla", 50, 5000, 2);
		Comida Helado = new Comida("Helado", "Postre", "Frio", 500, 30, 240);
		
		Mesa mesa1 = new Mesa(1, "Juancito", Asado, Helado);
		Mesa mesa2 = new Mesa(2, "Marce", Locro, Helado);
		Mesa mesa3 = new Mesa(3, "Antonio", Mondongo, Helado);
		
		mesas.add(mesa1);
		mesas.add(mesa2);
		mesas.add(mesa3);
		
		//Cocina
		EstacionTrabajo Estacion1 = new EstacionTrabajo("Estacion1", 100);
		Estacion1.agregarModoPreparacionPermitido("Holla");
		Estacion1.agregarTipoPermitido("Estofado");
	
		EstacionTrabajo Estacion2 = new EstacionTrabajo("Estacion2", 200);
		Estacion2.agregarModoPreparacionPermitido("Brazas");
		Estacion2.agregarTipoPermitido("Carne");
		
		
		Criterio cModoPreparacion = new CriterioModoPreparacion("Frio");
		Criterio cTiempo = new CriterioTiempo(180);
		Criterio cAnd = new CriterioAnd(cModoPreparacion,cTiempo);
		Cocina cocina = new Cocina(cAnd, 100, 1000, 10, Estacion1, Estacion2);
		
		//Menu
		ArrayList<Comida> comidas = new ArrayList<Comida>();
		comidas.add(Helado);
		comidas.add(Mondongo);
		comidas.add(Locro);
		comidas.add(Asado);
		
		//Palacio
		
		PalacioComidas Duhau = new PalacioComidas(mesas, cocina, comidas);
		
		//***************************//
		
		System.out.println(Duhau.calcularCuentaMesa(mesa3));
		
	}
}
