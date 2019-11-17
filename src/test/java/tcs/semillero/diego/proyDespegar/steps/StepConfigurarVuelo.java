package tcs.semillero.diego.proyDespegar.steps;

import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.proyDespegar.pageObjects.PageConfigurarVuelo;


public class StepConfigurarVuelo {
	PageConfigurarVuelo objPageConfigurarVuelo;
	@Step
	public void ingreso_al_navegador_y_a_la_pagina_web() throws Exception {
		objPageConfigurarVuelo.open();
	}

	@Step
	public void configurar_datos_basicos_del_vuelo(String ciudadOrigen, String ciudadDestino, String fechaIda, String fechaVuelta, int adultos, int infantes, String checkFecha, String claseVuelo) throws Exception {
		objPageConfigurarVuelo.getBtnLinkVuelos().click();
		Thread.sleep(2000);
		objPageConfigurarVuelo.getBtnSoloIda().click();
		objPageConfigurarVuelo.elegirCiudadOrigen(ciudadOrigen);
		objPageConfigurarVuelo.elegirCiudadDestino(ciudadDestino);
		objPageConfigurarVuelo.getBtnHabitacionesPersonas().click();
		objPageConfigurarVuelo.verificarCantidadPersonas(adultos, infantes);
		objPageConfigurarVuelo.seleccionarEdadInfantes(infantes);
		objPageConfigurarVuelo.seleccionarClaseVuelo(claseVuelo);
		objPageConfigurarVuelo.getBtnAplicar().click();
		objPageConfigurarVuelo.verificarCheckFechas(checkFecha, fechaIda, fechaVuelta);
	}

	@Step
	public void enviar_datos() throws Exception {
		objPageConfigurarVuelo.getBtnBuscar().click();
		Thread.sleep(2000);
		objPageConfigurarVuelo.elegirPrecioMasAlto();
		Thread.sleep(30000);
	}
}
