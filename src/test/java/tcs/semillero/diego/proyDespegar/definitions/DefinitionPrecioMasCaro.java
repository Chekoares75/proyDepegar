package tcs.semillero.diego.proyDespegar.definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import tcs.semillero.diego.proyDespegar.steps.StepPrecioMasCaro;

public class DefinitionPrecioMasCaro {
	@Steps
	StepPrecioMasCaro objStepPrecioMasCaro;
	@Then("^verficar el mayor precio$")
	public void verficar_el_mayor_precio() throws Exception {
		objStepPrecioMasCaro.verficar_el_mayor_precio();
	}
}
