package tcs.semillero.diego.proyDespegar.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.semillero.diego.proyDespegar.steps.StepConfigurarVuelo;

public class DefinitionConfiguracionVuelo {

	@Steps
	StepConfigurarVuelo objStepConfigurarVuelo;

	@Given("^Ingreso al navegador y a la pagina web$")
	public void ingreso_al_navegador_y_a_la_pagina_web() throws Exception {
		objStepConfigurarVuelo.ingreso_al_navegador_y_a_la_pagina_web();
	}

	@When("^configurar datos basicos del vuelo \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" (\\d+) (\\d+) \"([^\"]*)\" \"([^\"]*)\"$")
	public void configurar_datos_basicos_del_vuelo(String ciudadOrigen, String ciudadDestino, String tipoVuelo,
			String fechaIda, String fechaVuelta, int adultos, int infantes, String checkFecha, String claseVuelo)
			throws Exception {
		objStepConfigurarVuelo.configurar_datos_basicos_del_vuelo(ciudadOrigen, ciudadDestino, tipoVuelo, fechaIda,
				fechaVuelta, adultos, infantes, checkFecha, claseVuelo);
	}

	@Then("^enviar datos$")
	public void enviar_datos() throws Exception {
		objStepConfigurarVuelo.enviar_datos();
	}

	@Then("^verficar el mayor precio (.*)$")
	public void verficar_el_mayor_precio(String resultadoEsperado) throws Exception {
		objStepConfigurarVuelo.verficar_el_mayor_precio(resultadoEsperado);
	}

	@Then("^verficar el menor precio (.*)$")
	public void verficar_el_menor_precio(String resultadoEsperado) throws Exception {
		objStepConfigurarVuelo.verficar_el_menor_precio(resultadoEsperado);
	}
}
