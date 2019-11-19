package tcs.semillero.diego.proyDespegar.steps;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import tcs.semillero.diego.proyDespegar.pageObjects.PageConfigurarVuelo;
import tcs.semillero.diego.proyDespegar.pageObjects.PagePrecios;


public class StepConfigurarVuelo {
	PageConfigurarVuelo objPageConfigurarVuelo;
	PagePrecios objPagePrecios;
	@Step
	public void ingreso_al_navegador_y_a_la_pagina_web() throws Exception {
		objPageConfigurarVuelo.open();
	}

	@Step
	public void configurar_datos_basicos_del_vuelo(String ciudadOrigen, String ciudadDestino, String tipoVuelo, String fechaIda, String fechaVuelta, int adultos, int infantes, String checkFecha, String claseVuelo)  throws Exception {
		objPageConfigurarVuelo.getBtnLinkVuelos().click();
		Thread.sleep(2000);
		objPageConfigurarVuelo.elegirTipoVuelo(tipoVuelo,fechaIda,fechaVuelta);
		objPageConfigurarVuelo.elegirCiudadOrigen(ciudadOrigen);
		objPageConfigurarVuelo.elegirCiudadDestino(ciudadDestino);
		objPageConfigurarVuelo.getBtnHabitacionesPersonas().click();
		objPageConfigurarVuelo.verificarCantidadPersonas(adultos, infantes);
		objPageConfigurarVuelo.seleccionarEdadInfantes(infantes);
		objPageConfigurarVuelo.seleccionarClaseVuelo(claseVuelo);
		objPageConfigurarVuelo.getBtnAplicar().click();
		objPageConfigurarVuelo.verificarCheckFechas(checkFecha);
	}

	@Step
	public void enviar_datos() throws Exception {
		objPageConfigurarVuelo.getBtnBuscar().click();
		Thread.sleep(2000);
	}
	
	@Step
	public void verficar_el_mayor_precio(String resultadoEsperado) throws Exception {
		Thread.sleep(5000);
		objPagePrecios.seleccionarPrecioMayor();
		resultadoEsperado=resultadoEsperado.substring(1,resultadoEsperado.length()-1);
		Assert.assertEquals(Integer.parseInt(resultadoEsperado), objPagePrecios.getPrecioMayorNumero());
	}
	
	@Step
	public void verficar_el_menor_precio(String resultadoEsperado) throws Exception {
		Thread.sleep(5000);
		objPagePrecios.seleccionarPrecioMenor();
		resultadoEsperado=resultadoEsperado.substring(1,resultadoEsperado.length()-1);
		Assert.assertEquals((Integer.parseInt(resultadoEsperado)), objPagePrecios.getPrecioMenorNumero());
	}
}
